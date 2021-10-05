package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RespuestaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respuesta);

        Intent intent = getIntent();

        Double resultado = intent.getDoubleExtra(MainActivity.EXTRA_MESSAGE, 0);

        TextView texto = findViewById(R.id.respuestaCalculadora);

        texto.setText(" " + resultado);
    }
}