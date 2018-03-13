package com.basic.nanodegree.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox q1_ch1,q1_ch2,q1_ch3,q1_ch4,
            q2_ch1,q2_ch2,q2_ch3,q2_ch4,
            q3_ch1,q3_ch2,q3_ch3,q3_ch4;
    RadioGroup radioGroup;
    RadioButton rb1,rb2,rb3;
    EditText answer;
    Button submit;

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        q1_ch1 = (CheckBox) findViewById(R.id.q1_ch1);
        q1_ch2 = (CheckBox) findViewById(R.id.q1_ch2);
        q1_ch3 = (CheckBox) findViewById(R.id.q1_ch3);
        q1_ch4 = (CheckBox) findViewById(R.id.q1_ch4);

        q2_ch1 = (CheckBox) findViewById(R.id.q2_ch1);
        q2_ch2 = (CheckBox) findViewById(R.id.q2_ch2);
        q2_ch3 = (CheckBox) findViewById(R.id.q2_ch3);
        q2_ch4 = (CheckBox) findViewById(R.id.q2_ch4);

        q3_ch1 = (CheckBox) findViewById(R.id.q3_ch1);
        q3_ch2 = (CheckBox) findViewById(R.id.q3_ch2);
        q3_ch3 = (CheckBox) findViewById(R.id.q3_ch3);
        q3_ch4 = (CheckBox) findViewById(R.id.q3_ch4);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton) findViewById(R.id.rb3);

        answer = (EditText) findViewById(R.id.answer);

        submit = (Button)findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score = 0;
                if (answer.getText().toString().trim().equals("xml"))
                    score++;
                if (q1_ch1.isChecked() &&q1_ch4.isChecked()&&!q1_ch3.isChecked() &&!q1_ch2.isChecked())
                    score++;
                if (q2_ch2.isChecked() &&q2_ch3.isChecked()&&!q2_ch1.isChecked() &&!q2_ch4.isChecked())
                    score++;
                if (q3_ch1.isChecked() &&q3_ch4.isChecked()&&!q3_ch2.isChecked() &&!q3_ch3.isChecked())
                    score++;


                int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();

                if (checkedRadioButtonId == R.id.rb2) {
                    score++;
                }

                Toast.makeText(MainActivity.this,"your Score is "+score,Toast.LENGTH_LONG).show();
            }
        });

    }
}
