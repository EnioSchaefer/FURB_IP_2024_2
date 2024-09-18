import java.util.Scanner;

public class Uni4Exe26 {
    // Dado um caractere indicando uma opção, escreva um algoritmo para:

    // se opção = ‘T’: calcular a área de um triângulo de base b e altura h
    // se opção = ‘Q’: calcular a área de um quadrado de lado l
    // se opção = ‘R’: calcular a área de um retângulo de base b e altura h
    // se opção = ‘C’: calcular a área de um círculo de raio r

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção");
        System.out.println("T: calcular a área de um triângulo de base b e altura h");
        System.out.println("Q: calcular a área de um quadrado de lado l");
        System.out.println("R: calcular a área de um retângulo de base b e altura h");
        System.out.println("C: calcular a área de um círculo de raio r");

        String opcao = scanner.next();

        switch (opcao) {
            case "T":
                System.out.println("Digite a base e a altura do triângulo");
                double base = scanner.nextDouble();
                double altura = scanner.nextDouble();
                System.out.println("Área do triângulo = " + base * altura / 2);
                break;
            case "Q":
                System.out.println("Digite o lado");
                double lado = scanner.nextDouble();

                System.out.println("Área do quadrado = " + lado * lado);
                break;
            case "R":
                System.out.println("Digite a base e a altura do retângulo");
                Double base2 = scanner.nextDouble();
                double altura2 = scanner.nextDouble();
                
                System.out.println("Área do retângulo = " + base2 * altura2);
                break;
            case "C":
                System.out.println("Digite o raio");
                double raio = scanner.nextDouble();

                System.out.println("Área do círculo = " + Math.PI * Math.pow(raio, 2));
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }  

        scanner.close();
    }
}
