package ru.geekbrains.hellounittest;

public class BuilderGreetingPhrase {
    public String get(){
        return "Привет мир!";
    }

    public String get(int hour){
        if (hour >= 3 && hour <= 11)
            return "Доброе утро!";
        return "Добрый вечер!";
    }
}
