package com.example.arduino;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

/**
 *  La classe MainActivity est l'élément principal . C'est la premiere page sur laquel
 *  l'utilisateur va tomber.
 * @autor Elbaz David,Isaac
 * @version 0.1
 * @see AppCompatActivity
 * @link https://developer.android.com/training/basics/firstapp/starting-activity?hl=fr
 *
 */
public class MainActivity extends AppCompatActivity {

    @Override
    /**
     * on crée un evenement "on create" qui est mis en place des que le téléphone s'allume
     * @link https://developer.android.com/codelabs/basic-android-kotlin-compose-activity-lifecycle?hl=fr#2
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /** on instancie un objet de type bouton et on le lie au bouton que l'on a implémenté dans
         * le activity_main.xml
         * reference */
        Button button = (Button) findViewById(R.id.btnconnect);
        /**on va être à l'ecoute  et récuperer les infos lorsqu'une personne appuyera sur le bouton */
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                 *  onClick on récup
                 */
                // on recupere pas pas les infos
                EditText name = (EditText) findViewById(R.id.editTextPersonName);
                EditText pwd = (EditText) findViewById(R.id.editTextPwd);
                String username = name.getText().toString();
                String password = pwd.getText().toString();
                if (CheckUserPass(username,password)){
                    Toast.makeText(MainActivity.this,"Connexion réussie, SafeFinger est la pour vous aider !",Toast.LENGTH_SHORT).show();
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

    /**
     * Méthode qui permet de verifier si l'utilisateur entre bien le bon mot de passe
     * @param password
     * @return true or false
     */
    public boolean CheckUserPass(String username, String password){
        return password.equals("safefinger");
    }

}