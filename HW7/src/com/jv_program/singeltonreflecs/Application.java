package com.jv_program.singeltonreflecs;

import java.lang.reflect.Method;

public class Application {
    public static void main (String[] args) {
        AppSingleTon appSingleTon = new AppSingleTon();
        Class <? extends AppSingleTon> refl = appSingleTon.getClass();
        try {
            Method changeMetod =refl.getMethod("getSomeThing");

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
