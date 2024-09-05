import java.util.Scanner;

public class Uni4Exe05 {
    // Dada uma pergunta, “a cor é azul?”, faça um programa que leia uma variável 
    // lógica com a resposta e responda “Sim”, caso a resposta seja true, ou “Não”, 
    // caso seja false. Para resolver este problema pode se utilizar do algoritmo 

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A cor é azul?");
        Boolean resposta = scanner.nextBoolean();
     
        if (resposta) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }

        scanner.close();
    }
}
