import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Uni3Uri07 {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        String vendedorNome = scanner.next();
        Double vendedorSalario = scanner.nextDouble();
        Double vendedorValorVendas = scanner.nextDouble();
        Double valorDesconto = vendedorValorVendas / 100 * 15;
        Double vendedorSalarioTotal = vendedorSalario + valorDesconto;
        
        System.out.println("TOTAL = R$ " + String.format("%.2f", vendedorSalarioTotal));
    }
 
}