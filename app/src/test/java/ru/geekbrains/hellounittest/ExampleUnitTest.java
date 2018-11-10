package ru.geekbrains.hellounittest;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(MockitoJUnitRunner.class)
public class ExampleUnitTest {

    private Phrases phrasesStub = mock(Phrases.class);

    public ExampleUnitTest(){
        when(phrasesStub.getAfternoon()).thenReturn("Добрый день!");
        when(phrasesStub.getEvening()).thenReturn("Добрый вечер!");
        when(phrasesStub.getHello()).thenReturn("Привет мир!");
        when(phrasesStub.getMorning()).thenReturn("Доброе утро!");
        when(phrasesStub.getNight()).thenReturn("Доброй ночи!");
    }




    @Test
    public void BuilderGreetingPhrase_get_test(){
        BuilderGreetingPhrase builderHello = new BuilderGreetingPhrase(phrasesStub);
        assertEquals("Привет мир!", builderHello.get());
    }

    @Test
    public void BuilderGreetingPhrase_getMorning_test(){
        BuilderGreetingPhrase builderHello = new BuilderGreetingPhrase(phrasesStub);
        String expected = "Доброе утро!";
        assertEquals(expected, builderHello.get(3));
        assertEquals(expected, builderHello.get(11));
    }

    @Test
    public void BuilderGreetingPhrase_getEvening_test(){
        BuilderGreetingPhrase builderHello = new BuilderGreetingPhrase(phrasesStub);
        String expected = "Добрый вечер!";
        assertEquals(expected, builderHello.get(17));
        assertEquals(expected, builderHello.get(23));
    }

    @Test
    public void BuilderGreetingPhrase_getAfternoon_test(){
        BuilderGreetingPhrase builderHello = new BuilderGreetingPhrase(phrasesStub);
        String expected = "Добрый день!";
        assertEquals(expected, builderHello.get(12));
        assertEquals(expected, builderHello.get(16));
    }

    @Test
    public void BuilderGreetingPhrase_getNight_test(){
        BuilderGreetingPhrase builderHello = new BuilderGreetingPhrase(phrasesStub);
        String expected = "Доброй ночи!";
        assertEquals(expected, builderHello.get(0));
        assertEquals(expected, builderHello.get(24));
        assertEquals(expected, builderHello.get(2));
        assertEquals(4, 4);
    }
}
