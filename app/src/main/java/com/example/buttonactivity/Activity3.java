package com.example.buttonactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {

TextView tvMessage;
private String message;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        message = getIntent().getStringExtra("messageKey");
        tvMessage=(TextView)findViewById(R.id.userMessage2);
        tvMessage.setText(message);

        Button button = findViewById(R.id.button3);
        final String popText="3rd Message added successfully!";

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity3.this,MainActivity.class);
                message=message+" , "+popText;
                intent.putExtra("messageKey",message);
                startActivity(intent);
            }
        });


        };
    }

