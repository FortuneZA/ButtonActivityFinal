package com.example.buttonactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

TextView tvMessage;
private String message;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

 message = getIntent().getStringExtra("messageKey");
tvMessage=(TextView)findViewById(R.id.userMessage);

tvMessage.setText(message);

        button = (Button)findViewById(R.id.button2);
      final   String popText ="Second Message Successfully Added !";


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Activity2.this,Activity3.class);
                Log.d("SECOND MESSAGE","TEST 2");
                message=message+", "+popText;
                intent.putExtra("messageKey",message);

                Toast.makeText(getApplicationContext(),"Moving to Act 3",Toast.LENGTH_SHORT)
                        .show();

                startActivity(intent);

            }
        });


    }


}
