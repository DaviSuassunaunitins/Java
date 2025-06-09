package exe11;

import java.util.Scanner;

public class exe11 {
    static public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[1000];
        int[] numsOrdem = new int[1000];

        System.out.printf("\n===Organizador de números===");
        System.out.printf("\nDigite quantos números você vai informar: ");
        int quant = input.nextInt();
        input.nextLine();
        for (int i = 0; i < quant; i++) {
            System.out.printf("Digite o número[%d]: ", i+1);
            nums[i] = input.nextInt();
            input.nextLine();
        }

        int numMenor = 0;
        int pos = 0;

        for (int j = 0; j < quant; j++) {
            numMenor = Integer.MAX_VALUE;
            for (int i = 0; i < quant; i++) {
                if (nums[i] < numMenor) {
                    numMenor = nums[i];
                    pos = i;
                }
            }
            nums[pos] = Integer.MAX_VALUE;
            numsOrdem[j] = numMenor;
        }

        // for (int j = 0; j < quant - 1; j++) {
        //     int posMenor = j;
        //     for (int i = j + 1; i < quant; i++) {
        //         if (nums[i] < nums[posMenor]) {
        //             posMenor = i;
        //         }
        //     }
        //     if (posMenor != j) {
        //         int numTemp = nums[j];
        //         nums[j] = nums[posMenor];
        //         nums[posMenor] = numTemp;
        //     }

        // }

        System.out.printf("\nArray ordenado: \n");
        for (int i = 0; i < quant; i++) {
            // System.out.printf("%d, ", nums[i]);
            System.out.printf("%d, ", numsOrdem[i]);
        }
        
        input.close();
    }
}
