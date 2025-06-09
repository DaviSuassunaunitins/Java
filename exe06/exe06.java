package exe06;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class exe06 {
    static public void main(String[] args) {
        ArrayList<Character> letras = new ArrayList<>();
        ArrayList<Character> nums = new ArrayList<>();
        ArrayList<Character> caracters = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        String letra = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < letra.length(); i++) {
            letras.add(letra.charAt(i));            
        }
        String num = "0123456789";
        for (int i = 0; i < num.length(); i++) {
            nums.add(num.charAt(i));
        }
        String caracter = "!@#$%&*?";
        for (int i = 0; i < caracter.length(); i++) {
            caracters.add(caracter.charAt(i));
        }

        System.out.printf("\n\n\n=== Gerador de senhas ===\n\n");
        System.out.printf("Digite o comprimento da senha: ");
        int tamanho = input.nextInt();
        System.out.println("Opções de complexidade:");
        System.out.println("1 - Apenas letras");
        System.out.println("2 - Letras e números");
        System.out.println("3 - Letras, números e caracteres especiais");
        System.out.printf("Digite sua escolha: ");
        int comp = input.nextInt();
        input.nextLine();

        if ((comp >= 1) && (comp <= 3)) {
            System.out.printf("\nForça da senha: ");
            if (comp == 1) {
                if (tamanho <= 6) {
                    System.out.printf("Fraca\n");
                }
                else if (tamanho > 6) {
                    System.out.printf("Média\n");    
                }
            }
            else if (comp == 2) {
                if (tamanho <= 6) {
                    System.out.printf("Média\n");
                }
                else if (tamanho > 6) {
                    System.out.printf("Forte\n");    
                }
            }
            else if (comp == 3) {
                if (tamanho <= 6) {
                    System.out.printf("Média\n");
                }
                else if (tamanho > 6) {
                    System.out.printf("Forte\n");    
                }
            }
        }
        else {
            System.out.printf("Digite uma escolha válida");
        }

        String senha = "";
        int option;
        int posLetras;
        int posNums;
        int posCaracter;
        for (int i = 0; i < tamanho; i++) {
            option = rand.nextInt(comp) + 1;
            if (option == 1) {
                posLetras = rand.nextInt(letras.size());
                senha += letras.get(posLetras);
            }
            else if (option == 2) {
                posNums = rand.nextInt(nums.size());
                senha += nums.get(posNums);
            }
            else {
                posCaracter = rand.nextInt(caracters.size());
                senha += caracters.get(posCaracter);
            }
        }
        System.out.printf("\nSenha gerada: %s", senha);
        input.close();
    }
}