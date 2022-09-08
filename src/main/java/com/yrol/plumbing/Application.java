package com.yrol.plumbing;

import com.yrol.plumbing.camera.Camera;
import com.yrol.plumbing.car.Car;
import com.yrol.plumbing.car.Doors;
import com.yrol.plumbing.car.Engine;
import com.yrol.plumbing.car.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	/**
	 * Method:1 of DI
	 * Need to create the Car object as Bean (see below) to make it available to the SpringContext.
	 * or else a Repository can also be created for teh Car object and then Autowire it
	 * */
	@Autowired
	Car car;

	/**
	 * Method:2 of DI
	 * Making the Camera object available to SpringContext via ManufactureConfig configuration class
	 * */
	@Autowired
	Camera camera;

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

}
