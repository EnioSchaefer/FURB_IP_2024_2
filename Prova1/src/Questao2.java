import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String formaPagamento = scanner.next().toUpperCase();

        double valorCompra = scanner.nextDouble();

        switch (formaPagamento) {
            case "DEBITO":
                System.out.println("Valor a ser pago: R$" + String.format("%.2f", valorCompra));
                break;
            case "PIX":
                double valorDesconto = valorCompra * 0.03;

                System.out.println("Valor a ser pago: R$" + String.format("%.2f", (valorCompra - valorDesconto)));
                break;
            case "CREDIARIO":
                int dataPagamento = scanner.nextInt();
                int dataVencimento = scanner.nextInt();
                int parcelasQtd = scanner.nextInt();

                if (dataPagamento <= dataVencimento) {
                    valorDesconto = valorCompra * 0.1;

                    System.out.println("O pagamento está em dia");

                    System.out.println("Valor a ser pago: " + parcelasQtd + "x de R$"
                            + String.format("%.2f", ((valorCompra - valorDesconto) / parcelasQtd)));
                } else if (dataPagamento > dataVencimento + 5) {
                    valorDesconto = valorCompra * 0.02;
                    valorDesconto = ((dataPagamento - 5) - dataVencimento) * valorDesconto;

                    System.out.println("Valor a ser pago: " + parcelasQtd + "x de R$"
                            + String.format("%.2f", ((valorCompra + valorDesconto) / parcelasQtd)));
                } else {
                    System.out.println("valor a ser pago: " + parcelasQtd + "x de R$"
                            + String.format("%.2f", (valorCompra / parcelasQtd)));
                }
                break;
            default:
                System.out.println("Forma de pagamento inválida");
                break;
        }

        scanner.close();
    }
}