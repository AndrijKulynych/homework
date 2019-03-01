package com.mateakademia.homework.homework2.task21;

class Direct {
    private ComputerBuilder computerBuilder;

    public void setComputerBuilder (ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer getComputer () {
        return computerBuilder.getComputer();
    }

    public void constructComputer () {
        computerBuilder.createNewComputer();
        computerBuilder.buildSystemBlock();
        computerBuilder.buildDisplay();
        computerBuilder.buildManipulators();
    }
}
