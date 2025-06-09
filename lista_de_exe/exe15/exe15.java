package exe15;

import java.util.Scanner;

public class exe15 {
    
    static private Scanner input = new Scanner(System.in);

    private record Lados(
        float medida
    ) {}
    
    static private Lados[] lados = new Lados[3];
    static private int pos = 0;

    static private void adcionarLados(float medida) {
        lados[pos] = new Lados(medida);
        pos++;
    }

    static private void verificarTriangle() {
        String resul = "";
        if (((lados[0].medida == lados[1].medida) && (lados[0].medida == lados[2].medida)) && (lados[1].medida == lados[2].medida)) {
            resul = "equilátero";
        }
        else if (((lados[0].medida == lados[1].medida) || (lados[0].medida == lados[2].medida)) || (lados[1].medida == lados[2].medida)) {
            resul = "isósceles";
        }
        else if (((lados[0].medida != lados[1].medida) && (lados[0].medida != lados[2].medida)) && (lados[1].medida != lados[2].medida)) {
            resul = "escaleno";
        }
        else {
            resul = "não fecha um triângulo";
        }
        System.out.printf("\nTipo: %s", resul);
    }

    static private void calcular() {
        float peri = 0.0F;
        double area = 0.0F;
        float numTemp = 0.0F;

        for (int i = 0; i < 3; i++) {
            peri += lados[i].medida;
        }
        System.out.printf("\nPerímetro: %4.2f", peri);

        peri /= 2;
        area = peri;
        for (int i = 0; i < 3; i++) {
            numTemp = peri - lados[i].medida;
            area *= numTemp;
        }
        area = Math.sqrt(area); 
        if (Double.isNaN(area)) {
            System.out.println("\nÁrea: não exata...");
        }
        else {
            System.out.printf("\nÁrea: %4.2f", area);
        }
    }
      
    static public void main(String[] args) {
        System.out.printf("\n===Calculadora de triângulo===");
        System.out.printf("\nLados: a = [1], b = [2] e c = [3]\n");
        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite valor do lado [%d]: ", i+1);
            float medida = input.nextFloat();
            adcionarLados(medida);
        }
        System.out.printf("\nTriângulo: ");
        System.out.printf("\nLados: %4.2f, %4.2f, %4.2f", lados[0].medida, lados[1].medida, lados[2].medida);
        verificarTriangle();
        calcular();

        input.close();
    }
}