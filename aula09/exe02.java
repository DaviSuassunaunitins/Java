package aula09;

import java.util.Scanner;

public class exe02 {
    static public void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("Digite a nota do 1° aluno: ");
            float nota1 = input.nextFloat();
            System.out.println("Digite a nota do 2° aluno: ");
            float nota2 = input.nextFloat();
            System.out.println("Digite a nota do 3° aluno: ");
            float nota3 = input.nextFloat();
            float media = (nota1 + nota2 + nota3) / 3;
            System.out.printf("A média da nota dos alunos foi de: %4.2f\n", media);
            
            if (nota1 < media) {
                float nota1R = media - nota1;
                System.out.printf("Notsa do aluno 1 é %4.2f que é %4.2f menor que a média\n", nota1, nota1R);
            }
            else if (nota1 == media) {
                System.out.printf("Nota do aluno 1 é %4.2f que é igual a média\n", nota1);
            }
            else {
                float nota1R = nota1 - media;
                System.out.printf("Nota do aluno 1 é %4.2f que é %4.2f maior que a média\n", nota1, nota1R);
            }
            if (nota2 < media) {
                float nota2R = media - nota2;
                System.out.printf("Notsa do aluno 2 é %4.2f que é %4.2f menor que a média\n", nota2, nota2R);
            }
            else if (nota2 == media) {
                System.out.printf("Nota do aluno 2 é %4.2f que é igual a média\n", nota2);
            }
            else {
                float nota2R = nota2 - media;
                System.out.printf("Nota do aluno 2 é %4.2f que é %4.2f maior que a média\n", nota2, nota2R);
            }
            if (nota3 < media) {
                float nota3R = media - nota3;
                System.out.printf("Notsa do aluno 3 é %4.2f que é %4.2f menor que a média\n", nota3, nota3R);
            }
            else if (nota3 == media) {
                System.out.printf("Nota do aluno 3 é %4.2f que é igual a média\n", nota3);
            }
            else {
                float nota3R = nota3 - media;
                System.out.printf("Nota do aluno 3 é %4.2f que é %4.2f maior que a média\n", nota3, nota3R);
            }
        input.close();
    }
}
