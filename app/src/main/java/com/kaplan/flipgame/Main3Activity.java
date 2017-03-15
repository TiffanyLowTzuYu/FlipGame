package com.kaplan.flipgame;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent mIntent = getIntent();

        ImageView playy = (ImageView) findViewById(R.id.play);
        playy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main3Activity.this, MainActivity.class);
                startActivity(intent);}});

        int intValue = mIntent.getIntExtra("intVariableName", 0);
        TextView score = (TextView)findViewById(R.id.score);
        score.setText("Total Score : "+ intValue);

        if ( intValue >=100){
            TextView say = (TextView)findViewById(R.id.say);
            say.setText("Congratulation !                                You've completed your assignment!");
            ImageView result =(ImageView)findViewById(R.id.result);
            final Bitmap color2 = BitmapFactory.decodeResource(getResources(), R.drawable.complete);
            result.setImageBitmap(color2);

        }
        else{
            TextView say = (TextView)findViewById(R.id.say);
            say.setText("Too Bad !                                         You're Failed !!!!");
            ImageView result =(ImageView)findViewById(R.id.result);
            final Bitmap color2 = BitmapFactory.decodeResource(getResources(), R.drawable.done);
            result.setImageBitmap(color2);
        }
    }}





