package com.ajith.voipcall;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class RNVoipBroadcastReciever extends  BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Application applicationContext = (Application) context.getApplicationContext();

        RNVoipNotificationHelper rnVoipNotificationHelper = new RNVoipNotificationHelper(applicationContext);
        int notificationId = intent.getIntExtra("notificationId",0);

        switch (intent.getAction()){
            case "callTimeOut":
               // rnVoipNotificationHelper.showMissCallNotification(intent.getStringExtra("missedCallTitle"), intent.getStringExtra("missedCallBody"), intent.getStringExtra("callerId"));
                break;
            default:
                break;
        }

    }
}
