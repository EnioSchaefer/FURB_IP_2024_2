import java.util.Scanner;

public class Uni4Exe21 {
    // O índice de massa corporal (IMC) é uma medida internacional usada para calcular se uma pessoa está no peso ideal. 
    // O IMC é determinado pela divisão da massa do indivíduo pelo quadrado de sua altura, 
    // onde a massa está em quilogramas e a altura está em metros, de acordo com a fórmula:

    // imc = massa / (altura * altura)

    // Faça um algoritmo para classificar o IMC e dizer o grau de obesidade do indivíduo, de acordo com a seguinte tabela:

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Informe a massa: ");
        double massa = scanner.nextDouble();

        double imc = massa / (altura * altura);
        String classificacao;
        
        if (imc < 18.5) {
            classificacao = "Magreza";
        } else if (imc >= 18.5 && imc <= 24.9) {
            classificacao = "Saudável";
        } else if (imc >= 25 && imc <= 29.9){
            classificacao = "Sobrepeso";
        } else if (imc >= 30 && imc <= 34.9) {
            classificacao = "Obesidade Grau I";
        } else if (imc >= 35 && imc <= 39.9) {
            classificacao = "Obesidade Grau II (severa)";
        } else {
            classificacao = "Obesidade Grau III (mórbida)";
        }

        System.out.println(classificacao);

        scanner.close();
    }
}
