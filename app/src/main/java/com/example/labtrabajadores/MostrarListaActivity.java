package com.example.labtrabajadores;

import static com.example.labtrabajadores.MainActivity.lstTrabajadores;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.labtrabajadores.adapters.TrabajadorAdapter;
import com.example.labtrabajadores.databinding.ActivityAgregarTrabajadorBinding;
import com.example.labtrabajadores.databinding.ActivityElegirTipoTrabajadorBinding;
import com.example.labtrabajadores.databinding.ActivityMostrarListaBinding;
import com.example.labtrabajadores.models.Trabajador;

public class MostrarListaActivity extends AppCompatActivity {
    private TrabajadorAdapter trabajadorAdapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private ActivityMostrarListaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMostrarListaBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Toast.makeText(this, "DATOS: " + lstTrabajadores,
                Toast.LENGTH_SHORT).show();
        // Configurando adaptador
        trabajadorAdapter = new TrabajadorAdapter(lstTrabajadores);
        layoutManager = new LinearLayoutManager(this);
        binding.rcvTrabajadores.setAdapter(trabajadorAdapter);
        binding.rcvTrabajadores.setLayoutManager(layoutManager);
        binding.rcvTrabajadores.setHasFixedSize(true);

    }
}
