package exe03;

import java.util.Scanner;

public class exe03 {
    static public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("\n===Calculadora===");
        System.out.printf("\n=Operções=");
        System.out.printf("\n1-Adição");
        System.out.printf("\n2-Subtração");
        System.out.printf("\n3-Multiplicação");
        System.out.printf("\n4-Divisão");
        System.out.printf("\nEscolha entre uma das operações: ");
        int option = input.nextInt();
        input.nextLine();
        System.out.printf("Digite o primeiro número: ");
        float num1 = input.nextFloat();
        System.out.printf("Digite o segundo número: ");
        float num2 = input.nextFloat();
        String resul = "nada";

        if (option == 1) {
            num1 = num1 + num2;
            resul = Float.toString(num1);
        }
        else if (option == 2) {
            num1 = num1 - num2;
            resul = Float.toString(num1);
        }
        else if (option == 3) {
            num1 = num1 * num2;
            resul = Float.toString(num1);
        }
        else if (option == 4) {
            num1 = num1 / num2;
            resul = Float.toString(num1);
        }
        else {
            resul = "Digite uma operação válida...";
        }
        System.out.printf("=Resultado=");
        System.out.printf("\n%s", resul);
        input.close();
    }
}
