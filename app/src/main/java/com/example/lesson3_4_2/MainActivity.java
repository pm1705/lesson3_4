package com.example.lesson3_4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    int i=0;
    int m=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button);
    }

    public void clicked(View view) {
        if(i==7){
            button.setText("BA DA BOOM!");
            i=1;
        }
        else{
            button.setText("Click number :"+m);
            i++;
        }
        m++;
    }
}