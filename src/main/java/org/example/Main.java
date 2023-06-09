package org.example;

import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static int valorBase =2;
    public static void main(String[] args) {
        //Ejercicio 1
        System.out.println("------------------------> Ejercicio 1 <--------------------------");
        ArrayList<Integer> lista = new ArrayList<>();lista.add(3);lista.add(4);lista.add(6);lista.add(1);lista.add(2);
        List <Integer> lista2 = List.of(1,3,4,5,6,8,9);
        System.out.println("Prueba Numero Mayor");
        Ejercicio1 Ej1 = new Ejercicio1();
        Ej1.calcularMayor(lista2);
        System.out.println("Prueba Numero Menor");
        Ej1.calcularMenor(lista2);
        //Ejercicio 2
        System.out.println("------------------------> Ejercicio 2 <--------------------------");
        int ventas = 150000;
        int descuento = 10;
        Ejercicio2 Ej2 = new Ejercicio2();
        System.out.println("Total de ventas -> "+ventas);
        System.out.println("Descuento a aplicar -> " + descuento+"%");
        System.out.println("Valor total con el descuento");
        System.out.println(Ej2.calcularPrecioTotalDescuento(ventas, descuento));

        //Ejercicio 3
        System.out.println("------------------------> Ejercicio 3 <--------------------------");
        int precio = 10000;
        int iva = 5;
        Ejercicio3 Ej3 = new Ejercicio3();
        System.out.println("Prueba con Iva declarado");
        System.out.println(Ej3.calcularIva(precio,iva));
        System.out.println("Prueba con Iva no declarado");
        System.out.println(Ej3.calcularIva(precio));




        /*System.out.println("Hello world!");
       double result1 = Main.calcular(2,3);
       System.out.println("++Primer Resultado");
       System.out.println(result1);
       Main.valorBase= 4;
       double result2 = Main.calcular(2,3);
       System.out.println("++Segundo Resultado");
       System.out.println(result2);
       OperacionMayor operacion = new
*/


    }



}