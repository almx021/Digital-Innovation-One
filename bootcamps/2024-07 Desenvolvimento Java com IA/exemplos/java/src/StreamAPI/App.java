package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * App
 */
public class App {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        
        String desafio1 = "Desafio 1 - Mostre a lista na ordem numérica:";
        System.out.println(desafio1);
        numbers.stream().sorted().forEach(n -> System.out.print(n + " "));

        String desafio2 = "\nDesafio 2 - Imprima a soma dos números pares da lista:";
        System.out.println(desafio2);
        int result2 = numbers.stream().filter(n -> n % 2 == 0).reduce(0, (x, y) -> Integer.sum(x, y));
        System.out.println(result2);

        String desafio3 = "Desafio 3 - Verifique se todos os números da lista são positivos:";
        System.out.println(desafio3);
        boolean result3 = numbers.stream().allMatch(n -> n >= 0);
        System.out.println(result3);

        String desafio4 = "Desafio 4 - Remova todos os valores ímpares:";
        System.out.println(desafio4);
        List<Integer> result4;
        result4 = numbers.stream().filter(n -> n % 2 != 0).toList();
        System.out.println(result4);

        String desafio5 = "Desafio 5 - Calcule a média dos números maiores que 5:";
        System.out.println(desafio5);
        double result5 = numbers.stream().filter(n -> n > 5).mapToInt(n -> n).average().orElse(0);
        System.out.println(result5);
        
        String desafio6 = "Desafio 6 - Verificar se a lista contém algum número maior que 10:";
        System.out.println(desafio6);
        boolean result6 = numbers.stream().anyMatch(n -> n > 10);
        System.out.println(result6);

        String desafio7 = "Desafio 7 - Encontrar o segundo número maior da lista:";
        System.out.println(desafio7);
        Integer result7 = numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println(result7);

        String desafio8 = "Desafio 8 - Somar os dígitos de todos os números da lista:";
        System.out.println(desafio8);
        int result8 = numbers.stream().map(String::valueOf).flatMapToInt(s -> s.chars().map(Character::getNumericValue)).sum();
        System.out.println(result8);

        String desafio9 = "Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):";
        System.out.println(desafio9);
        System.out.println(numbers.stream().distinct().count() == numbers.size());

        String desafio10 = "Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:";
        System.out.println(desafio10);
        Map<Object, List<Integer>> result10 = numbers.stream().filter(n -> n % 2 != 0 && (n % 3 == 0 || n % 5 == 0))
               .collect(Collectors.groupingBy(n -> {
                if (n % 3 == 0 && n % 5 == 0) {
                    return "Múltiplos de 3 e 5";
                } else if (n % 3 == 0) {
                    return "Múltiplos de 3";
                } else {
                    return "Múltiplos de 5";
                }
            }));
        System.out.println(result10);

        /*
        String desafio11 = "Mostre a lista na ordem numérica";
        System.out.println(desafio11);
        numbers.stream().sorted().forEach(n -> System.out.print(n + " "));

        String desafio12 = "Mostre a lista na ordem numérica";
        System.out.println(desafio12);
        numbers.stream().sorted().forEach(n -> System.out.print(n + " "));

        String desafio13 = "Mostre a lista na ordem numérica";
        System.out.println(desafio13);
        numbers.stream().sorted().forEach(n -> System.out.print(n + " "));

        String desafio14 = "Mostre a lista na ordem numérica";
        System.out.println(desafio14);
        numbers.stream().sorted().forEach(n -> System.out.print(n + " "));

        String desafio15 = "Mostre a lista na ordem numérica";
        System.out.println(desafio15);
        numbers.stream().sorted().forEach(n -> System.out.print(n + " "));

        String desafio16 = "Mostre a lista na ordem numérica";
        System.out.println(desafio16);
        numbers.stream().sorted().forEach(n -> System.out.print(n + " "));

        String desafio17 = "Mostre a lista na ordem numérica";
        System.out.println(desafio17);
        numbers.stream().sorted().forEach(n -> System.out.print(n + " "));

        String desafio18 = "Mostre a lista na ordem numérica";
        System.out.println(desafio18);
        numbers.stream().sorted().forEach(n -> System.out.print(n + " "));

        String desafio19 = "Mostre a lista na ordem numérica";
        System.out.println(desafio19);
        numbers.stream().sorted().forEach(n -> System.out.print(n + " "));

        String desafio20 = "Mostre a lista na ordem numérica";
        System.out.println(desafio20);
        numbers.stream().sorted().forEach(n -> System.out.print(n + " "));

 */
    }
    
}