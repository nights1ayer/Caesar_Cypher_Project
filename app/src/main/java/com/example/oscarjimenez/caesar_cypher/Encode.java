package com.example.oscarjimenez.caesar_cypher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Encode extends AppCompatActivity {
    public static final String MESSAGE = "com.example.Caesar_Cypher.MESSAGE";
    public static final String NUMBER = "com.example. Caesar_Cypher.NUMBER";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encode);
    }
    // reacts to a button press
    public void sendMessage(View view){
        Intent sendM = new Intent(this, Result.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        CC cypher = new CC(editText.getText().toString());
        String message = cypher.getMessage();
        int number = cypher.getKey();
        sendM.putExtra(MESSAGE, message);
        sendM.putExtra(NUMBER, number);
        startActivity(sendM);
    }

}
