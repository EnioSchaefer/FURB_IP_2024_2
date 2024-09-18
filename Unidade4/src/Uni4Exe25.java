import java.util.Scanner;

public class Uni4Exe25 {
    // Faça um algoritmo que escreva o menu abaixo, leia uma opção do usuário e
    // execute a operação correspondente.
    // O algoritmo deve exibir uma mensagem de erro se a opção for inválida. O menu
    // tem as seguintes opções:

    // Escolha uma opção:
    // 1 - Soma de dois números.
    // 2 - Diferença entre dois números.
    // 3 - Produto entre dois números.
    // 4 - Divisão entre dois números (o denominador não pode ser zero).

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();
        System.out.println("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        System.out.println("Digite uma opção (1, 2, 3 ou 4): ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println(valor1 + valor2);
                break;
            case 2:
                System.out.println(Math.abs(valor1 - valor2));
                break;
            case 3:
                System.out.println(valor1 * valor2);
                break;
            case 4:
                switch (valor2) {
                    case 0:
                        System.out.println("Valor inválido");
                        break;
                    default:
                        System.out.println(valor1 / valor2);
                }
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }

        scanner.close();
    }
}
