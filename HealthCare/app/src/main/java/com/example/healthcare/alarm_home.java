package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class alarm_home extends AppCompatActivity {

    Button btnB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnB = findViewById(R.id.btnB);
        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openReminderActivity();
            }
        });
    }

    private void openReminderActivity() {
        Intent intent = new Intent(this, AddRemainderActivity.class);
        startActivity(intent);
    }
}
