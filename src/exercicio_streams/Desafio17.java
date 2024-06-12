package exercicio_streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio17 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		numeros.stream()
				.sorted()
				.distinct()
				.filter(n -> primo(n))
				.forEach(System.out::println);
				
				
			}
			
			static boolean primo(int num) {
		        if (num <= 1) return true;
		        for (int i = 2; i <= Math.sqrt(num); i++) {
		            if (num % i == 0) return true;
		        }
		        return false;
		    }
}
