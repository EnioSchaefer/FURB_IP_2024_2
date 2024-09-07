import java.util.Locale;
import java.util.Scanner;

public class Uni4Exe18 {
    // Uma loja que trabalha com crediário funciona da seguinte maneira: 
    // se o pagamento ocorre até o dia do vencimento, o cliente ganha 10%
    // de desconto e é avisado que o pagamento está em dia. 
    // Se o pagamento é realizado até cinco dias após o vencimento o cliente perde o desconto, 
    // e se o pagamento atrasa mais de cinco dias, é cobrada uma multa de 2% por cada dia de atraso. 
    // Faça um algoritmo que leia o dia do vencimento, o dia do pagamento e o valor da prestação e calcule 
    // o valor a ser pago pelo cliente, exibindo as devidas mensagens. Suponha que todo vencimento 
    // ocorre até o dia dez de cada mês e os clientes nunca deixam para pagar no mês seguinte.
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o dia do vencimento: ");
        Integer vencimentoDia = scanner.nextInt();

        System.out.println("Informe o dia do pagamento: ");
        Integer pagamentoDia = scanner.nextInt();

        System.out.println("Informe o valor da prestação: ");
        Double prestacaoValor = scanner.nextDouble();

        Double desconto10 = prestacaoValor * 10 / 100;
        Double multaDia = prestacaoValor * 2 / 100;
        Double valorFinal;

        if (pagamentoDia <= vencimentoDia) {
            valorFinal = prestacaoValor - desconto10;
        } else if (pagamentoDia <= vencimentoDia + 5) {
            valorFinal = prestacaoValor;
        } else {
            valorFinal = prestacaoValor + (multaDia * (pagamentoDia - vencimentoDia - 5));
        }

        System.out.println("Valor base da prestacao: R$ " + String.format(Locale.GERMANY, "%.2f", prestacaoValor));

        if (valorFinal > prestacaoValor) {
            System.out.println("Valor de multa: R$ " + String.format(Locale.GERMANY, "%.2f", valorFinal - prestacaoValor));
        } else if (valorFinal < prestacaoValor) {
            System.out.println("Valor do desconto: R$ -" + String.format(Locale.GERMANY, "%.2f", desconto10));
        } else {
            System.out.println("Valor do desconto: R$ 0,00");
        }

        System.out.println("Valor final: R$ " + String.format(Locale.GERMANY, "%.2f", valorFinal));

        scanner.close();
    }
}
