package com.exetxstate.heroquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SecondActivity extends AppCompatActivity {

    //Variables for the Radio Groups
    private RadioGroup speedGroup;
    private RadioGroup flyGroup;
    private RadioGroup richGroup;

    //Variables to hold the Radio Groups answer.
    private RadioButton speedAns;
    private RadioButton flyAns;
    private RadioButton richAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Links the radio group to the correct group on the XML page
        speedGroup = (RadioGroup) findViewById(R.id.second_speedRadioGroupId);
        flyGroup = (RadioGroup) findViewById(R.id.second_flyRadioGroupId);
        richGroup = (RadioGroup) findViewById(R.id.second_richRadioGroupId);



    }
}
