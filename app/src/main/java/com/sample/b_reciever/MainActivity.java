package com.sample.b_reciever;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.sample.b_reciever.Alert.Alert;
import com.sample.b_reciever.AsyncTasc.ATloader;
import com.sample.b_reciever.OTP.OTPActivity;
import com.sample.b_reciever.alarm.Alarm;
import com.sample.b_reciever.bgplay.Bgplay;
import com.sample.b_reciever.getLL.GetLandL;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button Setalarm,otp,BGPLAY,ATL,AlerT,getCL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
        Setalarm=findViewById(R.id.setAlarm);
        BGPLAY=findViewById(R.id.BGPLAY);
        otp =findViewById(R.id.otp);
        ATL =findViewById(R.id.AT);
        AlerT =findViewById(R.id.Alert);
        getCL =findViewById(R.id.GetLL);
        getCL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), GetLandL.class));
            }
        });

      AlerT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Alert.class));
            }
        });
        ATL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ATloader.class));
            }
        });
        BGPLAY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Bgplay.class));
            }
        });
        otp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), OTPActivity.class));
            }
        });
        Setalarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Alarm.class));
            }
        });
    }

    public void sendBroadcast(View v) {//Broadcast reciever Intent part
        Intent intent = new Intent("com.sample.EXAMPLE_ACTION");
        intent.setPackage("com.sample.broadcastreciever");
        Bundle extras = new Bundle();
        extras.putString("stringExtra", "Start");
        sendOrderedBroadcast(intent, null, new SenderReceiver(),
                null, 0, "Start", extras);
    }
}
