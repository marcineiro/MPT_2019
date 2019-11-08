package com.example.mpt_2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dia extends AppCompatActivity {
    //TODO Opcional: (BARRA DE PROGRESSO) https://pt.stackoverflow.com/questions/76476/como-utilizo-o-progress-bar
    //TODO: Colocar N nutrientes na activity depois de um número decidido

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dia);
    }

    public void clickCadastrarRefeicao(View view) {
        Intent intent = new Intent(this, CadastrarRefeicao.class);
        this.startActivity(intent);
    }

    public void clickRefeicoes(View view) {
        Intent intent = new Intent(this, Refeicoes.class);
        this.startActivity(intent);
    }
}
