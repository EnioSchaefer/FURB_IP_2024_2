import java.util.Scanner;

public class Uni4Exe22 {
    // Um aluno está em dúvida sobre o título que vai receber após concluir seu curso de graduação. Considerando que o 
    // sistema apresenta 3 cursos disponíveis (1 – Ciência da Computação, 2 – Licenciatura da Computação e 3 – Sistemas de Informação) 
    // descreva um algoritmo para ler a opção do aluno e escrever uma mensagem informando o título que o aluno vai 
    // receber caso opte por aquele curso. As titulações são respectivamente: "Bacharel em Ciência da Computação", 
    // "Licenciado em Computação" e "Bacharel em Sistemas de Informação".

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a opção escolhida: ");
        int opcao = scanner.nextInt();

        String titulo;

        switch (opcao) {
            case 1:
                titulo = "Bacharel em Ciência da Computação";
                break;
            case 2:
                titulo = "Licenciado em Computação";
                break;
            case 3:
                titulo = "Bacharel em Sistemas de Informação";
                break;
            default:
                titulo = "Opção desconhecida";
                break;
        }

        System.out.println(titulo);

        scanner.close();
    }
}
