package exercicio_streams;

import java.util.Arrays;
import java.util.List;

public class Desafio18 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1,1,1,1);
		
		
		boolean numerosIguais = numeros.stream()
		.distinct()
		.count() == 1;
		
		if(numerosIguais) {
			System.out.println("São todos iguais");
		}else {
			System.out.println("São distintos");
		}
	}
}
