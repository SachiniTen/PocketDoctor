package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class services extends AppCompatActivity {

    ImageButton image1, image2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRequestActivity();
            }
        });
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRequestActivity();
            }
        });
    }

    private void openRequestActivity() {
        Intent intent = new Intent(this, requestform.class);
        startActivity(intent);
    }
}
