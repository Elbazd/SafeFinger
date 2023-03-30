package com.example.arduino;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //on instancie un objet de type bouton
        Button button = (Button) findViewById(R.id.btnconnect);
        //on va écouter et récuperer les infos lorsqu'une personne appuyera sur le bouton
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // on recupere pas pas les infos
                EditText name = (EditText) findViewById(R.id.editTextPersonName);
                EditText pwd = (EditText) findViewById(R.id.editTextPwd);
                String username = name.getText().toString();
                String password = pwd.getText().toString();
                if (ChechUserPass(username,password)){
                    Toast.makeText(MainActivity.this,"Welcome in Transbot the futur of the word",Toast.LENGTH_SHORT).show();
                    Intent intent2 = new Intent(MainActivity.this,MainActivity2.class);
                    EditText editText = (EditText)findViewById(R.id.editTextPersonName);
                    String message = editText.getText().toString();
                    intent2.putExtra("myMessage",message);
                    startActivity(intent2);
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);


                }

            }
        });


    }
    public boolean ChechUserPass(String username, String password){

        return password.equals("transbot");
    }
}