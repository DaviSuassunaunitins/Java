package exe04;

import java.util.Scanner;

public class exe04 {
    static public void main (String[] args) {
        Scanner input = new Scanner(System.in);
        float saldo = 1000.00F;
        while (true) {            
            System.out.printf("\n\n=== CAIXA ELETRÔNICO ===\n\n");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depósito");
            System.out.println("3 - Saque");
            System.out.println("4 - Sair");
            System.out.printf("\nDigite sua escolha: ");
            int option = input.nextInt();

            if (option == 1) {
                System.out.printf("\nSaldo atual: R$ %5.2f\n", saldo);
            }
            else if (option == 2) {
                System.out.printf("\nDigite o valor do depósito: ");
                float dep = input.nextFloat();
                if (dep >= 1.0F) {
                    saldo += dep;
                    System.out.printf("\nDepósito de R$ %5.2f realizado com sucesso.\n", dep);
                }   
                else {
                    System.out.printf("\nDigite um valor maior que 1 real\n");
                } 
            }
            else if (option == 3) {
                System.out.printf("\nDigite o valor do saque: ");
                float saq = input.nextFloat();
                if (saq > saldo) {
                    System.out.printf("\nSaldo insuficiente\n");
                }
                else {
                    saldo -= saq;
                    System.out.printf("\nSaque de R$ %5.2f realizado com sucesso.\n", saq);
                }
            }
            else if (option == 4) {
                System.out.println("Saindo...");
                break;
            }
            else {
                System.out.println("Digite um número válido");
            }
        }
        input.close();
    }
}
