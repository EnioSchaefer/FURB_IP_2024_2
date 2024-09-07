import java.util.Scanner;

public class Uni4Exe16 {
    // Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres 
    // (considere que a idade entre homens e mulheres sempre serão diferentes). 
    // Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova, 
    // e o produto das idades do homem mais novo com a mulher mais velha.

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a idade do primeiro homem: ");
        Integer H1 = scanner.nextInt();
        System.out.println("Informe a idade do segundo homem: ");
        Integer H2 = scanner.nextInt();

        System.out.println("Informe a idade da primeira mulher: ");
        Integer M1 = scanner.nextInt();
        System.out.println("Informe a idade da segunda mulher: ");
        Integer M2 = scanner.nextInt();

        Integer Hnovo = 0;
        Integer Mnovo = 0;
        Integer Hvelho = 0;
        Integer Mvelho = 0;

        Integer soma = 0;
        Integer produto = 0;

        if (H1 < H2) {
            Hnovo = H1;
            Hvelho = H2;
        } else {
            Hnovo = H2;
            Hvelho = H1;
        }

        if (M1 < M2) {
            Mnovo = M1;
            Mvelho = M2;
        } else {
            Mnovo = M2;
            Mvelho = M1;
        }
        
        soma = Hvelho + Mnovo;
        produto =  Hnovo * Mvelho;

        System.out.println("A soma das idades do homem mais velho com a mulher mais nova é: " + soma);
        System.out.println("O produto das idades do homem mais novo com a mulher mais velha é: " + produto);

        scanner.close();
    }
}
