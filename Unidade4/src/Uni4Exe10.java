import java.util.Scanner;

public class Uni4Exe10 {
    // Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha.
    // Faça um algoritmo para ler as idades dos filhos e exibir quem
    // é o caçula da família; suponha que não haja empates.

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a idade de Marquinhos: ");
        Integer A = scanner.nextInt();
        System.out.println("Informe a idade de Zezinho: ");
        Integer B = scanner.nextInt();
        System.out.println("Informe a idade de Luluzinha: ");
        Integer C = scanner.nextInt();
        
        if (A < B && A < C) {
            System.out.println("Marquinhos é o filho caçula");
        } else if (B < A && B < C) {
            System.out.println("Zezinho é o filho caçula");
        } else {
            System.out.println("Luluzinha é a filha caçula");
        }

        scanner.close();
    }
}
