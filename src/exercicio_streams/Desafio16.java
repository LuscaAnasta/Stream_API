package exercicio_streams;

import java.util.Arrays;
import java.util.List;

public class Desafio16 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		System.out.println("\tPARES");
		numeros.stream()
		.filter(n -> n%2 == 0)
		.forEach(System.out::println);
		
		System.out.print("\n\n");
		
		System.out.println("\tIMPARES");
		
		numeros.stream()
		.filter(n -> n%2 != 0)
		.forEach(System.out::println);
	}
}
