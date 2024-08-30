import java.util.Scanner;

public class Uni3Exe09 {
    // Descreva um programa que calcule o volume de uma lata de óleo. Fórmula:
    // Fórmula: volume = PI * raio² * altura
    // Quantas casas decimais devo usar para o número Pi?
    // R: 15 casas decimais
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio da lata: ");
        double lataRaio = scanner.nextDouble();

        System.out.println("Digite a altura da lata: ");
        double lataAltura = scanner.nextDouble();

        double lataVolume = Math.PI * (lataRaio * lataRaio) * lataAltura;

        System.out.println("Volume da lata: " + lataVolume);

        scanner.close();
    }
}
