import java.util.Scanner;

public class Uni3Exe15 {
    // Construa um programa para ler um número inteiro
    // (assuma até 3 dígitos) e imprima a saída da seguinte forma:
    // X centena(s)  Y dezena(s) K unidade(s)  
    // Exemplo, se for submetido o número 384, o programa deverá exibir:
    // 3 centena(s)  8 dezena(s) 4 unidade(s) 
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        Integer numeroInt = scanner.nextInt();

        Integer unidade = numeroInt % 10;
        Integer dezena = numeroInt - unidade % 100;
        Integer centena = numeroInt - dezena - unidade % 1000;

        String mensagem = centena + " centena(s)" + "  " + dezena + " dezena(s)" + "  " + unidade + " unidade(s)";
        System.out.println(mensagem);

        scanner.close();
    }
}
