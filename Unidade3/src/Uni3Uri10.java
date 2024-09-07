import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Uni3Uri10 {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        Double x1 = scanner.nextDouble();
        Double y1 = scanner.nextDouble();
        
        Double x2 = scanner.nextDouble();
        Double y2 = scanner.nextDouble();

        Double distanciaEntrePontos = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        
        System.out.println(String.format("%.4f", distanciaEntrePontos));
    }
 
}