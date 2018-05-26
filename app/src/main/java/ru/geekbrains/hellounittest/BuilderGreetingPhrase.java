package ru.geekbrains.hellounittest;

public class BuilderGreetingPhrase {

    private Phrases phrases;

    public BuilderGreetingPhrase(Phrases phrases){

        this.phrases = phrases;
    }

    public String get(){
        return phrases.getHello();
    }

    public String get(int hour){
        if (hour >= 3 && hour <= 11)
            return phrases.getMorning();
        if (hour >=17 && hour <= 23)
            return phrases.getEvening();
        if (hour >=12 && hour <= 16)
            return phrases.getAfternoon();
        return phrases.getNight();
    }
}
