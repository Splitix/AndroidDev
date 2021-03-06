package com.exetxstate.rps;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //This is the area where we create a variable to store the XML Objects
    //Notice how the data types are named after the XML object type.
    ImageView rockButton;
    ImageView paperButton;
    ImageView scissorButton;
    ImageView zombieChoice;
    private TextView results;
    private String list[] = {"Rock", "Paper", "Scissors"};
    private int images[] = {R.drawable.rock, R.drawable.paper, R.drawable.scissors};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //This small area is used for linking the XML object to the Java Variable
        //We do this by setting the XML id to the Java Variable
        rockButton = (ImageView) findViewById(R.id.buttonRock);
        paperButton = (ImageView) findViewById(R.id.buttonPaper);
        scissorButton = (ImageView) findViewById(R.id.buttonScissors);
        zombieChoice = (ImageView) findViewById(R.id.titleId);
        results = (TextView) findViewById(R.id.textViewId);

        //An onClickListener waits for the button to be pressed before doing what is in its function
        //This onClickListener is used to control what happens when the rock button is pressed.
        rockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //First is to create a random number between 0-2.
                Random randNum = new Random();
                int rand = randNum.nextInt(list.length);

                //Display the correct image on the screen based on what the computer selected.
                zombieChoice.setImageResource(images[rand]);

                //Determines if the user won/lost/tied. Sets the test accordingly.
                if(list[rand].equals("Scissors")){
                    //R.string.winText is the text set from the strings.xml file.
                    results.setText(list[rand] + "," + getString(R.string.winText));
                }else if(list[rand].equals("Paper")){
                    results.setText(list[rand] + "," + getString(R.string.loseText));
                }else{
                    results.setText(list[rand] + "," + getString(R.string.tieText));
                }
            }
        });

        paperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //First is to create a random number between 0-2.
                Random randNum = new Random();
                int rand = randNum.nextInt(list.length);

                //Display the correct image on the screen based on what the computer selected.
                zombieChoice.setImageResource(images[rand]);

                //Determines if the user won/lost/tied. Sets the test accordingly.
                if(list[rand].equals("Rock")){
                    //R.string.winText is the text set from the strings.xml file.
                    results.setText(list[rand] + "," + getString(R.string.winText));
                }else if(list[rand].equals("Scissors")){
                    results.setText(list[rand] + "," + getString(R.string.loseText));
                }else{
                    results.setText(list[rand] + "," + getString(R.string.tieText));
                }
            }
        });

        scissorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //First is to create a random number between 0-2.
                Random randNum = new Random();
                int rand = randNum.nextInt(list.length);

                //Display the correct image on the screen based on what the computer selected.
                zombieChoice.setImageResource(images[rand]);

                //Determines if the user won/lost/tied. Sets the test accordingly.
                if(list[rand].equals("Paper")){
                    //R.string.winText is the text set from the strings.xml file.
                    results.setText(list[rand] + "," + getString(R.string.winText));
                }else if(list[rand].equals("Rock")){
                    results.setText(list[rand] + "," + getString(R.string.loseText));
                }else{
                    results.setText(list[rand] + "," + getString(R.string.tieText));
                }
            }
        });

    }
}
