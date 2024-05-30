package com.example.project05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Suujiuranai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suujiuranai);
    }

    public void goToSuujiuranaikekka(View view) {
        Intent toUranai=new Intent(this, Suujiuranaikekka.class);
        startActivity(toUranai);
    }
}
