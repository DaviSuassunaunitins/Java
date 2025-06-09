package exe05;

import java.util.Scanner;

public class exe05 {
    static public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("\n===Múltiplos===");
        System.out.println("\nDigite quantos números a sequência terá: ");
        int num = input.nextInt();
        input.nextLine();
        for (int i = 1; i <= num; i++) {
            if ((i % 3 == 0) && (i % 5 ==0)) {
                System.out.printf("FizzBuzz, ");
            }
            else if (i % 5 == 0) {
                System.out.printf("Buzz, ");
            }
            else if (i % 3 == 0) {
                System.out.printf("Fizz, ");    
            }
            else {
                System.out.printf("%d, ", i);
            }
        }
        input.close();
    }
}
