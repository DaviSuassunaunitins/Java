import java.util.Scanner;

public class exe01 {
    static public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("\n===Converso de temperatura===");
        System.out.printf("\nDigite a temperatura em °C: ");
        float temp = input.nextFloat();
        temp = (temp * 9/5) + 32;
        System.out.printf("O equivalente em Fahrenheit é: %4.1f °F", temp);
        input.close();
    }
}