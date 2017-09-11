package com.example.oscarjimenez.caesar_cypher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LandingPage extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.Caesar_Cypher.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);
    }


    /*
    TODO
    Give a welcome message and directions
    Add functionality to two buttons
    ENCODE
    DECODE

    make sure to add intents
     */
    public void goToEncode(View view){
        Intent toEncode = new Intent(this, Encode.class);
        startActivity(toEncode);
    }
}
