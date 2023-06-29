package com.example.arduino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String msg = intent.getStringExtra("myMessage");

        TextView tV3= (TextView)findViewById(R.id.textView3);
        tV3.setText("Gérez vos utilisateurs comme bon vous le semble !");

        Button button1 = (Button) findViewById(R.id.btnCommande);
        /**on récupere les infos lorsqu'une personne appuyera sur le bouton */
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity2.class);
                startActivity(intent);
            }
        });
        Button button2 = (Button) findViewById(R.id.btnLoca);
        /**on récupere les infos lorsqu'une personne appuyera sur le bouton */
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        });

        Button button3 = (Button) findViewById(R.id.btnSuppr);
        /**on récupere les infos lorsqu'une personne appuyera sur le bouton */
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);

                startActivity(intent);
            }
        });


    }
}