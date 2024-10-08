import java.util.Scanner;

public class Uni3Exe05 {
    // Uma granja possui um controle automatizado de cada frango da sua produção.
    // No pé direito do frango há um anel com um chip de identificação;
    // no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir.
    // Sabendo que o anel com chip custa R$ 4,00 e o anel de alimento custa R$ 3,50,
    // faça um programa para calcular o gasto total da granja para marcar todos os seus frangos.
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double anelIdValor = 4;
        double anelAlimentoValor = 3.5;

        System.out.println("Digite a quantidade de frangos: ");
        double frangoQuantidade = scanner.nextDouble();

        double anelIdValorTotal = frangoQuantidade * anelIdValor;
        double anelAlimentoValorTotal = frangoQuantidade * (anelAlimentoValor * 2);

        double frangoValorTotal = anelIdValorTotal + anelAlimentoValorTotal;

        System.out.println("Valor total gasto com os frangos - R$ " + frangoValorTotal);

        scanner.close();
    }
}
