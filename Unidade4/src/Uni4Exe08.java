import java.util.Scanner;

public class Uni4Exe08 {
    // Dado uma letra, escreva um algoritmo que informe se ela é ou não uma vogal.

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a letra: ");
        String letra = scanner.next();
        
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("É vogal");
        } else {
            System.out.println("NÃO é vogal");
        }

        scanner.close();
    }
}
