package com.apress.prospring4.ch3;

public class ConstructorInjection {
    private Dependency dependency;

    public ConstructorInjection(Dependency dependency) {
        this.dependency = dependency; 
    }

    @Override
    public String toString() {
        return dependency.toString();
    }
}
