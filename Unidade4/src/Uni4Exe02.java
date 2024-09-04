import java.util.Scanner;

public class Uni4Exe02 {
//     Dado um valor inteiro maior do que 0 informe se o valor é par ou ímpar.
//     Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um valor inteiro maior do que 0: ");
        Integer valor = scanner.nextInt();
     
        if (valor % 2 == 0) {
            System.out.println("Número é par");
        } else {
            System.out.println("Número é impar");
        }

        scanner.close();
    }
}
