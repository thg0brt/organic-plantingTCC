package com.example.mathe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Hinverno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hinverno);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Voltar às estações");
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                startActivity(new Intent(this, tabActivity.class));
                finishAffinity();
                break;
            default:break;
        }
        return true;
    }
    @Override
    public void onBackPressed(){
        startActivity(new Intent(this, tabActivity.class));
        finishAffinity();
        return;
    }
    // -------------------------------------------------------------------------------------------------------------
    public void cebolinha(View view){
        Intent Cebolinha = new Intent(getApplicationContext(),cebolinhaInverno.class);
        startActivity(Cebolinha);
        finish();
    }
    public void agriao(View view){
        Intent Agriao = new Intent(getApplicationContext(),agriao_inverno.class);
        startActivity(Agriao);
        finish();
    }
    public void ervilha(View view){
        Intent Ervilha = new Intent(getApplicationContext(),ervilha.class);
        startActivity(Ervilha);
        finish();
    }

    public void mostarda(View view){
        Intent Mostarda = new Intent(getApplicationContext(),mostarda.class);
        startActivity(Mostarda);
        finish();
    }
    public void beterraba(View view){
        Intent Beterraba = new Intent(getApplicationContext(),beterraba.class);
        startActivity(Beterraba);
        finish();
    }
    public void VoltarTela(View view){
        Intent voltar = new Intent(getApplicationContext(),tabActivity.class);
        startActivity(voltar);
        finish();
    }
   
}
