package com.improve10x.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {
    Button verifyCheckBtn;
    CheckBox mercuryCb;
    CheckBox moonCb;
    CheckBox sunCb;
    CheckBox plutoCb;
    CheckBox jupiterCb;
    CheckBox saturnCb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        handleInitViews();
        handleVerifyBtnClick();
    }

    private void handleVerifyBtnClick() {
        verifyCheckBtn.setOnClickListener(v -> {
            boolean result = isCorrect();
            showResult(result);
        });
    }

    private void handleInitViews() {
        verifyCheckBtn = findViewById(R.id.check_verify_btn);
        mercuryCb = findViewById(R.id.mercury_cb);
        moonCb = findViewById(R.id.moon_cb);
        sunCb = findViewById(R.id.sun_cb);
        plutoCb = findViewById(R.id.pluto_cb);
        jupiterCb = findViewById(R.id.jupiter_cb);
saturnCb = findViewById(R.id.saturn_cb);
    }
    public boolean isCorrect(){
        boolean mercuryChecked = mercuryCb.isChecked();
        boolean jupiterChecked = jupiterCb.isChecked();
        boolean saturnChecked = saturnCb.isChecked();
        boolean sunChecked = sunCb.isChecked();
        boolean moonChecked = moonCb.isChecked();
        boolean plutoChecked = plutoCb.isChecked();
        boolean result = false;
        if (mercuryChecked ==true && jupiterChecked == true && saturnChecked == true && sunChecked == false && moonChecked == false && plutoChecked == false){
            result = true;
        }
        return  result;
    }
    public void showResult(boolean result){
       if (result){
           Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
       }else {
           Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show();
       }
    }
}