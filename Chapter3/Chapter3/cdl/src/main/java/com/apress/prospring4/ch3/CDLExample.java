package com.apress.prospring4.ch3;

public class CDLExample {
    public static void main(String[] args) {
    	Container container = new DefaultContainer();

    	ManagedComponent managedComponent = new ContextualizedDependencyLookup();
    	managedComponent.performLookup(container);

    	System.out.println(managedComponent);
    }
}
