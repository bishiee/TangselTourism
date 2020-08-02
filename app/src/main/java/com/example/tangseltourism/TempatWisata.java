package com.example.tangseltourism;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TempatWisata extends AppCompatActivity {
    Button btnOpsi1, btnOpsi2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tempatwisata_layout);
        btnOpsi1 = findViewById(R.id.btn_opsi1);
        btnOpsi2 = findViewById(R.id.btn_opsi2);

        btnOpsi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TempatWisata.this,opsi_tempatwis.class);
                startActivity(i);
            }
        });

        btnOpsi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
