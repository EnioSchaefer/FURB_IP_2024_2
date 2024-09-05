import java.util.Scanner;

public class Uni4Exe04 {
// Dado um número de ponto flutuante maior do que 0, 
// informe se foram digitadas ou não casas decimais no número.

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número de ponto flutuante maior do que 0: ");
        Double valor = scanner.nextDouble();
     
        if (valor % 1 == 0) {
            System.out.println("O número não possui casas decimais");
        } else {
            System.out.println("O número possui casas decimais");
        }

        scanner.close();
    }
}
