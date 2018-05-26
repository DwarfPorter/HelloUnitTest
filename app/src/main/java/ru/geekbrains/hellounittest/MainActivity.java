package ru.geekbrains.hellounittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BuilderGreetingPhrase builderHello = new BuilderGreetingPhrase();
        TextView greet = findViewById(R.id.Greet);
        greet.setText(builderHello.get(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)));
    }
}
