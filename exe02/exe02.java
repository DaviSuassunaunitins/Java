package exe02;
import java.util.Scanner;

public class exe02 {
    static public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n----------------------------------------------------------------");
        System.out.printf("Calculadora de média de notas\n\n");
        System.out.printf("Quantos alunos há na turma: ");
        int alunos = input.nextInt();
        int quant = alunos;
        float notas = 0F;
        int aprovados = 0;
        int reprovados = 0;

        for (; alunos >= 1; alunos--){
            System.out.printf("Qual foi a nota do aluno (%d): ", alunos);
            float nota = input.nextFloat();
            if ((nota <= 10.0) && (nota >= 0.0)){
                if (nota >= 7.0F) {
                    notas += nota;
                    aprovados += 1;
                }
                else {
                    notas += nota;
                    reprovados += 1;
                }
            }
            else {
                System.out.println("Digite uma nota válida...");
                break;
            }
        }

        notas = notas / quant;
        System.out.printf("\nResultado da turma\n");
        System.out.printf("Média da turma: %5.2f\n", notas);
        System.out.printf("Aprovados: %d\n", aprovados);
        System.out.printf("Reprovados: %d\n", reprovados);
        float porcent = ((float)aprovados / (float)quant) * 100;
        System.out.printf("%.2f%% aprovados!", porcent);
        System.out.println("\n----------------------------------------------------------------");
        input.close();
    }
}