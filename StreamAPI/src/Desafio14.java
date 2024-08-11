import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio14 {

	public static void main(String[] args) {
		// Desafio 14 - Encontre o maior número primo da lista:
		// Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
			
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		int n = numeros.stream().filter(MathUtils::isPrime).max(Comparator.naturalOrder()).get();
		
		System.out.println(n);
	}
	
}