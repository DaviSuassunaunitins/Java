package exe12;

import java.util.Scanner;

public class exe12 {
    static public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[9];
        System.out.printf("\n===Matriz===");
        System.out.printf("\nPosição dos números na matriz");
        System.out.printf("\n1  2  3\n4  5  6\n7  8  9\n");
        for (int i = 0; i < 9; i++) {
            System.out.printf("Digite o número[%d]: ", i+1);
            nums[i] = input.nextInt();
            input.nextLine();
        }


        System.out.printf("\n=Matriz informada=\n");
        for (int i = 0; i < 9; i++) {
            System.out.printf("%d  ", nums[i]);
            if (i == 2 || i == 5) {
                System.out.printf("\n");
            }
        }

        int soma = 0;
        int cont = 1;
        System.out.printf("\n\nSoma de cada linha:");
        for (int i = 0; i < 9; i++) {
            soma += nums[i];
            if ((i == 2 || i == 5) || i == 8) {
                System.out.printf("\nLinha %d: %d", cont, soma);
                soma = 0;
                cont++;
            }
        }

        System.out.printf("\n\nSoma de cada coluna:");
        for (int i = 0; i < 3; i++) {
            soma = nums[i] + nums[i+3] + nums[i+6];
            System.out.printf("\nColuna %d: %d", i+1, soma);
        }

        soma = nums[0] + nums[4] + nums[8];
        System.out.printf("\n\nSoma da diagonal principal: %d", soma);

        soma = nums[2] + nums[4] + nums[6];
        System.out.printf("\nSoma da diagonal secundária: %d", soma);

        input.close();
    }
}
