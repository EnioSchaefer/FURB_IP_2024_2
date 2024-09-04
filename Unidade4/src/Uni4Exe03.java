import java.util.Scanner;

public class Uni4Exe03 {
//     Dados dois números inteiros descreva um algoritmo para informar o maior valor entre eles.

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um valor inteiro: ");
        Integer A = scanner.nextInt();
        System.out.println("Entre com outro valor inteiro: ");
        Integer B = scanner.nextInt();

        Integer maior;
     
        if (A > B) {
            maior = A;
        } else {
            maior = B;
        }

        System.out.println("O maior valor é: " + maior);

        scanner.close();
    }
}
