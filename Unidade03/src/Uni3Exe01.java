import java.util.Scanner;

public class Uni3Exe01 {
    // Uma imobiliária vende apenas terrenos retangulares.
    // Faça um programa para ler as dimensões de um terreno e depois exibir a área do terreno.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Digite o valor da largura: ");
        double largura = scanner.nextDouble();

        String area = String.valueOf(altura * largura);
        int posicaoPonto = area.indexOf('.');
        String areaFormatada = area.substring(0, posicaoPonto + 2);

        System.out.println("Total Area: " + areaFormatada + " m²");

        scanner.close();
    }
}
