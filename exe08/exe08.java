import java.util.Scanner;

public class exe08 {
    static public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] cadeiras = new String[50];
        for (int i = 0; i<50; i++) {
            cadeiras[i] = "O";
        }
        while (true) {
            System.out.printf("\n=== Sistema de reserva de assentos ===\n");
            
            System.out.printf("Mapa de assentos: \n");
            System.out.printf("   1 2 3 4 5 6 7 8 9 10\n");
            System.out.printf("   +-------------------\n");
            System.out.printf("A | ");
            for (int i=0; i<10; i++) {
                System.out.printf("%s ", cadeiras[i]);
            }
            System.out.printf("\nB | ");
            for (int i=10; i<20; i++) {
                System.out.printf("%s ", cadeiras[i]);
            }
            System.out.printf("\nC | ");
            for (int i=20; i<30; i++) {
                System.out.printf("%s ", cadeiras[i]);
            }
            System.out.printf("\nD | ");
            for (int i=30; i<40; i++) {
                System.out.printf("%s ", cadeiras[i]);
            }
            System.out.printf("\nE | ");
            for (int i=40; i<50; i++) {
                System.out.printf("%s ", cadeiras[i]);
            }
            System.out.printf("\n\nLegenda: O = Livre, X = Ocupado\n");
            
            System.out.printf("Digite a fileira (A-E): ");
            String AtoE = input.nextLine();
            int num;
            if (AtoE.equalsIgnoreCase("A")) {
                System.out.printf("\nDigite o número do assento (1-10): ");
                num = input.nextInt();
                if (cadeiras[num-1].equalsIgnoreCase("X")) {
                    System.out.printf("Sinto muito, mas essa cadeira está ocupada...");
                }
                else {
                    cadeiras[num-1] = "X";
                    System.out.printf("Acento %s%d reservado com sucesso!", AtoE, num);
                }
            }
            else if (AtoE.equalsIgnoreCase("B")) {
                System.out.printf("\nDigite o número do assento (1-10): ");
                num = input.nextInt();
                if (cadeiras[num+9].equalsIgnoreCase("X")) {
                    System.out.printf("Sinto muito, mas essa cadeira está ocupada...");
                }
                else {
                    cadeiras[num+9] = "X";
                    System.out.printf("Acento %s%d reservado com sucesso!", AtoE, num);
                }
            }
            else if (AtoE.equalsIgnoreCase("C")) {
                System.out.printf("\nDigite o número do assento (1-10): ");
                num = input.nextInt();
                if (cadeiras[num+19].equalsIgnoreCase("X")) {
                    System.out.printf("Sinto muito, mas essa cadeira está ocupada...");
                }
                else {
                    cadeiras[num+19] = "X";
                    System.out.printf("Acento %s%d reservado com sucesso!", AtoE, num);
                }
            }
            else if (AtoE.equalsIgnoreCase("D")) {
                System.out.printf("\nDigite o número do assento (1-10): ");
                num = input.nextInt();
                if (cadeiras[num+29].equalsIgnoreCase("X")) {
                    System.out.printf("Sinto muito, mas essa cadeira está ocupada...");
                }
                else {
                    cadeiras[num+29] = "X";
                    System.out.printf("Acento %s%d reservado com sucesso!", AtoE, num);
                }
            }
            else if (AtoE.equalsIgnoreCase("E")) {
                System.out.printf("\nDigite o número do assento (1-10): ");
                num = input.nextInt();
                if (cadeiras[num+39].equalsIgnoreCase("X")) {
                    System.out.printf("Sinto muito, mas essa cadeira está ocupada...");
                }
                else {
                    cadeiras[num+39] = "X";
                    System.out.printf("Acento %s%d reservado com sucesso!", AtoE, num);
                }
            }
            else {
                System.out.printf("\nDigite uma fileira válida...");    
            }
            System.out.printf("\nDigite 0 para sair: ");
            int sair = input.nextInt();
            input.nextLine();
            if (sair == 0) {
                System.out.printf("\nSaindo...");
                break;
            }
        }
        input.close();
    }
}