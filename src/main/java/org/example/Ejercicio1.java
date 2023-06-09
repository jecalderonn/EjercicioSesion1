package org.example;

import java.util.List;

public class Ejercicio1 implements OperacionMenorYMayor{
    @Override
    public void calcularMenor(List<Integer> List) {
        System.out.println(List.stream().min(Integer::compareTo).get());
    }

    @Override
    public void calcularMayor(List<Integer> List) {
        System.out.println(List.stream().max(Integer::compareTo).get());

    }
}
