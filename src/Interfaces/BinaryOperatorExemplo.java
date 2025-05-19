package Interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T
 * É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos
 */

public class BinaryOperatorExemplo {
    public static void main(String[] args) {
        //criar uma lista de inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //usar o binary operator com expressão lambda para somar dois números inteiros
        //BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;
        BinaryOperator<Integer> somar = Integer::sum;


        //usar o binary operator para somar todos os números no Stream
        int resultado = numeros.stream().reduce(0, somar);

        //imprimir
        System.out.println("A soma dos números é: " + resultado);
    }
}
