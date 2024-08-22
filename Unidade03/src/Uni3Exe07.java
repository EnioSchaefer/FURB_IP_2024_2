import java.util.Scanner;

public class Uni3Exe07 {
    // Uma fábrica de refrigerantes vende seu produto em três formatos: lata de 350 ml,
    // garrafa de 600 ml e garrafa de 2 litros.
    //  Se um comerciante compra uma determinada quantidade de cada formato,
    // faça um programa para calcular quantos litros de refrigerante ele comprou.
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double litragemLata = 0.35;
        Double litragemGarrafaPequena = 0.6;
        Integer litragemGarrafaGrande = 2;

        System.out.println("Digite a quantidade de latas (350ml): ");
        Integer quantidadeLata = scanner.nextInt();

        System.out.println("Digite a quantidade de garrafas (600ml): ");
        Integer quantidadeGarrafaPequena = scanner.nextInt();

        System.out.println("Digite a quantidade de garrafas (2l): ");
        Integer quantidadeGarrafaGrande = scanner.nextInt();

        Double litragemTotal = (quantidadeLata * litragemLata) + (quantidadeGarrafaPequena * litragemGarrafaPequena) + (quantidadeGarrafaGrande * litragemGarrafaGrande);

        System.out.println("Total em litros - " + litragemTotal);

        scanner.close();
    }
}
