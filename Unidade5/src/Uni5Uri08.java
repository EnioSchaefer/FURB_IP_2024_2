import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Uni5Uri08 {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        if (N <= 0 || N >= 13) {
            System.out.println("N deve estar entre 1 e 12.");
        } else {
            int fatorial = 1;
            for (int i = 1; i <= N; i++) {
                fatorial *= i;
            }
            System.out.println(fatorial);
        }
    }
 
}