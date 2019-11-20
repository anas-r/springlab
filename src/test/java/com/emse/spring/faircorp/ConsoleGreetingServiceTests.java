package com.emse.spring.faircorp;

import org.hamcrest.Matchers;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.boot.test.rule.OutputCapture;

import static org.junit.jupiter.api.Assertions.*;

class ConsoleGreetingServiceTests {
    @Rule
    public OutputCapture outputCapture = new OutputCapture();

    @Test
    public void testGreeting() {
        ConsoleGreetingService greetingService = new ConsoleGreetingService(); // 1
        greetingService.greet("Spring");
        outputCapture.expect(Matchers.startsWith("Hello, Spring!"));
    }
}