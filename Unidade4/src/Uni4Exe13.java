import java.util.Scanner;

public class Uni4Exe13 {
    // Escreva um algoritmo que obtém do usuário 3 valores inteiros representando as 
    // três cartas deste usuário em uma mão de jogo de truco 
    // (1 = AS; 2 = 2; 3 = 3; 7 = 7; 11 = Valete; 12 = Dama; 13 = Rei). 
    // O algoritmo deve imprimir na tela a palavra "TRUCO" (se APENAS UMA das três cartas for AS, 2 ou 3), 
    // "SEIS" (se APENAS DUAS das três cartas for AS, 2 ou 3) ou 
    // "NOVE" (se AS TRÊS cartas forem AS, 2 ou 3). 
    // Se não houver AS, 2 ou 3 nas três cartas, não é impresso nada.
    // Dica: criar variáveis intermediárias para contar a quantidade de "boas".

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe as 3 cartas: ");
        Integer A = scanner.nextInt();
        Integer B = scanner.nextInt();
        Integer C = scanner.nextInt();

        Integer qtCartasBoas = 0;

        if (A == 1 || A == 2 || A == 3) {
            ++qtCartasBoas;
        }
        if (B == 1 || B == 2 || B == 3) {
            ++qtCartasBoas;
        }
        if (C == 1 || C == 2 || C == 3) {
            ++qtCartasBoas;
        }

        if (qtCartasBoas == 1) {
            System.out.println("TRUCO");
        } else if (qtCartasBoas == 2) {
            System.out.println("SEIS");
        } else if (qtCartasBoas == 3) {
            System.out.println("NOVE");
        }

        scanner.close();
    }
}
