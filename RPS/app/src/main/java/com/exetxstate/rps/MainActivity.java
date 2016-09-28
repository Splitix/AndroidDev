package com.exetxstate.rps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button shootButton;
    private TextView results;
    private String list[] = {"Rock", "Paper", "Scissors"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shootButton = (Button) findViewById(R.id.buttonId);
        results = (TextView) findViewById(R.id.textViewId);

        shootButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randNum = new Random();
                int rand = randNum.nextInt(list.length);
                results.setText(list[rand]);
            }
        });

    }
}
