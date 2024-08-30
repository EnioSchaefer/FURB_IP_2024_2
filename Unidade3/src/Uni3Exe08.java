import java.util.Scanner;

public class Uni3Exe08 {
    // Uma pessoa foi até uma casa de câmbio trocar dólares por reais.
    // Para isto ela entregou um valor em dólares para o atendente.
    // Considerando que o atendente tem a cotação do dólar,
    // descreva um programa para calcular quantos reais o atendente deve devolver para a pessoa.
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double dolarCotacao = 5.37;

        System.out.println("Digite o valor recebido em dólares - USD: ");
        double valorRecebido = scanner.nextDouble();

        double valorResultante = valorRecebido * dolarCotacao;

        System.out.println("Total após conversão - R$ " + valorResultante);

        scanner.close();
    }
}
