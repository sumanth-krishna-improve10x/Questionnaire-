package com.example.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ComponentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_components);
        Button radioBtn = findViewById(R.id.radio_btn);
        radioBtn.setOnClickListener(view -> {
            Intent radioIntent = new Intent(this, AnswerActivity.class);
        startActivity(radioIntent);
    });
         Button checkBoxBtn = findViewById(R.id.check_box_btn);
         checkBoxBtn.setOnClickListener(view1 -> {
             Intent intent1 = new Intent(this, CorrectAnswerActivity.class);
             startActivity(intent1);
        });

         Button dataComponentsBtn = findViewById(R.id.data_components_btn);
         dataComponentsBtn.setOnClickListener(view -> {
             Intent intent2 = new Intent(this, SetDateAndCalenderActivity.class);
             startActivity(intent2);
         });
    }
}