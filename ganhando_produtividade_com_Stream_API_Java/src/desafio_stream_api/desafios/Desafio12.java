package desafio_stream_api.desafios;

import java.util.Arrays;
import java.util.List;

//Encontrar o produto de todos os números
public class Desafio12 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        int product = numeros.stream()
                             .reduce(1, (a, b) -> a * b);
        System.out.println(product);
    }
}

