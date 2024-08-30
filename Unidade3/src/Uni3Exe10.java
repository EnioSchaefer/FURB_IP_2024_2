import java.util.Scanner;

public class Uni3Exe10 {
    // Descreva um programa que leia o comprimento dos catetos de um
    // triângulo retângulo e calcule o comprimento da hipotenusa.
    // Fórmula:
    // hipotenusa² = cateto1² + cateto²;
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do cateto A: ");
        double catetoA = scanner.nextDouble();

        System.out.println("Informe o valor do cateto B: ");
        double catetoB = scanner.nextDouble();

        double hipotenusaSqrd = catetoA * catetoA + catetoB * catetoB;
        System.out.println("Volume da lata: " + hipotenusaSqrd);

        scanner.close();
    }
}
