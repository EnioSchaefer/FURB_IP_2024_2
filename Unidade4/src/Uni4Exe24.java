import java.util.Scanner;

public class Uni4Exe24 {
    // Dados 3 valores, escreva um algoritmo que os informe em uma determinada ordem a partir de um menu de opções:

    // se opção = 1, escreva os 3 valores em ordem crescente
    // se opção = 2, escreva os 3 valores em ordem decrescente
    // se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);   

        System.out.println("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();
        System.out.println("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();
        System.out.println("Digite o terceiro valor: ");
        int valor3 = scanner.nextInt();
        
        System.out.println("Digite uma opção (1, 2 ou 3): ");
        int opcao = scanner.nextInt();
        int valorMenor = 0;
        int valorMedio = 0;
        int valorMaior = 0;

        if (valor1 < valor2 && valor1 < valor3) {
            valorMenor = valor1;
        } else if (valor2 < valor1 && valor2 < valor3) {
            valorMenor = valor2;
        } else if (valor3 < valor2 && valor3 < valor1) {
            valorMenor = valor3;
        }

        if (valor1 > valor2 && valor1 > valor3) {
            valorMaior = valor1;
        } else if (valor2 > valor1 && valor2 > valor3) {
            valorMaior = valor2;
        } else if (valor3 > valor1 && valor3 > valor2) {
            valorMaior = valor3;
        }

        if ((valor1 < valor2 && valor1 > valor3) || (valor1 > valor2 && valor1 < valor3)) {
            valorMedio = valor1;
        } else if ((valor2 < valor1 && valor2 > valor3) || (valor2 > valor1 && valor2 < valor3)) {
            valorMedio = valor2;
        } else if ((valor3 < valor1 && valor3 > valor2) || (valor3 > valor1 && valor3 < valor2)) {
            valorMedio = valor3;
        }

        switch (opcao) {
            case 1:
                System.out.println(valorMenor + " " + valorMedio + " " + valorMaior);
                break;
            case 2:
            System.out.println(valorMaior + " " + valorMedio + " " + valorMenor);
                break;
            case 3:
            System.out.println(valorMedio + " " + valorMaior + " " + valorMenor);
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }

        scanner.close();
    }
}
