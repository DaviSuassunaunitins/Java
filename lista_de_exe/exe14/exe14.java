package exe14;

import java.util.Scanner;

public class exe14 {

    static private Scanner input = new Scanner(System.in);

    private record Coordenadas(
        float pontoX,
        float pontoY
    ) {}

    static private Coordenadas[] coord = new Coordenadas[4];
    static private int pos = 0;
    static private float[] pontos = new float[4];
    static private double resul = 0;

    static private void setCoodenadas(float pontoX, float pontoY) {
        coord[pos] = new Coordenadas(pontoX, pontoY);
        pos++;
    }

    static private void calc() {
        resul = Math.pow(coord[1].pontoX - coord[0].pontoX, 2); 
        resul += Math.pow(coord[1].pontoY - coord[0].pontoY, 2);
        resul = Math.sqrt(resul);
    }

    static public void main(String[] args) {
        System.out.printf("\n===Calculadora de distância===");
        System.out.printf("\nDigite primeiro as coordenadas x e y do ponto A e depois do ponto B\n");
        for (int i = 0; i < 4; i++) {
            System.out.printf("Digite a coordeanada[%d]: ", i+1);
            pontos[i] = input.nextFloat();
            if (i == 1 || i == 3) {
                setCoodenadas(pontos[i-1], pontos[i]);
            }
        }
        calc();
        System.out.printf("A distãncia entre os pontos (%4.2f, %4.2f) e (%4.2f, %4.2f) é: %4.2f", coord[0].pontoX, coord[0].pontoY, coord[1].pontoX, coord[1].pontoY, resul);
        input.close();
    }
}
