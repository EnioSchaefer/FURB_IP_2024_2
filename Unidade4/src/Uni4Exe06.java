import java.util.Scanner;

public class Uni4Exe06 {
    // Faça um algoritmo que leia um caractere. Caso seja digitada a letra 'M'
    // escreva “Masculino”. Se for digitada a letra 'F' escreva “Feminino”.
    // Se for informado 'I' escreva “Não Informado”. Qualquer outra letra
    // digitada escreva “Entrada Incorreta”. Atenção: antes de testar a letra,
    // converta-a para maiúscula.

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor, sendo ele M, F, ou I: ");
        String letra = scanner.next().toUpperCase();

        if (letra.equals("I")) {
            System.out.println("Não Informado");
        } else if (letra.equals("M")) {
            System.out.println("Masculino");
        } else if (letra.equals("F")) {
            System.out.println("Feminino");
        } else {
            System.out.println("Entrada Incorreta");
        }

        scanner.close();
    }
}
