package exe09;

import java.util.Scanner;

public class exe09 {
    static public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[100000];
        System.out.printf("\n===Inversão de números===");
        System.out.printf("\nDigite quantos números você vai digitar: ");
        int num = input.nextInt();
        input.nextLine();
        for (int i = 0; i < num; i++) {
            System.out.printf("Digite o número [%d]: ", i+1);
            nums[i] = input.nextInt();
            input.nextLine();
        }
        System.out.printf("=Números invertidos=");
        for (int j = num-1; j >= 0; j--) {
            System.out.printf("\n%d", nums[j]);
        }
        input.close();
    }
}
