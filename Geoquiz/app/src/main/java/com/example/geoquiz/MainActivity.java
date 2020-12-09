package com.example.geoquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    Button btnverdadero;
    Button btnfalso;
    Button btnSiguiente;
    TextView textPregunta;

    Preguntas[ ]preguntas=new Preguntas[]{
            new Preguntas(R.string.pregunta_1,true),
            new Preguntas(R.string.pregunta_2,false),
            new Preguntas(R.string.pregunta_3,true),
            new Preguntas(R.string.pregunta_4,false),
            new Preguntas(R.string.pregunta_5,true),

    };
    int preguntaactual = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnverdadero = findViewById(R.id.btn_verdadero);
        btnfalso = findViewById(R.id.btn_false);
        btnSiguiente = findViewById(R.id.btn_Siguiente);
        textPregunta = findViewById(R.id.text_pregunta);

        Preguntas pregunta = preguntas[preguntaactual ];
        textPregunta.setText(pregunta.getId());

        btnverdadero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity","clic en btnVerdadero");
                Toast.makeText(MainActivity.this,R.string.correcto,Toast.LENGTH_SHORT).show();

            }
        });
        btnfalso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity","clic en btnFalse");
                Toast.makeText(MainActivity.this,R.string.incorrecto,Toast.LENGTH_SHORT).show();
            }
        });
        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preguntaactual++;
                Preguntas pregunta = preguntas[preguntaactual ];
                textPregunta.setText(pregunta.getId());




            }
        });

    }
    }
