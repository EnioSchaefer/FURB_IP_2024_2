import java.util.Scanner;

public class Uni4Exe27 {
    // As tarifas de um estacionamento são as seguintes:

    // 1° e 2° hora - R$ 5,00 cada
    // 3° e 4° hora - R$ 7,50 cada
    // 5° hora e seguintes - R$ 10,00 cada
    
    // O número de horas a pagar é sempre inteiro e arredondado para cima ou para baixo dependendo do tempo. 
    // Até 29 minutos depois da chegada, arredonda-se para baixo e após 30 minutos arredonda-se para cima. 
    // Por exemplo, quem estacionar durante 1 hora e 15 minutos pagará por 1 hora e quem estacionar por 1 hora e 35 minutos pagará por duas horas. 
    // Entretanto, se a pessoa permaneceu menos de 30 minutos, também pagará por uma hora. Os horários de chegada e partida são apresentados 
    // na forma de pares de inteiros, representando horas e minutos. Por exemplo, o par 12 50 representará meio dia e cinquenta. Assim, 
    // faça um algoritmo que leia os horários de chegada e de partida e escreva na tela o tempo que ficou estacionado, e o preço a ser cobrado. 
    // Deverá haver validação de dados. Admite-se que a chegada e a partida se dão com intervalo não superior a 24 horas, e sempre chegam e saem no mesmo dia.

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);   

        System.out.println("Digite a hora chegada: ");
        int chegadaHora = scanner.nextInt();
        System.out.println("Digite o minuto chegado: ");
        int chegadaMinuto = scanner.nextInt();

        System.out.println("Digite a hora saída: ");
        int saidaHora = scanner.nextInt();
        System.out.println("Digite o minuto saído: ");
        int saidaMinuto = scanner.nextInt();

        int filtroChegadaMinuto = 0;
        int filtroSaidaMinuto = 0;

        if (chegadaMinuto < 30) {
            filtroChegadaMinuto = 0;
        } else {
            filtroChegadaMinuto = 1;
        }

        if (saidaMinuto < 30) {
            filtroSaidaMinuto = 0;
        } else {
            filtroSaidaMinuto = 1;
        }

        int tempoEstacionado = (saidaHora + filtroSaidaMinuto) - (chegadaHora + filtroChegadaMinuto);
        Double valorPago;

        switch (tempoEstacionado) {
            case 0:
                valorPago = 5.0;
                break;
            case 1:
                valorPago = 5.0;
                break;
            case 2:
                valorPago = 2 * 5.0;
                break;
            case 3:
                valorPago = 3 * 7.5;
                break;
            case 4:
                valorPago = 4 * 7.5;
                break;
            case 5:
                valorPago = 5 * 10.0;
                break;
            default:
                valorPago = tempoEstacionado * 10.0;
                break;
        }

        System.out.println("Tempo estacionado: " + (saidaHora - chegadaHora) + " horas e " + (saidaMinuto - chegadaMinuto) + " minutos.");
        System.out.println("Preço cobrado: R$" + String.format("%.2f", valorPago));

        scanner.close();
    }
}
