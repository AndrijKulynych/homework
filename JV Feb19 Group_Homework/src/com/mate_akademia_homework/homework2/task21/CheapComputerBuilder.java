package com.mate_akademia_homework.homework2.task21;

class CheapComputerBuilder extends ComputerBuilder {
    public void buildSystemBlock() {
        computer.setSystemBlock("ComboBox");
    }
    public void buildDisplay() {
        computer.setDisplay("JVS");
    }
    public void buildManipulators() {
        computer.setManipulators("mouse_keybrd");
    }
}