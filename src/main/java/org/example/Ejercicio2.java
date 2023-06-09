package org.example;

public class Ejercicio2 implements OperacionVentaDescuento{
    @Override
    public int calcularPrecioTotalDescuento(int totalVenta, int descuento) {
        return totalVenta - (totalVenta*descuento/100);
    }
}
