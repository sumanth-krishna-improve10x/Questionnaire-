package com.example.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CorrectAnswerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct_answer);
        Button verifyBtn = findViewById(R.id.verify_btn);
        verifyBtn.setOnClickListener(view -> {

            CheckBox mercuryCb = findViewById(R.id.mercury_cb);
            CheckBox sunCb = findViewById(R.id.sun_cb);
            CheckBox moonCb = findViewById(R.id.moon_cb);
            CheckBox jupiterCb = findViewById(R.id.jupiter_cb);
            CheckBox saturnCb = findViewById(R.id.saturn_cb);
            CheckBox plutoCb = findViewById(R.id.pluto_cb);
            if (mercuryCb.isChecked() && jupiterCb.isChecked() && saturnCb.isChecked() &&
                    !sunCb.isChecked() && !moonCb.isChecked() && !plutoCb.isChecked()) {
                Toast.makeText(this, "Your answer is right ", Toast.LENGTH_SHORT).show();


                if (mercuryCb.isChecked()) {
                    Toast.makeText(this, "true", Toast.LENGTH_SHORT).show();
                }


                if (sunCb.isChecked()) {
                    Toast.makeText(this, "false", Toast.LENGTH_SHORT).show();
                }


                if (moonCb.isChecked()) {
                    Toast.makeText(this, "false", Toast.LENGTH_SHORT).show();
                }


                if (jupiterCb.isChecked()) {
                    Toast.makeText(this, "true", Toast.LENGTH_SHORT).show();
                }


                if (saturnCb.isChecked()) {
                    Toast.makeText(this, "true", Toast.LENGTH_SHORT).show();
                }


                if (plutoCb.isChecked()) {
                    Toast.makeText(this, "false", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}








