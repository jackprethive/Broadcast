package com.sample.b_reciever.Alert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sample.b_reciever.MainActivity;
import com.sample.b_reciever.R;
import com.tapadoo.alerter.Alerter;
import com.tapadoo.alerter.OnHideAlertListener;
import com.tapadoo.alerter.OnShowAlertListener;

public class Alert extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);
    }
    public void showAlerter(View v) {
        Alerter.create(this)
                .setTitle("Alert Demo")
                .setText("You have received a new alert message. ")
                .setIcon(R.drawable.alerter_ic_notifications)
                .setBackgroundColorRes(R.color.purple_500)
                .setDuration(5000)
                .enableSwipeToDismiss()
                .enableProgress(true)
                .setProgressColorRes(R.color.purple_500)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    }
                })
                .setOnShowListener(new OnShowAlertListener() {
                    @Override
                    public void onShow() {

                    }
                })
                .setOnHideListener(new OnHideAlertListener() {
                    @Override
                    public void onHide() {

                    }
                })
                .show();
    }
}