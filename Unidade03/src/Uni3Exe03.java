import java.util.Scanner;

public class Uni3Exe03 {
    // Um motorista deseja abastecer seu tanque de combustível. 
    // Escreva um programa para ler o preço do litro da gasolina e 
    // o valor do pagamento e exibir quantos litros ele conseguiu colocar no tanque.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do litro de gasolina: ");
        double valorGasolina = scanner.nextDouble();

        System.out.println("Digite o valor pago para encher o tanque: ");
        double valorPago = scanner.nextDouble();

        double valorTotalTanque = valorPago / valorGasolina;

        System.out.println("Quantidade inserida no tanque: " + valorTotalTanque + " litros");

        scanner.close();
    }
}
