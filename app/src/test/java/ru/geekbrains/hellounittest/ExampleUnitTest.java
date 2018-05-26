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

    @Test
    public void BuilderGreetingPhrase_getMorning_test(){
        BuilderGreetingPhrase builderHello = new BuilderGreetingPhrase();
        assertEquals("Доброе утро!", builderHello.get(3));
        assertEquals("Доброе утро!", builderHello.get(11));
    }

    @Test
    public void BuilderGreetingPhrase_getEvening_test(){
        BuilderGreetingPhrase builderHello = new BuilderGreetingPhrase();
        assertEquals("Добрый вечер!", builderHello.get(17));
        assertEquals("Добрый вечер!", builderHello.get(23));
    }
}