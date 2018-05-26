package ru.geekbrains.hellounittest;

public class BuilderGreetingPhrase {
    public String get(){
        return "Привет мир!";
    }

    public String get(int hour){
        if (hour >= 3 && hour <= 11)
            return "Доброе утро!";
        if (hour >=17 && hour <= 23)
            return "Добрый вечер!";
        if (hour >=12 && hour <= 16)
            return "Добрый день!";
        return "Доброй ночи!";
    }
}
