import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Uni3Uri12 {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Integer valorInteiro = scanner.nextInt();

        Integer valorRestante = valorInteiro;

        Integer troco100 = valorRestante / 100;
        valorRestante = valorRestante % 100;

        Integer troco50 = valorRestante / 50;
        valorRestante = valorRestante % 50;

        Integer troco20 = valorRestante / 20;
        valorRestante = valorRestante % 20;

        Integer troco10 = valorRestante / 10;
        valorRestante = valorRestante % 10;

        Integer troco5 = valorRestante / 5;
        valorRestante = valorRestante % 5;

        Integer troco2 = valorRestante / 2;
        valorRestante = valorRestante % 2;

        Integer troco1 = valorRestante;
        valorRestante = valorRestante % 1;

        System.out.println(valorInteiro);
        System.out.println(troco100 + " nota(s) de R$ 100,00");
        System.out.println(troco50 + " nota(s) de R$ 50,00");
        System.out.println(troco20 + " nota(s) de R$ 20,00");
        System.out.println(troco10 + " nota(s) de R$ 10,00");
        System.out.println(troco5 + " nota(s) de R$ 5,00");
        System.out.println(troco2 + " nota(s) de R$ 2,00");
        System.out.println(troco1 + " nota(s) de R$ 1,00");
    }
 
}