import java.util.Scanner;

public class Uni4Exe09 {
    // Dados dois valores inteiros, escreva um algoritmo que 
    // informe se eles são múltiplos ou não.

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        Integer A = scanner.nextInt();
        System.out.println("Informe outro número inteiro: ");
        Integer B = scanner.nextInt();
        
        if (A % B == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }

        scanner.close();
    }
}
