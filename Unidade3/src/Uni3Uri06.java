import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Uni3Uri06 {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        Integer funcionarioNumero = scanner.nextInt();
        Integer funcionarioHorasTrabalhadas = scanner.nextInt();
        Double funcionarioValorHora = scanner.nextDouble();
        
        Double funcionarioSalario = funcionarioValorHora * funcionarioHorasTrabalhadas;
        
        System.out.println("NUMBER = " + funcionarioNumero);
        System.out.println("SALARY = U$ " + String.format("%.2f", funcionarioSalario));
    }
 
}