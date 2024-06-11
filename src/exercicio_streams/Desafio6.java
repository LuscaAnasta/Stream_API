package exercicio_streams;

import java.util.Arrays;
import java.util.List;

public class Desafio6 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 11, 8, 9, 10, 5, 4, 3);
		
		numeros.stream()
        .filter(n -> n > 10)
        .forEach(System.out::println);
	}
}