package Interfaces;

import java.util.*;
import java.util.function.Predicate;

/*
 * Representa uma função que aceita argumentos do tipo T e retorna um valor booleano.
 * É comumente usado para filtrar os elementos do Stream com base em alguma condição.
 */

public class PredicateExemplo {
    public static void main(String[] args) {
        /* Exemplo do curso:

        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        //predicate para verificar quais palavras tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        //imprimir
        palavras.stream().filter(maisDeCincoCaracteres).forEach(System.out::println);
        */

        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> loginMap = new HashMap<>() {{
            put(1234, "nicolas@gmail.com");
            put(5678, "maria@gmail.com");
        }};

        System.out.println("Insira o email para saber sua senha: ");
        final String emailProcurado = scanner.next();

        Predicate<Map.Entry<Integer, String>> verificarEmail =
                entry -> entry.getValue().contains(emailProcurado);

        loginMap.entrySet().stream()
                .filter(verificarEmail)
                .forEach(entry -> System.out.println("Email: "+entry.getValue() + "\nSenha: " + entry.getKey()));
    }
}
