package com.example.project05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToUranaiSelect(View view) {
        Intent toUranai=new Intent(this, UranaiSelect.class);
        startActivity(toUranai);
    }

    public void goTosinnritesutomonndai(View view) {
        Intent toSinnri=new Intent(this, Sinnritesutomonndai.class);
        startActivity(toSinnri);
    }

    public void goTokarennda(View view) {
        Intent toSinnri=new Intent(this, Karenda.class);
        startActivity(toSinnri);
    }
}
