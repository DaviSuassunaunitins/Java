import java.util.Scanner;

public class aula{
    static public void main(String[] args){
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("\n----------------------------------------------------------------");
            System.out.printf("Sistema de Login\n\n");
            System.out.println("Digite o nome do usuário: ");
            String login = input.nextLine();
            System.out.println("Digite a senha: ");
            String senha = (String)(input.nextLine());
            System.out.println("----------------------------------------------------------------");
            if (login.equals("admin") && senha.equals("123456")) {
                System.out.println("\nAcesso liberado!");
                break;
            }
            else {
                System.out.println("\nLogin e senha inválidos");
                System.out.printf("Você já usou %d tentativas\n", i);
            }
        }
        input.close();
    }
}