package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public static final String EXTRA_MESSAGE = "com.example.calculadora.MESSAGE";
    private Button botonSuma;
    private Button botonResta;
    private Button botonMulti;
    private Button botonDiv;

    private TextView respuesta;

    private EditText num1;
    private EditText num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

        respuesta = (TextView) findViewById(R.id.respuestaCalculadora);

        botonSuma = findViewById(R.id.sumaButton);
        botonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String envio;
                respuesta.setText(suma(Integer.parseInt(num1.getText().toString()), Integer.parseInt(num2.getText().toString())));
                envio = respuesta.getText().toString();
                enviar(this, envio);
            }
        });

        botonResta = findViewById(R.id.restaButton);
        botonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String envio;
                respuesta.setText(resta(Integer.parseInt(num1.getText().toString()), Integer.parseInt(num2.getText().toString())));
                envio = respuesta.getText().toString();
                enviar(this, envio);
            }
        });

        botonMulti = findViewById(R.id.multiButton);
        botonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String envio;
                respuesta.setText(multiplicacion(Integer.parseInt(num1.getText().toString()), Integer.parseInt(num2.getText().toString())));
                envio = respuesta.getText().toString();
                enviar(this, envio);
            }
        });

        botonDiv = findViewById(R.id.divButton);
        botonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String envio;
                respuesta.setText(division(Integer.parseInt(num1.getText().toString()), Integer.parseInt(num2.getText().toString())));
                envio = respuesta.getText().toString();
                enviar(this, envio);
            }
        });
    }

    public int suma (int a, int b){

        return a+b;
    }

    public int resta (int a, int b){

        return a-b;
    }

    public int multiplicacion (int a, int b){

        return a*b;
    }

    public int division (int a, int b){

        int respuesta = 0;
        if(b!=0){
            respuesta = a/b;
        }
        return a/b;

    }

    public void enviar(View.OnClickListener view, String envio) {
        Intent intent = new Intent(this, RespuestaActivity.class);
        intent.putExtra(EXTRA_MESSAGE, envio);
        startActivity(intent);
    }
}