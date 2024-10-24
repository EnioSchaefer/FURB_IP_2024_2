import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double peso = scanner.nextDouble();
        double altura = scanner.nextDouble();

        if (altura <= 1.00 && peso <= 50) {
            System.out.println("Subnutrido");
            System.out.println("Perigo de vida");
        } else if (altura > 5.00) {
            System.out.println("Pegar medidas novamente");
        } else {
            System.out.println("Erro peso");   
        }

        System.out.println("fim");

        scanner.close();
    }
}