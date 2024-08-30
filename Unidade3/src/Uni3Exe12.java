import java.util.Scanner;

public class Uni3Exe12 {
    // Uma empresa tem para um funcionário os seguintes dados:
    // o nome, o número de horas trabalhadas mensais e o número de dependentes.
    // A empresa paga R$ 10,00 por hora (valor para cálculo do salário trabalho)
    // e R$ 60,00 por dependente (valor para cálculo do salário família) e são feitos
    // descontos de 8,5% sobre o salário trabalho para o INSS e de 5% sobre o salário
    // trabalho para o imposto de renda. Descreva um programa que informe o nome,
    // o salário bruto e o salário líquido do funcionário.
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double valorHora = 10.0;
        Double valorPorDependente = 60.0;
        Double descontoINSS = 8.5;
        Double descontoIR = 5.0;

        System.out.println("Informe o nome do funcionário: ");
        String funcionarioNome = scanner.next();

        System.out.println("Informe a quantidade de horas trabalhadas: ");
        Double funcionarioHorasTrabalhadas = scanner.nextDouble();

        System.out.println("Informe a quantidade de pessoas dependentes do funcionário: ");
        Double funcionarioNumeroDependentes = scanner.nextDouble();

        Double salarioBruto = funcionarioHorasTrabalhadas * valorHora + funcionarioNumeroDependentes * valorPorDependente;

        Double salarioDescontoINSS = salarioBruto / 100 * descontoINSS;
        Double salarioDescontoIR = salarioBruto / 100 * descontoIR;

        Double salarioLiquido = salarioBruto - salarioDescontoINSS - salarioDescontoIR;

        System.out.println(funcionarioNome);
        System.out.println("Valor do salário bruto: R$" + salarioBruto);
        System.out.println("Valor do salário liquído: R$" + salarioLiquido);

        scanner.close();
    }
}
