package Interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

//Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R
//É utilizada para transformar ou mapear os elementos do Stream em outros valores, ou tipos

public class FunctionExemplo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //Function<Integer, Integer> dobrar = numero -> numero * 2;

        List<Integer> numerosDobrados = numeros.stream().map(n -> n * 2).toList();
        numerosDobrados.forEach(System.out::println);
    }
}