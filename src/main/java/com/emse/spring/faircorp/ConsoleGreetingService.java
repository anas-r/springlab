package com.emse.spring.faircorp;

import com.emse.spring.faircorp.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsoleGreetingService implements GreetingService {
    public void greet(String name) {
        System.out.println("Hello, " + name +"!");
    }
}
