import java.util.Scanner;

public class Uni4Exe01 {
//     A jornada de trabalho semanal de um funcionário é de 40 horas. 
//     O funcionário que trabalhar mais de 40 horas receberá hora extra, 
//     cujo cálculo é o valor da hora regular com um acréscimo de 50%. 
//     Escreva um algoritmo que leia o número de horas trabalhadas em um mês, 
//     o valor por hora e escreva o salário total do funcionário, 
//     que deverá ser acrescido das horas extras, caso tenham sido trabalhadas 
//     (considere que o mês possua 4 semanas exatas).
//     Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com as horas trabalhadas no mês: ");
        Integer horasTrabalho = scanner.nextInt();
        System.out.println("Entre com o valor pago por hora: ");
        Double horasValor = scanner.nextDouble();

        Double salarioTotal = horasTrabalho * horasValor;
        Integer horasExtra = 0;

        if (horasTrabalho > 160) {
            horasExtra = horasTrabalho - 40;
            horasTrabalho = horasTrabalho - horasExtra;
            Double salarioHorasExtra = horasExtra * (horasValor / 2);
            salarioTotal = salarioTotal + salarioHorasExtra; 
        }

        System.out.println("O salário total é: " + salarioTotal);

        scanner.close();
    }
}
