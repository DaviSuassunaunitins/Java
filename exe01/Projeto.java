import java.util.Scanner;
public class Projeto {
    static public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Olá, mundo!");
        System.out.println("Digite seu nome: ");
        String nome = input.next();
        System.out.println("Boa tarde " + nome + "!");
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();
        System.out.println("Você já tem " + idade + " anos!");
        System.out.println("Parabéns!");
        input.close();
    }
}