package com.example.mathe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Houtono2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_houtono2);
    }
    public void VoltarH(View view){

        Intent H = new Intent(getApplicationContext(),tela3.class);
        startActivity(H);
        finish();

    }
    public void VoltarTela(View view){

        Intent voltar = new Intent(getApplicationContext(),Houtono.class);
        startActivity(voltar);
        finish();

    }
}