package optional;

import java.util.Optional;

public class OptionalEstados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Optional<String> optionalString = Optional.of("Valor presente");
		
		System.out.println("Valor opcional que est� presente");
		optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("n�o est� presente"));
		
		Optional<String> optionalNull = Optional.ofNullable(null);
		
		System.out.println("Valor opcional que n�o est� presente");
		optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = n�o est� presente"));
		
		Optional<String> emptyOptional = Optional.empty();
		
		System.out.println("Valor opcional que n�o est� presente");
		emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = n�o est� presente"));
		
		Optional<String> optionalNullErro = Optional.of(null);
		System.out.println("Valor opcional que n�o est� presente");
		optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("erro = n�o est� presente"));
		
		
	}

}
