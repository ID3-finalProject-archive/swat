package com.example.project05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Karenda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karenda);
    }

    public void goToMainActivity(View view) {
        Intent toSinnri=new Intent(this, MainActivity.class);
        startActivity(toSinnri);
    }
}
