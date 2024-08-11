import java.util.Arrays;
import java.util.List;

public class Desafio15 {

	public static void main(String[] args) {
		// Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
		// Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.
			
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		boolean numNegativo = numeros.stream().anyMatch(n -> n < 0);
		System.out.println(numNegativo); 
		
	}
}