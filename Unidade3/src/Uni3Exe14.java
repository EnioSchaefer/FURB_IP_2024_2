import java.util.Scanner;

public class Uni3Exe14 {
    // Descreva um programa que a partir da distância percorrida e o do
    // tempo gasto por um motorista durante uma viagem de final de semana,
    // calcule a velocidade média e a quantidade de combustível gasto na viagem,
    // sabendo que o automóvel faz 12 km por litro.
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer kmPorLitro = 12;

        System.out.println("Informe a distância percorrida (km): ");
        Double distanciaKm = scanner.nextDouble();

        System.out.println("Informe o tempo decorrido na viagem (minutos): ");
        Double tempoMinutos = scanner.nextDouble();

        Double distanciaMetros = distanciaKm * 1000;
        Double velocidadeMediaMs = distanciaMetros / (tempoMinutos * 60);
        Double velocidadeMediaKmH = velocidadeMediaMs * 3.6;
        Double combustivelGasto = (distanciaMetros / 1000) / kmPorLitro;

        System.out.println("Velocidade média no trajeto: " + String.format("%.2f", velocidadeMediaKmH) + " km/h");
        System.out.println("Quantidade de combustível gasto no trajeto: " + String.format("%.2f", combustivelGasto) + " litros");

        scanner.close();
    }
}
