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
        handleRadioButtonBtnClick();
        handleCheckBoxBtnClick();
    }
    private void handleInitViews() {
        radioButtonsBtn = findViewById(R.id.radio_button_btn);
        checkBoxesBtn = findViewById(R.id.check_box_btn);
    }

    private void handleCheckBoxBtnClick() {
        checkBoxesBtn.setOnClickListener(v -> {
            navigateToCheckBoxActivity();
        });
    }

    private void handleRadioButtonBtnClick() {
        radioButtonsBtn.setOnClickListener(view -> {
            navigateToRadioButtonActivity();
        });
    }
    private void navigateToRadioButtonActivity(){
        Intent radioActivity = new Intent(this,RadioButtonActivity.class);
        startActivity(radioActivity);
    }
    private void navigateToCheckBoxActivity(){
        Intent checkBoxActivityIntent = new Intent(this, CheckBoxActivity.class);
        startActivity(checkBoxActivityIntent);
    }
}