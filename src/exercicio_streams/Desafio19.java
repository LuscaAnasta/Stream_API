package exercicio_streams;

import java.util.Arrays;
import java.util.List;

public class Desafio19 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		List<Integer> multiplos = numeros.stream()
				.filter(n -> n%2 != 0)
				.filter(n -> n % 3 == 0 || n % 5 == 0)
				.toList();
			
		System.out.println("Multiplos");
		multiplos.stream().forEach(System.out::println);
		
		int resultado =	multiplos.stream()
				.reduce(0, (n1, n2) -> n1+n2);
		
		System.out.println("Soma");
		System.out.println(resultado);
	}
}
