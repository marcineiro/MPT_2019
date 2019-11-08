package com.example.mpt_2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Calendario extends AppCompatActivity {

    //TODO: https://www.youtube.com/watch?v=5WVEbU_bTeg. SELECIONAR DIA E CLICKAR NO BOTÃO COM O DIA SALVO
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);
    }

    public void clickDia(View view) {
        Intent intent = new Intent(this, Dia.class);
        this.startActivity(intent);
    }
}
