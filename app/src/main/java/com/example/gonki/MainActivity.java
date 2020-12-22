package com.example.gonki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import android.view.view;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startGameAction(View view) {
        Intent intent = new Intent ( packageContext:this, GameActivity.class);
        startActivity(intent);
    }

    public void closeAction(View view) {
        System.exit(status: 0);
    }



    public void changePlayerAction (View view) {
        final EditText input = new EditText(context:this);
        AlertDialog.Builder builder = new AlertDialog.Dialog(context:MainActivity.this)
        builder.setTitle("Setting player name");
        builder.setMessage("Enter new player name");
        builder.setView(input);
        builder.setNegativeButton(textid:"cancel", new Dia)
        @Override
        public void onClick (DialogInterface dialog,int which){
            Toast.makeText(getApplicationContext(), text:"Canceled", Toast.LENGTH_LONG).show();
        }
    });
        builder.stePositiveButton(text: "Confirm", new DialogInterface.OnClickListener(){
            @Override
                    public void onClick(DialogInterface dialog, int which) {
                if (input.getText().length() !=0) {
                    Data.playerName = input.getText().toString();
                    Toast.makeText(getApplicationContext(), text: "You are changing name to: " + Data.playerName, Toast.LENGTH_LONG).show();

                } else {
                    Toast.makeText(getApplicationContext(), text: "Name not saved, input is clear", Toast.LENGTH_LONG).show();
                }
        }
    })
        builder.show();
    }