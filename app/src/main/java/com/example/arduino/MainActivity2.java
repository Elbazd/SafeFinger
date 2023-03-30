package com.example.arduino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String msg = intent.getStringExtra("myMessage");

        TextView tV3= (TextView)findViewById(R.id.textView3);
        tV3.setText("            "+"        "+"Bonjour "+"  "+msg+" "+" soyez le bienvenue !");
    }
}