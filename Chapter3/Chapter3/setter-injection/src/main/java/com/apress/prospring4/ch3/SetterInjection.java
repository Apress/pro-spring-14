package com.apress.prospring4.ch3;

public class SetterInjection {
    private Dependency dependency;

    public void setDependency(Dependency dependency) {
        this.dependency = dependency; 
    }

    @Override
    public String toString() {
        return dependency.toString();
    }
}
