package com.mateakademia.homework.homework2.task22.Localclaspak;

class ExplLocal {
    String strO = "ExplLocal";

    void printVars() {
        final int i = 10;

        class Local {
            String strL = "Local";

            void printLocal() {
                System.out.println("strL: " + strL);
                System.out.println("strO: " + strO);
                System.out.println("finalInt: " + i);
            }
        }

        Local local = new Local();
        local.printLocal();
    }

    public static void main (String[] args) {
        ExplLocal o = new ExplLocal();
        o.printVars();
    }
}