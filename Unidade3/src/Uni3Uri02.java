import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Uni3Uri02 {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Double raio = scanner.nextDouble();
        
        System.out.println("A=" + String.format("%.4f", raio * raio * 3.14159));
    }
 
}