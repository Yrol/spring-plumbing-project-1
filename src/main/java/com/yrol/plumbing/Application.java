package com.yrol.plumbing;

import com.yrol.plumbing.camera.Camera;
import com.yrol.plumbing.car.Car;
import com.yrol.plumbing.car.Doors;
import com.yrol.plumbing.car.Engine;
import com.yrol.plumbing.car.Tyres;
import com.yrol.plumbing.computer.Computer;
import com.yrol.plumbing.computer.HardDrive;
import com.yrol.plumbing.computer.Memory;
import com.yrol.plumbing.computer.Processor;
import com.yrol.plumbing.document.Document;
import com.yrol.utils.BallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * scanBasePackages - will allow to include packages outside the main package. "com.yrol.utils" - is an external package in this case.
 * In this case we MUST specify the default package whcih is "com.yrol.plumbing".
 * */
@SpringBootApplication(scanBasePackages = {"com.yrol.plumbing", "com.yrol.utils"})
public class Application {

	/**
	 * Method:1 of DI - Field injection
	 * Need to create the Car object as Bean (see below) to make it available to the SpringContext.
	 * or else an interface can also be created for the Car object and then Autowire it
	 * */
	@Autowired
	Car car;

	/**
	 * Method:2 of DI - via a Configuration class
	 * Making the Camera object available to SpringContext via ManufactureConfig configuration class
	 * */
	@Autowired
	Camera camera;

	/**
	 * Method:3 of DI - via services
	 *  Making the Document object available to SpringContext via DocumentService service class
	 * */
	@Autowired
	Document document;

	/**
	 * Method:3 of DI -  via an external package
	 * Using a service defined in another package: com.yrol.utils
	 * */
	@Autowired
	BallService ballService;

	/**
	 * Method:4 of DI - Setter injection (setComputer)
	 * A Bean must be set - see newComputer below
	 * Must use @Autowired (try debug without)
	 * */

	private Computer computer;

	@Autowired
	public void setComputer(Computer computer) {
		this.computer = computer;
	}


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	/**
	 * Creating the Car object in order for the Autowired to work. i.e. adding the Car object to SpringContext and make it available.
	 * */
	@Bean
	public Car newCar() {

		Engine e = new Engine();
		Doors d = new Doors();
		Tyres t = new Tyres();

		return new Car(d, t, e);
	}

	/**
	 * Adding a Bean to the SpringContext to be used in the Setter Injection.
	 * */
	@Bean
	Computer newComputer() {

		HardDrive hd = new HardDrive();
		Memory m = new Memory();
		Processor p = new Processor();

		return new Computer(hd, m, p);
	}

}
