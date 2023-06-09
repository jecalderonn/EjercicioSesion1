package org.example;

public class Ejercicio3 implements OperacionIva{

    @Override
    public int calcularIva(int ventas) {
        return ((ventas*21)/100);
    }
    @Override
    public int calcularIva(int ventas, int iva) {
        return ((ventas*iva)/100);
    }

}