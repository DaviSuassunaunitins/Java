package exe03;

import java.util.Scanner;

public class exe03 {
    static public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\n----------------------------------------------------------------\n");
            System.out.printf("Verificador de números primos\n");
            System.out.printf("Digite um número para verificar se é primo: \n");
            System.out.println("0 - Sair");
            double num = input.nextDouble();
            double raiz = (double) Math.round(Math.sqrt(num)) + 1;
            boolean option = true;
            if (num == 0) {
                System.out.println("Saindo...");
                break;
            } else if (num == 2) {
                option = true;
            } else if (num == 3) {
                option = true;
            } else if ((num % 2 == 0) && (num != 2)) {
                option = false;
                System.out.printf("Divisores: 1, 2");
            }
            for (int i = 3; i < raiz; i += 2) {
                if (num % i == 0) {
                    if (option) {
                        System.out.printf("Divisores: 1, %d ", i);
                    } else {
                        System.out.printf(", %d", i);
                    }
                    option = false;
                }
            }
            if (option) {
                System.out.printf("\nO número %.0f é primo\n", num);
            } else {
                System.out.printf("\nO número %.0f não é primo\n", num);
            }
            System.out.println("\n----------------------------------------------------------------\n");
        }
        input.close();
    }
}
