package exe07;

import java.util.Scanner;

public class exe07 {
    static public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("\n===Calculadora de fatorial===");
        System.out.printf("\nDigite um número em fatorial: ");
        int num = input.nextInt();
        input.nextLine();
        int resul = num;
        for (int i = 1; i < num - 1; i++) {
            resul *= (num-i);
        }
        System.out.printf("\n%d! = %d", num, resul);

        input.close();
    }
}
