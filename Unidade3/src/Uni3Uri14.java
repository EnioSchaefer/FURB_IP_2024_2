import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Uni3Uri14 {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Double valorRecebido = scanner.nextDouble();
        Integer valorRecebidoInteiro = valorRecebido.intValue();
        Integer valorRecebidoDecimal = (int) ((valorRecebido - valorRecebidoInteiro) * 100);

        Integer valorRestanteInteiro = valorRecebidoInteiro;
        Integer valorRestanteDecimal = valorRecebidoDecimal;

        Integer trocoNota100 = valorRestanteInteiro / 100;
        valorRestanteInteiro = valorRestanteInteiro % 100;

        Integer trocoNota50 = valorRestanteInteiro / 50;
        valorRestanteInteiro = valorRestanteInteiro % 50;

        Integer trocoNota20 = valorRestanteInteiro / 20;
        valorRestanteInteiro = valorRestanteInteiro % 20;

        Integer trocoNota10 = valorRestanteInteiro / 10;
        valorRestanteInteiro = valorRestanteInteiro % 10;

        Integer trocoNota5 = valorRestanteInteiro / 5;
        valorRestanteInteiro = valorRestanteInteiro % 5;

        Integer trocoNota2 = valorRestanteInteiro / 2;
        valorRestanteInteiro = valorRestanteInteiro % 2;

        // MOEDAS

        Integer trocoMoeda100 = valorRestanteInteiro;

        Integer trocoMoeda50 = valorRestanteDecimal / 50;
        valorRestanteDecimal = valorRestanteDecimal % 50;

        Integer trocoMoeda25 = valorRestanteDecimal / 25;
        valorRestanteDecimal = valorRestanteDecimal % 25;

        Integer trocoMoeda10 = valorRestanteDecimal / 10;
        valorRestanteDecimal = valorRestanteDecimal % 10;

        Integer trocoMoeda5 = valorRestanteDecimal / 5;
        valorRestanteDecimal = valorRestanteDecimal % 5;

        Integer trocoMoeda1 = valorRestanteDecimal;

        System.out.println("NOTAS:");
        System.out.println(trocoNota100 + " nota(s) de R$ 100.00");
        System.out.println(trocoNota50 + " nota(s) de R$ 50.00");
        System.out.println(trocoNota20 + " nota(s) de R$ 20.00");
        System.out.println(trocoNota10 + " nota(s) de R$ 10.00");
        System.out.println(trocoNota5 + " nota(s) de R$ 5.00");
        System.out.println(trocoNota2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(trocoMoeda100 + " moeda(s) de R$ 1.00");
        System.out.println(trocoMoeda50 + " moeda(s) de R$ 0.50");
        System.out.println(trocoMoeda25 + " moeda(s) de R$ 0.25");
        System.out.println(trocoMoeda10 + " moeda(s) de R$ 0.10");
        System.out.println(trocoMoeda5 + " moeda(s) de R$ 0.05");
        System.out.println(trocoMoeda1 + " moeda(s) de R$ 0.01");

    }
 
}