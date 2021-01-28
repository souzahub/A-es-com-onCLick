package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnUm, btnDois, btnTres;
    private TextView tView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // instanciar os elementos

        btnUm = findViewById(R.id.btnUm);
        btnDois = findViewById(R.id.btnDois);
        tView =  findViewById(R.id.tviewID);

        // Ações Botoes

        btnUm.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                // Aqui a Acão a ser executada ao clicar no botao um
                // fazemos a mudança do texto da textView, com o metodo SetText e dentro dos parenteses
                // podemos utilizar uma string ou digitar diretamente entre "aspas" o texto a ser exibido

                String textoNovo = "Texto Modificado Opcão UM";
                tView.setText(textoNovo);
            }
        });

        btnDois.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                // Aqui a Acão a ser executada ao clicar no botao um
                // fazemos a mudança do texto da textView, com o metodo SetText e dentro dos parenteses
                // podemos utilizar uma string ou digitar diretamente entre "aspas" o texto a ser exibido

                tView.setText("Texto Modificado Opcão DOIS");

            }
        });

    }

    // para o btnTres ultilizaremos o metodo onClick
    // via Xml
    @SuppressLint("SetTextI18n")
    public void mudaTexto(View view){
        tView.setText("Texto Modificado Opcão TRES");
    }
}