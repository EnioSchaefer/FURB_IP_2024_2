import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Uni3Uri11 {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        Integer carroAVelocidadeMediaKmH = 60;
        Integer carroBVelocidadeMediaKmH = 90;
        
        Integer tempoMinutos = 60;
        Integer distanciaEntreCarrosKm = 30;
        Integer distanciaKmPorMinuto = tempoMinutos / distanciaEntreCarrosKm;
        
        Integer distanciaX = scanner.nextInt();
        
        Integer tempoDecorrido = distanciaX * distanciaKmPorMinuto;
        
        System.out.println(tempoDecorrido + " minutos");
    }
 
}