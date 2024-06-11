package streamapi;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExemplo {
	public static void main(String[] args) {
		
		Supplier<String> saudacao = () -> "Ola, seja bem vindo!";
		
		List<String> listaSaudacao = Stream.generate( () -> "Ola, seja bem vindo!" )
				.limit(10)
				.toList();
		
		listaSaudacao.forEach(System.out::println);
	}
}
