package com.example.katayama.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

    }


    public void onClick(View v){
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        EditText editText1 = (EditText)findViewById(R.id.editText1);
        EditText editText2 = (EditText)findViewById(R.id.editText2);
        String number1 = editText1.getText().toString();
        String number2 = editText2.getText().toString();
        double result1 = Double.valueOf(number1);
        double result2 = Double.valueOf(number2);
        //int value1 = Integer.parseInt(number1);
        //int value2 = Integer.parseInt(number2);
//        double result1 = (double)value1;
//        double result2 = (double)value2;


        switch (v.getId()) {
            case R.id.button1:
                intent.putExtra("RESULT", result1 + result2);
                break;
            case R.id.button2:
                intent.putExtra("RESULT", result1 - result2);
                break;
            case R.id.button3:
                intent.putExtra("RESULT", result1 * result2);
                break;
            case R.id.button4:
                intent.putExtra("RESULT", result1 / result2);
                break;
        }
        startActivity(intent);

    }
}
