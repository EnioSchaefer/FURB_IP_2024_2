import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Uni5Uri07 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		
		String valores = "";
		int quantidadeCalculada = 0;
		int penultimoValor = 0;
		int ultimoValor = 0;

		for (int i = 0; i < N; i++) {
			if (quantidadeCalculada == 0) {
				valores += "0";
				++quantidadeCalculada;
			} else if (quantidadeCalculada == 1) {
				valores += " 1";
				ultimoValor = 1;
				++quantidadeCalculada;
			} else if (quantidadeCalculada == 2) {
				int valorAtual = penultimoValor + ultimoValor;
				valores += (" " + valorAtual);
				penultimoValor = ultimoValor;
				ultimoValor = valorAtual;
			}
		}

		System.out.println(valores);

	}

}