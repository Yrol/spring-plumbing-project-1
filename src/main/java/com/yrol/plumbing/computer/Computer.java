package com.yrol.plumbing.computer;

public class Computer {

    private HardDrive hardDrive;

    private  Memory memory;

    private Processor processor;

    public Computer(){}

    public Computer(HardDrive hardDrive, Memory memory, Processor processor) {
        this.hardDrive = hardDrive;
        this.memory = memory;
        this.processor = processor;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }
}
