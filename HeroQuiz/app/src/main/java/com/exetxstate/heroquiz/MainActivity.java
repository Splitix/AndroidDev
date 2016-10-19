package com.exetxstate.heroquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    //Variable to hold our image button
    private ImageView heroButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Linking our Image from the XML page to our variable
        heroButton = (ImageView) findViewById(R.id.main_heroButton);

        //When the user clicks heroButton it does the function below
        heroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Goes to our second activity
                startActivity(new Intent(MainActivity.this, SecondActivity.class));

            }
        });



    }
}
