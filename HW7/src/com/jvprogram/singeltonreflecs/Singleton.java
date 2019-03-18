package com.jvprogram.singeltonreflecs;

public class Singleton {
    private static volatile com.jvprogram.singeltonreflecs.Singleton instance;

    public static com.jvprogram.singeltonreflecs.Singleton getInstance () {
        com.jvprogram.singeltonreflecs.Singleton localInstance = instance;
        if (localInstance == null) {
            synchronized (com.jvprogram.singeltonreflecs.Singleton.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new com.jvprogram.singeltonreflecs.Singleton();
                }
            }
        }
        return localInstance;
    }
}
