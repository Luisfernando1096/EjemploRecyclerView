package com.example.labtrabajadores;

import static com.example.labtrabajadores.MainActivity.lstTrabajadores;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.labtrabajadores.adapters.TrabajadorAdapter;
import com.example.labtrabajadores.models.Trabajador;

public class MostrarListaActivity extends AppCompatActivity {
    private TrabajadorAdapter trabajadorAdapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_lista);

        Toast.makeText(this, "DATOS: " + lstTrabajadores,
                Toast.LENGTH_SHORT).show();
        // Configurando adaptador
        trabajadorAdapter = new TrabajadorAdapter(lstTrabajadores);
        layoutManager = new LinearLayoutManager(this);
        recyclerView = findViewById(R.id.rcvTrabajadores);
        recyclerView.setAdapter(trabajadorAdapter);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

    }
}
