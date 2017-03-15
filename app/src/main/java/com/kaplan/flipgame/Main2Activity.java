package com.kaplan.flipgame;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {


    ImageView imageView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btn = (Button) findViewById(R.id.increase);
        Intent intent = getIntent();
        btn.setOnClickListener(new View.OnClickListener() {
            int minteger = 0;


            @Override
            public void onClick(View view) {
                    minteger = minteger + 1;
                    display(minteger);}
            private void display(int number) {
                TextView displayInteger = (TextView) findViewById(
                        R.id.score);
                displayInteger.setText("Score : " + number);

            }

            {
                new CountDownTimer(17000, 1000) {

                    TextView time = (TextView)findViewById(R.id.time);
                    public void onTick(long millisUntilFinished) {
                        time.setText("Seconds remaining: " + millisUntilFinished / 1000);

                    }

                    public void onFinish() {

                        time.setText("Time's up !");
                        Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                        startActivity(intent);
                        Intent myIntent = new Intent(Main2Activity.this, Main3Activity.class);
                        myIntent.putExtra("intVariableName", minteger);
                        startActivity(myIntent);


                    }

                }.start();
            }});}}


