package com.example.project05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class torannpuuranai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_torannpuuranai);
    }

    public void goTotorannpuuranaikekka(View view) {
        Intent toUranai=new Intent(this, torannpuuranaikekka.class);
        startActivity(toUranai);
    }
}
