import java.util.Scanner;

public class Uni4Exe07 {
    // O custo do selo de uma carta com até 50 gramas é de R$ 0,45. 
    // As cartas com peso superior pagam um adicional de R$ 0,45 por 
    // cada 20 gramas, ou fração, em que excedem aquele peso. 
    // Escreva um algoritmo que dado o peso da carta, em gramas, 
    // determine o custo do selo.


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o peso da carta em gramas: ");
        Double peso = scanner.nextDouble();

        Double valorPagar = 0.0;
        
        if (peso <= 50) {
            valorPagar = 0.45;
        } else {
            Double pesoExcedido = peso - 50;
            Double qtAdicional = (pesoExcedido / 20) + 1;
            
            valorPagar = 0.45f + 0.45f * qtAdicional;
        }

        System.out.println("Custo do selo: " + valorPagar);

        scanner.close();
    }
}
