package aula99;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        //Obtendo o tamanho da lista
        System.out.println(list.size());
        
        //Laço for each para obter todos os elementos da lista
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-------------");

        //Removendo todoos os nomes que começam com a letra M
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-------------");

        //Achando a posição de determinados elementos
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        System.out.println("-------------");

        //Separando apenas os nomes que começam com a letra A da lista
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("-------------");

        //Encontrando o primeiro elemento que começa com a letra A
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
    }
}
