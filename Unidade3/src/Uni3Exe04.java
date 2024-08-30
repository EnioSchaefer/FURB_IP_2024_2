import java.util.Scanner;

public class Uni3Exe04 {
    // Faça um programa para ler três notas de um aluno em uma disciplina e imprimir 
    // a sua média ponderada (as notas tem pesos respectivos de 5, 3 e 2).

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite o valor da segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite o valor da terceira nota: ");
        double nota3 = scanner.nextDouble();

        double notaMedia = ((nota1 * 0.5) + (nota2 * 0.3) + (nota3 * 0.2)) / 3;

        System.out.println("Media final: " + notaMedia);

        scanner.close();
    }
}
