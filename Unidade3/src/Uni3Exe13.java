import java.util.Scanner;

public class Uni3Exe13 {
    // Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50.
    // Faça um programa para ler o comprimento e altura de uma parede (em metros),
    // e depois escrever o valor gasto com a compra de azulejos.
    // Considere que um metro quadrado é formado por 9 azulejos.
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double azulejoValor = 12.5;
        Integer azulejoQuantidadeMetro = 9;
        Double azulejoValorMetro = azulejoValor * azulejoQuantidadeMetro;

        System.out.println("Informe o comprimento da parede em metros: ");
        Double paredeComprimento = scanner.nextDouble();

        System.out.println("Informe a altura da parede em metros: ");
        Double paredeAltura = scanner.nextDouble();

        Double paredeArea = paredeComprimento * paredeAltura;
        double valorFinalAzulejos = paredeArea * azulejoValorMetro;

        System.out.println("Valor gasto com azulejos nesta parede: R$" + String.format("%.2f", valorFinalAzulejos));

        scanner.close();
    }
}
