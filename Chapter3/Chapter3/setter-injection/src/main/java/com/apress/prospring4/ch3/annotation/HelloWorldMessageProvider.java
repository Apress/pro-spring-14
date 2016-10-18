package com.apress.prospring4.ch3.annotation;

import org.springframework.stereotype.Service;
import com.apress.prospring4.ch3.MessageProvider;

@Service("messageProvider")
public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
