import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Uni3Uri05 {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        Integer A = scanner.nextInt();
        Integer B = scanner.nextInt();
        Integer C = scanner.nextInt();
        Integer D = scanner.nextInt();
        
        Integer DIFERENCA = (A * B - C * D);
        
        System.out.println("DIFERENCA = " + DIFERENCA);
    }
 
}