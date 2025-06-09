package exe10;

import java.util.Scanner;

public class exe10 {
    static public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[1000];
        System.out.printf("\n===Verificador de posições===");
        System.out.printf("\nDigite quantos números você vai informar: ");
        int num = input.nextInt();
        input.nextLine();
        for (int i = 0; i < num; i++) {
            System.out.printf("Digite o número [%d]: ", i+1);
            nums[i] = input.nextInt();
            input.nextLine();
        }
        int menor = Integer.MAX_VALUE;
        int menorPosition = 0;
        int maior = 0;
        int maiorPosition = 0;
        for (int j = 0; j < num; j++) {
            if (maior < nums[j]) {
                maior = nums[j];
                maiorPosition = j;
            }
            else if (menor > nums[j]) {
                menor = nums[j];
                menorPosition = j;
            }
        }
        System.out.printf("\nMenor valor: %d (posição %d)", menor, menorPosition+1);
        System.out.printf("\nMaior valor: %d (posição %d)", maior, maiorPosition+1);
        input.close();
    }

}
