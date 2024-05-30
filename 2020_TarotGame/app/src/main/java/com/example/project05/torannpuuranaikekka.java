package com.example.project05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class torannpuuranaikekka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_torannpuuranaikekka);
    }

    public void goToMainActivity(View view) {
        Intent toUranai=new Intent(this, MainActivity.class);
        startActivity(toUranai);
    }

        }


