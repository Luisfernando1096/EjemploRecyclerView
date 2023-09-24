package com.example.labtrabajadores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.labtrabajadores.models.Trabajador;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnAgregar, btnMostrar, btnAcercaDe;
    public static ArrayList<Trabajador> lstTrabajadores;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstTrabajadores = new ArrayList<Trabajador>();

        btnAgregar = findViewById(R.id.btnAgregar);
        btnMostrar = findViewById(R.id.btnMostrar);
        btnAcercaDe = findViewById(R.id.btnAcercaDe);

        btnAgregar.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ElegirTipoTrabajadorActivity.class));
        });

        btnMostrar.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, MostrarListaActivity.class));
        });

        btnAcercaDe.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, AcercaDeActivity.class));
        });
    }
}