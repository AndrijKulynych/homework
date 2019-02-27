package com.mateakademia.homework.homework2.task21;

class Computer {
    private String display = "";
    private String systemBlock = "";
    private String manipulators = "";

    public void setDisplay (String display) {

        this.display = display;
    }

    public void setSystemBlock (String systemBlock) {
        this.systemBlock = systemBlock;
    }

    public void setManipulators (String manipulators) {

        this.manipulators = manipulators;
    }
}

abstract class ComputerBuilder {
    private Computer computer;

    public Computer getComputer () {

        return computer;
    }

    public void createNewComputer () {
        computer = new Computer();
    }

    public abstract void buildSystemBlock ();

    public abstract void buildDisplay ();

    public abstract void buildManipulators ();
}