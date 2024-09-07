import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Uni3Uri09 {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        Double A = scanner.nextDouble();
        Double B = scanner.nextDouble();
        Double C = scanner.nextDouble();
        
        Double areaTrianguloAC = A * C / 2;
        Double areaCirculoC = 3.14159 * (C * C);
        Double areaTrapezioABC = 0.5 * C * (A + B);
        Double areaQuadradoB = B * B;
        Double areaRetanguloAB = A * B;
        
        System.out.println("TRIANGULO: " + String.format("%.3f", areaTrianguloAC));
        System.out.println("CIRCULO: " + String.format("%.3f", areaCirculoC));
        System.out.println("TRAPEZIO: " + String.format("%.3f", areaTrapezioABC));
        System.out.println("QUADRADO: " + String.format("%.3f", areaQuadradoB));
        System.out.println("RETANGULO: " + String.format("%.3f", areaRetanguloAB));
    }
 
}