package com.mateakademija.homework2.task21;

class BuilderExmpl {

    public static void main (String[] args) {
        Direct director = new Direct();
        ComputerBuilder cheapComputerBuilder = new CheapComputerBuilder();
        director.setComputerBuilder(cheapComputerBuilder);
        director.constructComputer();
        Computer computer = director.getComputer();
    }
}