package com.apress.prospring4.ch3.xml;

import com.apress.prospring4.ch3.MessageProvider;

public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
