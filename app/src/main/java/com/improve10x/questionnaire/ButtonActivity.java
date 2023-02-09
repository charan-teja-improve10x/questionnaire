package com.improve10x.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ButtonActivity extends AppCompatActivity {
    Button radioButtonsBtn;
    Button checkBoxesBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        handleInitViews();
        handleRadioButtonBtn();
        handleCheckBoxBtn();
    }

    private void handleCheckBoxBtn() {
        checkBoxesBtn.setOnClickListener(v -> {
            Intent checkActivityIntent = new Intent(this,CeckBoxActivity.class);
            startActivity(checkActivityIntent);
        });
    }

    private void handleRadioButtonBtn() {
        radioButtonsBtn.setOnClickListener(view -> {
            Intent radioActivityIntent = new Intent(this,RadioButtonActivity.class);
            startActivity(radioActivityIntent);
        });
    }

    private void handleInitViews() {
        radioButtonsBtn = findViewById(R.id.radio_button_btn);
        checkBoxesBtn = findViewById(R.id.check_box_btn);
    }
}