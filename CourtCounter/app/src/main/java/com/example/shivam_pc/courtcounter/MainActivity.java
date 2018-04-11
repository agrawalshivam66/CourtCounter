package com.example.shivam_pc.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static com.example.shivam_pc.courtcounter.R.id.ascore_text_view;
import static com.example.shivam_pc.courtcounter.R.id.bscore_text_view;

public class MainActivity extends AppCompatActivity {
    int n=0;
    int m=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void add3a(View view) {
        n=n+3;
        displaya((n));
    }
    public void add2a(View view) {
        n=n+2;
        displaya((n));
    }

    public void add1a(View view) {
        n=n+1;
        displaya((n));
    }
    public void add3b(View view) {
        m=m+3;
        displayb((m));
    }
    public void add2b(View view) {
        m=m+2;
        displayb((m));
    }

    public void add1b(View view) {
        m=m+1;
        displayb((m));
    }
    public void zero(View view) {
        n=0;
        m=0;
        displaya((n));
        displayb(m);
    }

    public void displaya(int number) {
        TextView quantityTextView = (TextView) findViewById(
                ascore_text_view);

        quantityTextView.setText("" + number);}
    public void displayb(int number) {
        TextView quantityTextView = (TextView) findViewById(
                bscore_text_view);

        quantityTextView.setText("" + number);
    }



    }

