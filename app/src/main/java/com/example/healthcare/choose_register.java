package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class choose_register extends AppCompatActivity {

    private Button btnNurse, btnDoc, btnPatient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_register);

        btnNurse = findViewById(R.id.btnNurse);
        btnDoc = findViewById(R.id.btnDoc);
        btnPatient = findViewById(R.id.btnPatient);

        btnNurse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNurseActivity();
            }
        });
        btnDoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDocActivity();
            }
        });

        btnPatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPatientActivity();

            }


        });
    }

    private void openNurseActivity() {
        Intent intent = new Intent(this, regNurses.class);
        startActivity(intent);
    }
    private void openDocActivity() {
        Intent intent = new Intent(this, Register_DoctorActivity.class);
        startActivity(intent);
    }
    private void openPatientActivity() {
        Intent intent = new Intent(this, Register_PatientActivity.class);
        startActivity(intent);
    }
}
