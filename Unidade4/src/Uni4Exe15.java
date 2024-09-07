import java.util.Scanner;

public class Uni4Exe15 {
    // Elabore um algoritmo para exibir o valor de reajuste que um 
    // funcionário receberá no seu salário. A empresa irá conceder 5% 
    // de reajuste para o funcionário que for admitido há até de 12 meses. 
    // Para funcionário admitido entre 13 e 48 meses, irá conceder 7% de reajuste. 
    // O seu algoritmo deve solicitar ao usuário que digite a quantidade 
    // de meses que o funcionário foi admitido.

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informa há quantos meses foi admitido: ");
        Integer meses = scanner.nextInt();
        Integer reajuste = 0;

        if (meses <= 12) {
            reajuste = 5;
        } else if (meses > 12 && meses <= 48) {
            reajuste = 7;
        }

        System.out.println("Reajuste de: " + reajuste + "%");

        scanner.close();
    }
}
