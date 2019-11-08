package com.example.mpt_2019;

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

    public void clickPerfil(View view) {
        Intent intent = new Intent(this, Perfil.class);
        this.startActivity(intent);
    }

    public void clickCalendario(View view) {
        Intent intent = new Intent(this, Calendario.class);
        this.startActivity(intent);
    }

    public void clickTabela(View view) {
        Intent intent = new Intent(this, Taco.class);
        this.startActivity(intent);
    }
}
