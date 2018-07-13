package com.my.project.sprint.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class HelloWorldExampleTest {
    private final HelloWorldExample helloWorldExample = new HelloWorldExample();

    @Test
    public void WHEN_asked_for_greeting_THEN_hello_world_should_be_returned() {
        assertTrue(HelloWorldExample.HELLO_WORLD.equals(helloWorldExample.sayHello()));
    }

    @Test
    public void WHEN_asked_for_greeting_THEN_response_should_be_not_null() {
        assertNotNull(helloWorldExample.sayHello());
    }


}
