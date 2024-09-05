import java.util.Scanner;

public class Uni4Exe11 {
    // Escreva um algoritmo para ler o ano de nascimento de 3 irmãos,
    // escrever uma mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, APENAS IRMÃOS.
    // Considere que eles são GÊMEOS se dois deles possuem a mesma idade
    // e o outro diferente dos demais, e apenas irmãos se todas as idades forem diferentes.

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o ano de nascimento do primeiro irmão: ");
        Integer A = scanner.nextInt();
        System.out.println("Informe o ano de nascimento do segundo irmão: ");
        Integer B = scanner.nextInt();
        System.out.println("Informe o ano de nascimento do terceiro irmão: ");
        Integer C = scanner.nextInt();
        
        if (A == B && B == C) {
            System.out.println("São TRIGÊMIOS");
        } else if (A != B && A != C && B != C) {
            System.out.println("São APENAS IRMÃOS");
        } else {
            System.out.println("São GÊMEOS");
        }

        scanner.close();
    }
}
