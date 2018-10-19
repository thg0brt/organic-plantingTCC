package com.example.mathe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Hprimavera extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_hprimavera);
    }

    public void VoltarH(View view){

        Intent H = new Intent(getApplicationContext(),tela3.class);
        startActivity(H);
        finish();

    }
    public void IrTela(View view){

        Intent irTela = new Intent(getApplicationContext(),Hprimavera2.class);
        startActivity(irTela);
        finish();

    }
    public void Abobora(View view){

        Intent abobora = new Intent(getApplicationContext(),abobora.class);
        startActivity(abobora);
        finish();

    }
    public void cenoura(View view){

        Intent Cenoura = new Intent(getApplicationContext(),cenoura.class);
        startActivity(Cenoura);
        finish();

    }
    public void Tomate(View view){

        Intent tomate = new Intent(getApplicationContext(),tomate.class);
        startActivity(tomate);
        finish();

    }
    public void Agriao(View view){

        Intent tomate = new Intent(getApplicationContext(),agrio.class);
        startActivity(tomate);
        finish();

    }
    public void Melancia(View view){

        Intent melancia = new Intent(getApplicationContext(),melancia.class);
        startActivity(melancia);
        finish();

    }
    public void Pimentao(View view){

        Intent pimentao = new Intent(getApplicationContext(),pimentao.class);
        startActivity(pimentao);
        finish();

    }
}