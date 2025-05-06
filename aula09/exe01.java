package aula09;

import java.util.Scanner;

public class exe01 {
    static public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] notas = new float[50];
        float[] difs = new float[50];
        float media = 0;
        float qtd = 0;
        int qtdAlunos = 0;

        System.out.printf("Digite quantos alunos entraram na contagem: ");
        qtdAlunos = input.nextInt();
        
        for (int i=0; i<qtdAlunos; i++) {
            System.out.printf("\nNota do aluno %d: ", i+1);
            notas[i] = input.nextFloat();
            media += notas[i];
            qtd++;
        }
        
        media = media / qtd;
        System.out.printf("\nA média foi de: %4.2f", media);

        for(int j=0; j<qtdAlunos;j++) {
            float dif = notas[j] - media;
            if (dif < 0) {
                dif = dif + dif;
            }
        }

        for (int k=0; k<qtdAlunos;k++) {
            System.out.printf("\nA nota do aluno %d foi %4.2f que difere %4.2f da média", k+1, notas[k], difs[k]);
        }

        input.close();
    }
}