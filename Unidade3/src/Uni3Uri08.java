import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Uni3Uri08 {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Integer codigoA = scanner.nextInt();
        Integer quantidadeA = scanner.nextInt();
        Double valorA = scanner.nextDouble();

        Integer codigoB = scanner.nextInt();
        Integer quantidadeB = scanner.nextInt();
        Double valorB = scanner.nextDouble();

        Double valorTotalA = quantidadeA * valorA;
        Double valorTotalB = quantidadeB * valorB;

        Double valorFinal = valorTotalA + valorTotalB;
        
        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", valorFinal));
    }
 
}