package com.example.project05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UranaiSelect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uranai_select);
    }

    public void goToSuujiuranai(View view) {
        Intent toUranai=new Intent(this, Suujiuranai.class);
        startActivity(toUranai);
    }

    public void goTotorannpuuranai(View view) {
        Intent toUranai=new Intent(this, torannpuuranai.class);
        startActivity(toUranai);
    }

    public void goToKetuekiuranai(View view) {
        Intent toUranai=new Intent(this, Ketuekiuranai.class);
        startActivity(toUranai);
    }
}
