package com.example.implementasiapi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuActivity extends AppCompatActivity {

    Button btnPremiere;
    Button btnSpain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);

        btnPremiere = (Button) findViewById(R.id.btn_premiere);
        btnSpain = (Button) findViewById(R.id.btn_spain);

        btnPremiere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent premiereIntent = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(premiereIntent);
            }
        });

        btnSpain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent spainIntent = new Intent(MenuActivity.this, SpainActivity.class);
                startActivity(spainIntent);
            }
        });

    }
}