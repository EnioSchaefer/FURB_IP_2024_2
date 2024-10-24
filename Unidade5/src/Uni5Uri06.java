import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Uni5Uri06 {
 
    public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		for (int i = 1; i > 0; i++) {
			int senha = scanner.nextInt();

			if (senha == 2002) {
				System.out.println("Acesso Permitido");
				break;
			} else {
				System.out.println("Senha Invalida");
			}

		}
    }
 
}