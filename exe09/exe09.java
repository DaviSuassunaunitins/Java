import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class exe09 {

    static private ArrayList<Float> nums = new ArrayList<>();
        
    static private void ordem(int num) {
        Collections.sort(nums);
    }

    static private float media(int num) {
        float media = 0.0F;
        for (int i = 0; i < num; i++) {
            media += nums.get(i);
        }
        media = media / num;
        return media;
    }

    static private float mediana(int num) {
        float mediana = 0.0F;
        if (num % 2 == 0) {
            int meio1 = (num-1) / 2;
            int meio2 = meio1 + 1;
            float num1 = nums.get(meio1);
            float num2 = nums.get(meio2);
            mediana = (num1 + num2) / 2;
        } 
        else {
            float meio = (float)num / 2;
            meio -= 0.5F;
            int i = (int)meio;
            mediana = nums.get(i);
        }
        return mediana;
    }
    
    static private float min(int num) {
        float numMenor = Float.MAX_VALUE;
        for (int i = 0; i < num; i++) {
            if (numMenor > nums.get(i)) {
                numMenor = nums.get(i);
            }
        }
        return numMenor;
    }

    static private float max(int num) {
        float numMaior = 0.0F;
        for (int i = 0; i < num; i++) {
            if (numMaior < nums.get(i)) {
                numMaior = nums.get(i);
            }
        }
        return numMaior;
    }

    static private double variancia(int num) {
        double numVariancia = 0;
        double numDaVez;
        double media = media(num);
        for (int i = 0; i < num; i++) {
            numDaVez = nums.get(i);
            numDaVez = numDaVez - media;
            numVariancia += Math.pow(numDaVez, 2);
        }
        numVariancia = numVariancia / (num-1);
        return numVariancia; 
    }

    static private double desvioPad(int num) {
        double desvio = 0.0F;
        double numVariancia = variancia(num);
        desvio = (float) Math.sqrt(numVariancia);
        return desvio;
    }

    static public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("\n\n===Sistema de estatística===\n\n");
        System.out.printf("Quantos números você vai digitar: ");
        int num = input.nextInt();
        input.nextLine();
        
        for (int i = 0; i < num; i++) {
            System.out.printf("\nDigite o número [%d]: ", i+1);
            nums.add(input.nextFloat());
        }

        ordem(num);

        System.out.printf("\nEstatística:\n");
        System.out.printf("Média: %5.2f\n", media(num));
        System.out.printf("Mediana: %5.2f\n", mediana(num));
        System.out.printf("Menor valor: %5.2f\n", min(num));
        System.out.printf("Maior valor: %5.2f\n", max(num));
        System.out.printf("Variância: %5.2f\n", variancia(num));
        System.out.printf("Desvio padrão: %5.2f\n", desvioPad(num));

        input.close();
    }
}