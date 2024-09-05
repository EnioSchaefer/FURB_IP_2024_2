import java.util.Scanner;

public class Uni4Exe12 {
    // Dados 3 valores lado1, lado2, lado3, que representam os comprimentos dos lados de um triângulo,
    // descreva um algoritmo que verifique se os mesmos podem ser os comprimentos dos lados de um triângulo. 
    // Em caso afirmativo, verifique e informe se é "triângulo equilátero", "triângulo isósceles" ou 
    // "triângulo escaleno". Em caso negativo, informe que os mesmos não formam um triângulo. Considere que:

    // o comprimento de cada lado de um triângulo é menor que a soma dos comprimentos dos outros lados
    // um triângulo equilátero tem três lados iguais
    // um triângulo isóscele tem dois lados iguais e um diferente
    // um triângulo escaleno tem três lados diferentes

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um lado do triângulo: ");
        Integer A = scanner.nextInt();
        System.out.println("Informe outro lado do triângulo: ");
        Integer B = scanner.nextInt();
        System.out.println("Informe o último lado do triângulo: ");
        Integer C = scanner.nextInt();

        if (A > B + C || B > A + C || C > A + B) {
            System.out.println("Nâo formam um triângulo");
        } else {
            if (A == B && B == C) {
                System.out.println("É um triângulo equilátero");
            } else if (A != B && A != C && B != C) {
                System.out.println("É um triângulo escaleno");
            } else {
                System.out.println("É um triângulo isóceles");
            }
        }

        scanner.close();
    }
}
