package com.example.labtrabajadores.models;

import androidx.annotation.NonNull;

public class TrabajadorHora extends Trabajador {
    private int numeroHoras;
    private float valorHora;

    public TrabajadorHora() {
    }

    public TrabajadorHora(String codigoPersona, String nombrePersona, String apellidoPersona, int numeroHoras, float valorHora) {
        super(codigoPersona, nombrePersona, apellidoPersona);
        this.numeroHoras = numeroHoras;
        this.valorHora = valorHora;
        Calcular();
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public int getTipoTrabajador() {
        return 1;
    }

    private void Calcular(){
        super.totalPagar = this.numeroHoras*this.valorHora;
    }

    @Override
    public String toString() {
        return super.codigoPersona + super.nombrePersona + super.apellidoPersona + " TH " + super.totalPagar;
    }
}
