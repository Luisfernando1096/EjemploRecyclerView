package com.example.labtrabajadores;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.labtrabajadores.databinding.ActivityElegirTipoTrabajadorBinding;
import com.example.labtrabajadores.databinding.ActivityLoginBinding;

public class ElegirTipoTrabajadorActivity extends AppCompatActivity {
    private ActivityElegirTipoTrabajadorBinding binding;
    private Bundle bundle;
    private int idEleccion = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityElegirTipoTrabajadorBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.rbTHora.setOnClickListener(v -> idEleccion = 1); // En caso de que el usuario elija libro
        binding.rbTTCompleto.setOnClickListener(v -> idEleccion = 2); // En caso de que el usuario elija revista

        binding.btnSiguiente.setOnClickListener(v -> {
            bundle = new Bundle();
            bundle.putInt("tipoEleccion", idEleccion);
            Intent intent = new Intent(this, AgregarTrabajadorActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
        });
    }
}
