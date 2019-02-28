package com.mcersit.onnumara;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;



import java.util.Arrays;
import java.util.HashSet;

import java.util.Random;

public class TahminActivity extends AppCompatActivity {
    private TextView textView, textView2;
    private int sayac;
    private int random;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tahmin);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);

        HashSet<Integer> a = new HashSet<>();


        for (sayac = 1;  a.size()<10; sayac++) {
            Random r = new Random();
            int random = r.nextInt(80);
            a.add(random + 1);


        }

        textView.setText(String.valueOf(a));
                }

                            }







