import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Desafio13 {

	public static void main(String[] args) {
		// Desafio 13 - Filtrar os números que estão dentro de um intervalo:
		// Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.
			
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero do intervalo: ");
		int intervalo1 = scan.nextInt();
		System.out.print("Digite o segundo numero do intervalo: ");
		int intervalo2 = scan.nextInt();
		
		numeros.stream().filter(n -> (n > intervalo1 && n < intervalo2)).forEach(System.out::println);
		
		scan.close();
	}

}
