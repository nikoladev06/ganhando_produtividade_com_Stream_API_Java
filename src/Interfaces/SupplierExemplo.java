package Interfaces;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
O Supplier representa uma operação que não aceita nenhum argumento e retorna um resultado de qualquer tipo
Comumente usada para criar ou fornecer novos objetos de um determinado tipo.
*/

public class SupplierExemplo {
    public static void main(String[] args) {
        //Usar o supplier com lambda para fornecer uma saudação
        Supplier<String> saudacao = () -> "Olá, seja bem vindo(a)!";

        //Usar o supplier para obter uma lista com 5 saudações
        //OLD: List<String> listaSaudacoes = Stream.generate(saudacao).limit(5).toList();
        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem vindo(a)!")
                .limit(5).toList();
        //Imprimir as saudações geradas
        //OLD: listaSaudacoes.forEach(s -> System.out.println(s));
        listaSaudacoes.forEach(System.out::println);
    }
}
