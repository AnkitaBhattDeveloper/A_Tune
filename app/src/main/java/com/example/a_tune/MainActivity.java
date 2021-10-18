package com.example.a_tune;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    //ToggleButton toggleButton1;
//ToggleButton toggleButton2;
//Button button;


//          ---------    Battery Receiver starts  -------


//    TextView textView;
//    MyBroadcastReceiver myBroadcastReceiver;
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        textView = findViewById(R.id.textView);
//        myBroadcastReceiver = new MyBroadcastReceiver(textView);
//        registerReceiver(myBroadcastReceiver, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
//        Log.d("broad", "onCreate: working");
//
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//         unregisterReceiver(myBroadcastReceiver);
//    }
//}


//               -----------Battery receiver finish------------








//        ***********ToggleButton Starts ***********

//        addListenerOnButtonClick();
//    }

//    public void addListenerOnButtonClick(){
//        //Getting the ToggleButton and Button instance from the layout xml file
//        toggleButton1=findViewById(R.id.toggleButton);
//        toggleButton2=findViewById(R.id.toggleButton2);
//        button=findViewById(R.id.button);
//
//        //Performing action on button click
//        button.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View view) {
//                StringBuilder result = new StringBuilder();
//                result.append("ToggleButton1 : ").append(toggleButton1.getText());
//                result.append("\nToggleButton2 : ").append(toggleButton2.getText());
//                //Displaying the message in toast
//                Toast.makeText(getApplicationContext(), result.toString(),Toast.LENGTH_LONG).show();
//            }
//
//        });


//        ********************** Toggle buttton ends  ****************

}}



