package com.example.elearning;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FormationActivity extends AppCompatActivity {
    private Button envoyer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        envoyer= (Button) findViewById(R.id.envoyer);
    }
    }
