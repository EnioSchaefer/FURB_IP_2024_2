import java.util.Scanner;

public class Uni3Exe16 {
    // Suponha que um caixa disponha apenas de notas de 100, 10 e 1 reais.
    // Considerando que alguém está pagando uma compra, faça um programa que
    // determine e escreva o número mínimo de notas que o caixa deve fornecer como troco.
    // Escreva também o número de cada tipo de nota a ser fornecido como troco.
    // Suponha que o sistema monetário não utilize centavos.
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor recebido: ");
        Integer valorFaltante = scanner.nextInt();

        Integer troco100 = valorFaltante / 100;
        valorFaltante = valorFaltante % 100;

        Integer troco10 = valorFaltante / 10;
        valorFaltante = valorFaltante % 10;

        Integer troco1 = valorFaltante;
        valorFaltante = valorFaltante % 1;

        Integer notasQuantidade = troco100 + troco10 + troco1;

        System.out.println("Quantidade de notas para troco: " + notasQuantidade);
        System.out.println("Troco em notas de 100: " + troco100);
        System.out.println("Troco em notas de 10: " + troco10);
        System.out.println("Troco em notas de 1: " + troco1);

        scanner.close();
    }
}
