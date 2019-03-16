package com.mateakademija.homework2.task21;

class CheapComputerBuilder extends ComputerBuilder {

    public void buildSystemBlock () {
        getComputer().setSystemBlock("ComboBox");
    }

    public void buildDisplay () {
        getComputer().setDisplay("JVS");
    }

    public void buildManipulators () {
        getComputer().setManipulators("mouse_keybrd");
    }
}