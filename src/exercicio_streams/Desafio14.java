package exercicio_streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Desafio14 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 5, 4, 3);
		
		Optional<Integer> primoMaior = numeros.stream()
		.sorted()
		.distinct()
		.filter()
		.max(Comparator.naturalOrder());
		
		System.out.println(primoMaior.get());
	}
}
