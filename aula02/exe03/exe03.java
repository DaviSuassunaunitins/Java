package exe03;
import java.util.Scanner;

public class exe03 {
    static public void main(String[] args){
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\n----------------------------------------------------------------\n");
            System.out.println("Verificador de números primos");
            System.out.printf("Digite um número para verificar se é primo: \n");
            System.out.println("Digite 0 para sair");
            double num = input.nextDouble();
            double raiz = (double)Math.round(Math.sqrt(num));
            int option = 0;
            if (num == 0) {
                System.out.println("Saindo...");
                break;
            }
            else if ((num == 1) || (num == 2)) {
                option = 1;
            }
            else if (num == 3) {
                option = 1;
            }
            else {
                for (int i = 3; i < raiz; i += 2) {
                    if (num % i == 0) {
                        option = 2;
                    }
                    // else {
                    //     option = 1;
                    // }
                } 
            }
            if (option == 1) {
                System.out.printf("O número %.0f é primo\n", num);
            }
            else if (option == 2) {
                System.out.printf("O número %.0f não é primo\n", num);
            }
            else {
                System.out.println("Esse número não entra no verificador...\n");
                break;
            }
            System.out.println("\n----------------------------------------------------------------\n");
        }
        input.close();
    }
}
