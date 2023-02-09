package com.improve10x.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonActivity extends AppCompatActivity {
    public RadioGroup planetsRg;
    public Button verifyBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
        handleInitViews();
        handleVerifyBtnClick();
    }

    private void handleVerifyBtnClick() {
        verifyBtn.setOnClickListener(v -> {
            boolean result = isCorrect();
            showResult(result);
        });
    }

    private void handleInitViews() {
        planetsRg = findViewById(R.id.planets_rg);
        verifyBtn = findViewById(R.id.verify_btn);
    }

    public boolean isCorrect() {
        int selected = planetsRg.getCheckedRadioButtonId();
        boolean result = false;
        if (selected == R.id.eight_rb) {
            result = true;
        }
        return result;
    }

    public void showResult(boolean result) {
        if (result) {
            Toast.makeText(this, "Correct Answeer", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Sorry, Wrong Answer", Toast.LENGTH_LONG).show();
        }
    }
}
