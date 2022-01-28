package com.example.android.deviceowner;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AlarmReceive extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        //循环启动Service
        Intent i = new Intent(context, com.example.android.deviceowner.AlarmService.class);
        context.startService(i);
    }
}