package com.sample.b_reciever.OTP;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.EditText;

import com.sample.b_reciever.R;

public class OTPActivity extends AppCompatActivity {
EditText otp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o_t_p);

        otp = findViewById(R.id.editText_otp);
        requestPermissions();
        new OTPReceiver().settext(otp);

    }

    private void requestPermissions() {
        if(ContextCompat.checkSelfPermission(OTPActivity.this, Manifest.permission.RECEIVE_SMS)
                != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(OTPActivity.this,new String[]{
                Manifest.permission.RECEIVE_SMS
            },100);
        }
    }
}