package exercicio_streams;

import java.util.Arrays;
import java.util.List;

public class Desafio5 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		int numerosSomados = numeros.stream()
					        .filter(n -> n > 5)
					        .reduce(0, (n1, n2) -> n1+n2 );
		
		long tamanho = numeros.stream()
		        .filter(n -> n > 5).count();
		
		System.out.println(numerosSomados/tamanho);
	}
}
