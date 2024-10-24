import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Uni5Uri02 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int valoresDentroIntervalo = 0;
		int valoresForaIntervalo = 0;

		for (int i = 0; i < N; i++) {
			int valorInserido = scanner.nextInt();

			if (valorInserido >= 10 && valorInserido <= 20) {
				++valoresDentroIntervalo;
			} else {
				++valoresForaIntervalo;
			}
		}

		System.out.println(valoresDentroIntervalo + " in");
		System.out.println(valoresForaIntervalo + " out");
	}

}