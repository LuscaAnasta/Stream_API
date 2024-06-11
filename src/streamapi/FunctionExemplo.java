package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExemplo {
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,25);
		
		Function<Integer, Integer> dobrar = numero -> numero * 2;
		
		
		
		List<Integer> numerosDobrados = numeros.stream()
				.map(t -> t*2)
				.collect(Collectors.toList());
		
		
		numerosDobrados.forEach(System.out::println);
		
		Function<Integer, String> transmutar = numero -> numero + " Aqui!";
		
		List<String> numerosTransmutados = numerosDobrados.stream()
				.map(transmutar)
				.collect(Collectors.toList());
		
		numerosTransmutados.forEach(System.out::println);
		
	}
}
