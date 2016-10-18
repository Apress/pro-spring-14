package com.apress.prospring4.ch3;

public class Singleton {
    private static Singleton instance;

    static {
        instance = new Singleton(); 
    }

    public static Singleton getInstance() {
        return instance; 
    }
}
