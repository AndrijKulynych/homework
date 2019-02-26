package com.mate_akademia_homework.homework2.task21;

class BuilderExmpl {
    public static void main(String[] args) {
        Direct director = new Direct();
        ComputerBuilder cheapComputerBuilder = new CheapComputerBuilder();
        director.setComputerBuilder(cheapComputerBuilder);
        director.constructComputer();
        Computer mycomp = director.getComputer();
    
    }
}