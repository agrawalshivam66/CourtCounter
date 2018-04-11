package com.example.shivam_pc.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView text = new TextView(this);
        text.setText("Wow!!!");
        setContentView(text);
        text.setTextSize(40);
        text.setTextColor(Color.GREEN);

    }
}
