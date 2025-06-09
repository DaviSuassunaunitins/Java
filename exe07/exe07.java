package exe07;

import java.util.Scanner;

public class exe07 {
    static public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("\n=== Calculadora de juros compostos ===\n");
        
        System.out.printf("\nDigite o capital inicial (R$) : ");
        float capitalInicial = input.nextFloat();
        input.nextLine();
        
        System.out.printf("\nOpções de capitalização:\n");
        System.out.println("1 - Anual");
        System.out.println("2 - Semestral");
        System.out.println("3 - Trimestral");
        System.out.println("4 - Mensal");
        System.out.printf("Digite a sua escolha: ");
        int option = input.nextInt();
        input.nextLine();
        
        double temp = 0;
        float juros = 0;
        int progresso = 0;
        String nomeTemp = null;

        if (option == 1) {
            System.out.printf("\nDigite em quantos anos os juros serão válidos: ");
            temp = input.nextDouble();
            input.nextLine();
            System.out.printf("\nDigite a taxa de juros anual (%%): ");
            juros = input.nextFloat();
            input.nextLine();
            progresso = 1;
            nomeTemp = "anual";
        }
        else if (option == 2) {
            System.out.printf("\nDigite em quantos semestres os juros serão válidos: ");
            temp = input.nextDouble();
            input.nextLine();
            System.out.printf("\nDigite a taxa de juros semestral (%%): ");
            juros = input.nextFloat();
            input.nextLine();
            progresso = 2;
            nomeTemp = "semestral";
        }
        else if (option == 3) {
            System.out.printf("\nDigite em quantos trimestres os juros serão válidos: ");
            temp = input.nextDouble();
            input.nextLine();
            System.out.printf("\nDigite a taxa de juros trimestral (%%): ");
            juros = input.nextFloat();
            input.nextLine();
            progresso = 4;
            nomeTemp = "trimestral";
        }
        else if (option == 4) {
            System.out.printf("\nDigite em quantos meses os juros serão válidos: ");
            temp = input.nextDouble();
            input.nextLine();
            System.out.printf("\nDigite a taxa de juros mensal (%%): ");
            juros = input.nextFloat();
            input.nextLine();
            progresso = 12;
            nomeTemp = "mensal";
        }
        else {
            System.out.printf("\nDigite uma escolha válida...");
        }

        
        System.out.printf("\n--- Resultado ---\n");
        System.out.printf("Capital inicial: R$ %5.2f\n", capitalInicial);
        System.out.printf("Taxa de juros: %4.2f%% %s\n", juros, nomeTemp);
        System.out.printf("Período total: \n");

        juros = juros / 100;
        juros = 1 + juros;

        Double M;
        temp = progresso * temp;
        
        if ((progresso == 1) && (temp >= 1)) {
            for (int i = 1; i <= temp; i++) {
                M = capitalInicial * Math.pow(juros, i);
                System.out.printf("Ano %d: %.2f\n", i, M);
            }
        }
        else if ((progresso == 2) && (temp >= 1)) {
            for (int i = 1; i <= temp; i++) {
                M = capitalInicial * Math.pow(juros, i);
                System.out.printf("Semestre %d: %.2f\n", i, M);
            }
        }
        else if ((progresso == 4) && (temp >= 1)) {
            for (int i = 1; i <= temp; i++) {
                M = capitalInicial * Math.pow(juros, i);
                System.out.printf("Trimestre %d: %.2f\n", i, M);
            }
        }
        else if ((progresso == 12) && (temp >= 1)) {
            for (int i = 1; i <= temp; i++) {
                M = capitalInicial * Math.pow(juros, i);
                System.out.printf("Mensal %d: %.2f\n", i, M);
            }
        }
        else {
            System.out.printf("Digite números válidos...");
        }
        M = capitalInicial * Math.pow(juros, temp);
        System.out.printf("Montante final: %.2f", M);
        input.close();
    }
}