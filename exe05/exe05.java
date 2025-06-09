package exe05;

import java.util.Scanner;
import java.util.ArrayList;

public class exe05 {
    static public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        ArrayList<Boolean> OKs = new ArrayList<>();
        while (true) {
            System.out.printf("\n\n=== GERENCIADOR DE TAREFAS ===\n\n");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefa");
            System.out.println("3 - Marcar tarefa como concluída");
            System.out.println("4 - Sair");
            System.out.printf("\nDigite sua escolha: ");
            int option = input.nextInt();
            input.nextLine();
            if (option == 1) {
                System.out.printf("\n\n\n--- Adicionar tarefa ---\n\n");
                System.out.printf("Digite a descrição da tarefa: ");
                String task = input.nextLine();
                tasks.add(task);
                OKs.add(false);
            }
            else if (option == 2) {
                System.out.printf("\n\n\n--- Lista de tarefas ---\n\n");
                for (int i = 0; i < tasks.size(); i++ ) {
                    String ok = OKs.get(i) ? "[X]" : "[ ]";
                    String task = tasks.get(i);
                    System.out.printf("\n%d - %s %s\n", i + 1, ok, task);
                }
            }
            else if (option == 3) {
                int i = -1;
                System.out.printf("\n\n\n--- Marcar tarefa como concluída ---\n\n");
                System.out.printf("Digite o número da tarefa a ser concluída: ");
                i += input.nextInt();
                input.nextLine();
                String task = tasks.get(i);
                System.out.printf("\nTem certeza que deseja marcar a tarefa (%s) como concluída: [Y/N]\n", task);
                String YorN = input.nextLine();
                if (YorN.equalsIgnoreCase("Y")) {
                    OKs.set(i, true);
                    System.out.printf("\nA tarefa %s foi marcada com concluída", task);
                }
                else if (YorN.equalsIgnoreCase("N")) {
                    System.out.printf("\nRepense e tente de novo\n");
                }
                else {
                    System.out.printf("\nDigite uma resposta válida\n");
                }
            }
            else if (option == 4) {
                System.out.printf("\nSaindo...\n");
                break;
            }
            else {
                System.out.printf("\nDigite um número válido\n");
            }
        }
        input.close();
    }
}
