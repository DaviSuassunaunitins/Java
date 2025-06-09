package exe06;

import java.util.Scanner;

public class exe06 {
    static public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("\n===Calculadora===");
        System.out.printf("\nDigite até qual número você quer somar: ");
        int num = input.nextInt();
        input.nextLine();
        int i = 1;
        int soma = 0;
        if (num >= 1) {
            while (i <= num) {
                soma = i * (i + 1) / 2;
                i++;
            }
            System.out.printf("A soma dos números de 1 a %d é: %d", num, soma);
        }
        else {
            System.out.printf("Digite um número maior que 1");
        }
        input.close();
    }
}
