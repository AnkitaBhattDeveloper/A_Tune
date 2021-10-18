package com.example.a_tune;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {

    TextView tv;
    MyBroadcastReceiver(TextView textView){
        this.tv=textView;
    }


    @Override
    public void onReceive(Context context, Intent intent) {
       // Toast.makeText(context, "Broadcast receiver triggered", Toast.LENGTH_SHORT).show();
          int percentage = intent.getIntExtra("level",0);
          if(percentage!=0)
          {
              tv.setText(percentage+"%");
              Log.d("receive", "onReceive: working ");
          }


    }
}
