package exe02;

import java.util.Scanner;

public class exe02 {
    static public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("\n===Calculadora de juros compostos===");
        System.out.printf("\nDigite o valor do capital inicial(R$): ");
        double dinheiro = input.nextDouble();
        System.out.printf("Digite a taxa de juros mensal(%%): ");
        double taxa = input.nextDouble();
        System.out.printf("Digite o tempo(meses): ");
        double tempo = input.nextDouble();
        taxa = (1 + (taxa/100));
        taxa = Math.pow(taxa, tempo);
        dinheiro *= taxa;
        System.out.printf("Montante final: R$ %5.2f", dinheiro);
        input.close();
    }
}
