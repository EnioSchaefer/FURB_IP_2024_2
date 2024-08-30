import java.util.Scanner;

public class Uni3Exe06 {
    // Um restaurante cobra R$ 25,00 por cada quilo de refeição.
    // Escreva um programa que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar.
    // O peso do prato é de 750 gramas.
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pratoPesoBase = 0.75;
        double refeicaoValorKg = 25;

        System.out.println("Digite o peso total do prato (em Kg): ");
        double pratoPesoTotal = scanner.nextDouble();

        double refeicaoValorTotal = (pratoPesoTotal - pratoPesoBase) * refeicaoValorKg;

        System.out.println("Valor final do prato - R$ " + refeicaoValorTotal);

        scanner.close();
    }
}
