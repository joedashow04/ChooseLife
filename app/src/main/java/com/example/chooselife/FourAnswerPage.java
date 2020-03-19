package com.example.chooselife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FourAnswerPage extends AppCompatActivity {
    Button aButton, bButton, cButton, dButton;
    TextView questionText;
    Intent returnIntent = new Intent();
    //TODO:
    //class_TraitQuestion cur_que = new class_TraitQuestion();
    //class_FutureQuestion fut_que = new class_FutureQuestion();
    //class_Helper Helper = new class_Helper();
    int stage = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_question_page);

        String[] info = getIntent().getStringArrayExtra("info");


        //Initialize Buttons and Question Prompt
        aButton = (Button)findViewById(R.id.buttonA);
        bButton = (Button)findViewById(R.id.buttonB);
        cButton = (Button)findViewById(R.id.buttonC);
        dButton = (Button)findViewById(R.id.buttonD);
        questionText = (TextView) findViewById(R.id.textView);

        //Set texts for Questions and Answers
        aButton.setText(info[1]);
        bButton.setText(info[2]);
        cButton.setText(info[3]);
        dButton.setText(info[4]);
        questionText.setText(info[0]);

    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK
                && event.getRepeatCount() == 0) {
            event.startTracking();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.isTracking()
                && !event.isCanceled()) {
            setResult(404);
            finish();
            return true;
        }
        return super.onKeyUp(keyCode, event);
    }

    public void aButton(View view) {
        returnIntent.putExtra("result", "a");
        //TODO: NOT NEEDED
        setResult(stage, returnIntent);
        finish();
    }
    public void bButton(View view){
        returnIntent.putExtra("result", "b");
        setResult(stage, returnIntent);
        finish();
    }
    public void cButton(View view){
        returnIntent.putExtra("result", "c");
        setResult(stage, returnIntent);
        finish();
    }
    public void dButton(View view){
        returnIntent.putExtra("result", "d");
        setResult(stage, returnIntent);
        finish();
    }

}