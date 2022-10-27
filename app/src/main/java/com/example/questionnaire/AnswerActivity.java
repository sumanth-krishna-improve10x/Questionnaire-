package com.example.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class AnswerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        Button verifyBtn = findViewById(R.id.verify_btn);
        verifyBtn.setOnClickListener(view -> {
            RadioButton answerRb1 = findViewById(R.id.answer_rb1);
            if (answerRb1.isChecked()) {
                Toast.makeText(this, "false", Toast.LENGTH_SHORT).show();
            }

            RadioButton answerRb2 = findViewById(R.id.answer_rb2);
            if (answerRb2.isChecked()) {
                Toast.makeText(this, "true", Toast.LENGTH_SHORT).show();
            }

            RadioButton answerRb3 = findViewById(R.id.answer_rb3);
            if (answerRb3.isChecked()) {
                Toast.makeText(this, "false", Toast.LENGTH_SHORT).show();
            }

            RadioButton answerRb4 = findViewById(R.id.answer_rb4);
            if (answerRb4.isChecked()) {
                Toast.makeText(this, "false", Toast.LENGTH_SHORT).show();
            }

        });
    }
}
