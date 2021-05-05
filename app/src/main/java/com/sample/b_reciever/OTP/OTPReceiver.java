package com.sample.b_reciever.OTP;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;
import android.telephony.SmsManager;
import android.telephony.SmsMessage;
import android.widget.EditText;

public class OTPReceiver extends BroadcastReceiver {
    private  static EditText otp;
    void settext(EditText editText){
        OTPReceiver.otp=editText;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        SmsMessage[] smsMessages = Telephony.Sms.Intents.getMessagesFromIntent(intent);
        for (SmsMessage smsMessage : smsMessages){
            String message_body = smsMessage.getMessageBody();
            String getOTP = message_body.split(":")[1];
           otp.setText(getOTP);
      }
    }
}
