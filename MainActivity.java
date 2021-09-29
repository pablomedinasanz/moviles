package com.example.calculadoracutre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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

        respuesta = findViewById(R.id.respuesta);
        num1 = findViewById(R.id.numero1);
        num2 = findViewById(R.id.numero2);

        botonSuma = findViewById(R.id.sumaBoton);
        botonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                respuesta.setText(suma(Integer.parseInt(num1.getText().toString()) , (Integer.parseInt(num2.getText().toString()))) + "");
            }
        });

        botonResta = findViewById(R.id.restaBoton);
        botonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                respuesta.setText(resta(Integer.parseInt(num1.getText().toString()) , (Integer.parseInt(num2.getText().toString()))) + "");
            }
        });

        botonMulti = findViewById(R.id.multiBoton);
        botonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                respuesta.setText(multiplicacion(Integer.parseInt(num1.getText().toString()) , (Integer.parseInt(num2.getText().toString()))) + "");
            }
        });

        botonDiv = findViewById(R.id.divBoton);
        botonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                respuesta.setText(division(Integer.parseInt(num1.getText().toString()) , (Integer.parseInt(num2.getText().toString()))) + "");
            }
        });

    }

    public double suma(double a, double b) {

        return a+b;
    }

    public double resta(double a, double b) {

        return a-b;
    }

    public double multiplicacion(double a, double b) {

        return a*b;
    }

    public double division(double a, double b) {

        double respuesta = 0;
        if(respuesta != 0) {
            respuesta = a/b;
        }

        return a/b;
    }
}