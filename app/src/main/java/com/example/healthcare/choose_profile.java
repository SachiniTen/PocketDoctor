package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class choose_profile extends AppCompatActivity {

    Button btnNurse,btnDoc,btnPatient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_profile);
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
        Intent intent = new Intent(this, nurse_profile2.class);
        startActivity(intent);
    }
    private void openDocActivity() {
        Intent intent = new Intent(this, doc_profile2.class);
        startActivity(intent);
    }
    private void openPatientActivity() {
        Intent intent = new Intent(this, patient_profile.class);
        startActivity(intent);
    }
}
