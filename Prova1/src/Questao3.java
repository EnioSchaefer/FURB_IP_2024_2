import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String tipo = scanner.next().toUpperCase();

        if (tipo.equals("A")) {

            System.out.println("Azul");
        } else if (tipo.equals("V")) {

            System.out.println("Vermelha");
        } else if (tipo.equals("P")) {

            System.out.println("Preta");
        } else {

            System.out.println("Tipo Incorreto");
        }

        scanner.close();
    }
}