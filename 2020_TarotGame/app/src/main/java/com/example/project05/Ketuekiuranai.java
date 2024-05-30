package com.example.project05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ketuekiuranai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ketuekiuranai);
    }

    public void goToA_Ketuekikekka(View view) {
        Intent toUranai=new Intent(this, A_Ketuekikekka.class);
        startActivity(toUranai);
    }

    public void goToB_ketuekikekka(View view) {
        Intent toUranai=new Intent(this, B_Ketuekikekka.class);
        startActivity(toUranai);
    }

    public void goToO_ketuekikekka(View view) {
        Intent toUranai=new Intent(this, O_Ketuekikekka.class);
        startActivity(toUranai);
    }

    public void goToAB_ketuekikekka(View view) {
        Intent toUranai=new Intent(this, AB_Ketuekikekka.class);
        startActivity(toUranai);
    }
}
