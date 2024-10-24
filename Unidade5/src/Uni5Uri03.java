import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Uni5Uri03 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		for (int i = 0; i < N; i++) {
			int valorInserido = scanner.nextInt();
			String saida = "";

			if (valorInserido != 0) {
				if (valorInserido % 2 == 0) {
					saida += "EVEN ";
				} else {
					saida += "ODD ";
				}

				if (valorInserido > 0) {
					saida += "POSITIVE";
				} else {
					saida += "NEGATIVE";
				}
			} else {
				saida += "NULL";
			} 

			System.out.println(saida);
		}
	}

}