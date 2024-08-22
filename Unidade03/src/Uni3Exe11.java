import java.util.Scanner;

public class Uni3Exe11 {
    // Descreva um programa que dado uma temperatura em °C informe o seu valor em °F. Fórmula:

    // °F = (9/5) °C + 32
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a temperatura em graus Celsius (°C): ");
        double ValorCelsius = scanner.nextDouble();

        double valorFahrenheit = (ValorCelsius * (9 / 5)) + 32;
        System.out.println("Temperatura em Fahrenheit (°F): " + valorFahrenheit);

        scanner.close();
    }
}
