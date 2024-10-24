import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Uni5Uri04 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		int maiorValor = 0;
		int maiorValorIndex = 1;

		for (int i = 1; i <= 100; i++) {
			int valorInserido = scanner.nextInt();

			if (i == 0) {
				maiorValor = valorInserido;
			}

			if (valorInserido > maiorValor) {
				maiorValor = valorInserido;
				maiorValorIndex = i;
			}

		}

		System.out.println(maiorValor);
		System.out.println(maiorValorIndex);
	}

}