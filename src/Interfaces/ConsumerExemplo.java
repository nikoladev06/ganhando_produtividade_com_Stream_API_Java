package Interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Representa uma operação que aceita um argumento do tipo T e não retorna resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou retornar um valor.
 */

public class ConsumerExemplo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Consumer<Integer> imprimirNumerosPares = numero -> {
            if (numero % 2 == 0) System.out.println(numero);
        };

        numeros.stream().forEach(imprimirNumerosPares);
    }
}
