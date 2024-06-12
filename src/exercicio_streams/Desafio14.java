package exercicio_streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Desafio14 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 5, 4, 3,23);
		
		Optional<Integer> primoMaior = numeros.stream()
		.sorted()
		.distinct()
		.filter(n -> primo(n))
		.max(Integer::compareTo);
		
		System.out.println(primoMaior.get());
	}
	
	static boolean primo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
