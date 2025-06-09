package exe08;

import java.util.Scanner;

public class exe08 {
    static public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("\n===Sequência de Fibonacci===");
        System.out.printf("\nDigite quantos números entrarão na sequência: ");
        int num = input.nextInt();
        input.nextLine();
        int num1 = 0;
        int num2 = 1;
        if (num <= 2) {
            System.out.printf("%d, %d", num1, num2);
        }
        else {
            for (int i = 0; i < num / 2; i++) {
               System.out.printf("%d, %d, ", num1, num2);
               num1 += num2;
               num2 += num1;
            }
        }
        input.close();
    }
}
