import java.util.Scanner;

public class Uni4Exe20 {
    // Dadas 3 notas obtidas por um aluno em 3 provas e a média dos exercícios, descreva um 
    // algoritmo que calcule a média de aproveitamento e o conceito do aluno, usando a fórmula:
    // media = (notaProva1 + notaProva2 * 2 + notaProva3 * 3 + notaExercicios) / 7

    // media	        conceito
    // >= 9.0	            A
    // >= 7.5 e < 9.0	    B
    // >= 6.0 e < 7.5	    C
    // >= 4.0 e < 6.0	    D
    // < 4.0	            E

    // O algoritmo deve escrever a média de aproveitamento, o conceito correspondente e a mensagem 
    // "aprovado" caso o conceito seja A, B ou C, e "reprovado" caso o conceito seja D ou E.

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        double notaProva1 = scanner.nextDouble();
        System.out.println("Informe a segunda nota: ");
        double notaProva2 = scanner.nextDouble();
        System.out.println("Informe a terceira nota: ");
        double notaProva3 = scanner.nextDouble();
        System.out.println("Informe a média dos exercícios: ");
        double notaExercicios = scanner.nextDouble();

        double media = (notaProva1 + notaProva2 * 2 + notaProva3 * 3 + notaExercicios) / 7;
        char conceito;
        
        if (media >= 9) {
            conceito = 'A';
        } else if (media >= 7.5 && media < 9) {
            conceito = 'B';
        } else if (media >= 6 && media < 7.5) {
            conceito = 'C';
        } else if (media >= 4 && media < 6) {
            conceito = 'D';
        } else {
            conceito = 'E';
        }

        System.out.println("Média de aproveitamento: " + String.format("%.2f", media));
        System.out.println("Conceito correspondente: " + conceito);
        if (conceito == 'A' || conceito == 'B' || conceito == 'C') {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}
