import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Uni3Uri13 {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        Integer eventoTempoDuracaoSegundos = scanner.nextInt();
        Integer segundosFaltantes = eventoTempoDuracaoSegundos;
        
        Integer tempoHoras = segundosFaltantes / 3600;
        segundosFaltantes = segundosFaltantes % 3600;

        Integer tempoMinutos = segundosFaltantes / 60;
        segundosFaltantes = segundosFaltantes % 60;
        
        String tempoFinal = tempoHoras + ":" + tempoMinutos + ":" + segundosFaltantes;
        System.out.println(tempoFinal);
    }
 
}