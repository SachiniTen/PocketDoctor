package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;


import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private Button button4;
    private TextView mDisplayDate;
    private DatePickerDialog.OnDateSetListener mDateSetListener;

    private TextView mDisplayTime;
    private Button btnServices,btnReg,btnAbout,btnAlarm,btnLog,btnProfile;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        btnServices = findViewById(R.id.btnServices);
        btnReg = findViewById(R.id.btnReg);
        btnAbout = findViewById(R.id.btnAbout);

        btnLog = findViewById(R.id.btnLog);
        btnProfile = findViewById(R.id.btnProfile);

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProfileActivity();
            }
        });
        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLogActivity();
            }
        });
        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAboutActivity();
            }
        });
        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRegActivity();
            }
        });

        btnServices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openServicesActivity();

            }


        });

        button4=(Button)findViewById(R.id.btnAlarm);
        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openAlarm();
            }
        });
    }

    private void openProfileActivity() {
        Intent intent = new Intent(this, choose_profile.class);
        startActivity(intent);
    }

    private void openServicesActivity() {
        Intent intent = new Intent(this, services.class);
        startActivity(intent);
    }
    private void openRegActivity() {
        Intent intent = new Intent(this, choose_register.class);
        startActivity(intent);
    }
    private void openAboutActivity() {
        Intent intent = new Intent(this, aboutUs.class);
        startActivity(intent);
    }
    public void openAlarm(){
        Intent intent = new Intent(this, alarm_home.class);
        startActivity(intent);
    }
    private void openLogActivity() {
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }


}
