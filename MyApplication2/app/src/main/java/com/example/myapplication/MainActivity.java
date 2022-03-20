package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button clickme;
    EditText name, love;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickme=findViewById(R.id.clickme);
        name=findViewById(R.id.name);
        love=findViewById(R.id.love);

        clickme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String N = name.getText().toString();
                String L = love.getText().toString();
                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("hey",N);
                i.putExtra("hello",L);
                startActivity(i);
            }
        });
    }
}