package exe13;

import java.util.Scanner;

public class exe13 {
    static public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String palavra = "";
        System.out.printf("\n===Verificador de palíndromo===");
        System.out.printf("\nPalíndromo = palavra que lê-se igual de trás para frente");
        System.out.printf("\nDigite a palavra que você quer verificar: ");
        String word = input.nextLine();
        
        int j = word.length();
        for (int i = 0; i < word.length(); i++) {
            if (j > 0) {
                palavra += word.charAt(j-1);
                j--;
            }
        }

        if (word.equalsIgnoreCase(palavra)) {
            System.out.printf("A palavra %s é um palíndromo", palavra);
        }
        else {
            System.out.printf("A palavra %s não é um palíndromo", palavra);
        }
        input.close();
    }
}
