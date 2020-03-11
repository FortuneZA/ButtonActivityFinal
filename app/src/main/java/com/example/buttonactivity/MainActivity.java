package com.example.buttonactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String userMessage = getIntent().getStringExtra("ABC...");
        TextView displayText = findViewById(R.id.Title);
        displayText.setText(userMessage);


        button=findViewById(R.id.button);

        final EditText input =(EditText) findViewById(R.id.inputText);

        button.setOnClickListener(new View.OnClickListener()


        {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,Activity2.class);

                String message = input.getText().toString();
                intent.putExtra("messageKey",message);

                Toast.makeText(getApplicationContext(),"Moving to Act 2",Toast.LENGTH_SHORT)
                .show();


                startActivity(intent);

            }
        });
    }


}
