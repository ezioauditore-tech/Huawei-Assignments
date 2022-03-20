package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textview=findViewById(R.id.textView1);
        Intent i = getIntent();
        String text= i.getStringExtra("hey");
        String text2= i.getStringExtra("hello");

        textview.setText("Hey I'm "+text+" and I love "+text2+" so much.");
    }
}