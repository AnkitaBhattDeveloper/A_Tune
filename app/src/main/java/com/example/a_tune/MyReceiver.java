package com.example.a_tune;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

       // throw new UnsupportedOperationException("Not yet implemented");

            String actionString = intent.getAction();
        Toast.makeText(context, actionString, Toast.LENGTH_SHORT).show();
        String timezone = intent.getStringExtra("time-zone");
        Log.d("receive", "onReceive: "+timezone);

    }
}