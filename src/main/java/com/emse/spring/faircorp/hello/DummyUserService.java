package com.emse.spring.faircorp.hello;

import com.emse.spring.faircorp.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;


@Service
public class DummyUserService implements UserService {

    @Autowired
    private GreetingService greetingService;

    @Override
    public void greetAll() {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("Elodie","Charles"));
        for (String i : list)
            greetingService.greet(i);
        }
    }

