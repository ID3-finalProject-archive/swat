package com.example.project05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sinnritesutomonndai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinnritesutomonndai);
    }

        public void goTosinnritesutomonndai(View view) {
            Intent toSinnri=new Intent(this, Sinnrikekka1.class);
            startActivity(toSinnri);
    }

    public void goTosinnrikekka2(View view) {
            Intent toSinnri=new Intent(this, sinnrikekka2.class);
            startActivity(toSinnri);
    }

    public void goTosinnrikekka3(View view) {
        Intent toSinnri=new Intent(this, Sinnrikekka3.class);
        startActivity(toSinnri);
    }

    public void goTosinnrikekka4(View view) {
        Intent toSinnri=new Intent(this, Sinnrikekka4.class);
        startActivity(toSinnri);
    }
}
