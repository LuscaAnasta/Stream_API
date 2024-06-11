package exercicio_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio11 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		List<Integer> quadrados = numeros.stream()
        .map(n -> n*n)
        .collect(Collectors.toList());
		
		quadrados.stream().forEach(System.out::println);
	}
}
