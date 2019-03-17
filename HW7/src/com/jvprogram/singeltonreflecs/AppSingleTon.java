package com.jv_program.singeltonreflecs;

public class AppSingleTon {

    private static volatile AppSingleTon myObj;

    public static AppSingleTon getInstance () {
        AppSingleTon localInst = myObj;

        if (localInst == null) {
            synchronized (AppSingleTon.class) {
                localInst = myObj;
                if (localInst == null) {
                    myObj = localInst = new AppSingleTon();
                }
            }
        }
        return localInst;
    }
}

