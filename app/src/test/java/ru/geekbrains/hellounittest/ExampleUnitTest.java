package ru.geekbrains.hellounittest;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void BuilderGreetingPhrase_get_test(){
        BuilderGreetingPhrase builderHello = new BuilderGreetingPhrase();
        assertEquals("Привет мир!", builderHello.get());
    }
}