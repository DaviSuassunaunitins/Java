package exe04;

import java.util.Scanner;

public class exe04 {
    static public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("\n===Verificador de triãngulos===");
        System.out.printf("\nDigite os 3 lados do possível triângulo");
        System.out.printf("\na: ");
        float ladoA = input.nextFloat();
        System.out.printf("b: ");
        float ladoB = input.nextFloat();
        System.out.printf("c: ");
        float ladoC = input.nextFloat();
        String resul = "start";

        if (((ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB)) && (ladoB + ladoC > ladoA)) {
            if (((ladoA == ladoB) && (ladoB == ladoC)) && (ladoA == ladoC)) {
                resul = "É um triângulo equilátero (todos os lados iguais)";
            }
            else if (((ladoA == ladoB && ladoA != ladoC) || (ladoB == ladoC && ladoB != ladoA)) || (ladoC == ladoA && ladoC != ladoB)) {
                resul = "É um triângulo isóceles (dois lados iguais)";
            }
            else if (((ladoA != ladoB) && (ladoB != ladoC)) && (ladoA != ladoC)) {
                resul = "É um triângulo escaleno (todos os lados diferentes)";
            }
        }
        else {
            resul = "Não é um triângulo";
        }

        System.out.printf("=Resultado=");
        System.out.printf("\n%s", resul);
        input.close();
    }
}
