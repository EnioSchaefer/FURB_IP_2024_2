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

        String[] numeros = numeroInt.toString().split("");

        String mensagem = numeros[0] + " centena(s)" + "  " + numeros[1] + " dezena(s)" + "  " + numeros[2] + " unidade(s)";
        System.out.println(mensagem);

        scanner.close();
    }
}
