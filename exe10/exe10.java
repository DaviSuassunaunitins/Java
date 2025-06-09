import java.util.Scanner;

public class exe10 {
    
    static private Scanner input = new Scanner(System.in);

    private record Produtos(
        int code,
        String name,
        float valor,
        int quantidade
    ) {}

    static private Produtos[] produtos = new Produtos[100];
    static private int positionProduto = 0;

    static private void cadastrarProduto(int code, String name, float valor, int quantidade) {
        produtos[positionProduto] = new Produtos(code, name, valor, quantidade);
        positionProduto += 1;
    }

    static private void menuCadastrarProduto() {
        System.out.printf("\nCadastro de Produto:\n");

        System.out.printf("Id: ");
        int code = input.nextInt();
        input.nextLine();

        System.out.printf("Nome: ");
        String name = input.nextLine();

        System.out.printf("Valor: ");
        float valor = input.nextFloat();

        System.out.printf("Quantidade: ");
        int quantidade = input.nextInt();

        cadastrarProduto(code, name, valor, quantidade);
    }

    static private void listarProdutos() {
        System.out.printf("\nLista de produtos: ");
        for (int i = 0; i < positionProduto; i++) {
            System.out.printf("\nId: %d | Nome: %S | Valor: %5.2f | Estoque: %d", produtos[i].code, produtos[i].name, produtos[i].valor, produtos[i].quantidade);
        }
    }

    static private int buscarProduto(String nome) {
        for (int i = 0; i < positionProduto; i++) {
            if (produtos[i].name().equalsIgnoreCase(nome)) {
                return i;       
            }
        }
        return -1;
    }

    static private void menuBuscarProduto() {
        System.out.printf("\nDigite o nome do produto: ");
        String nome = input.nextLine();
        int i = buscarProduto(nome);
        if (i >= 0) {
            System.out.printf("\nId: %d | Nome: %S | Valor: %5.2f | Estoque: %d", produtos[i].code, produtos[i].name, produtos[i].valor, produtos[i].quantidade);
        }
        else {
            System.out.printf("Digite um item válido...");
        }
    }

    static private void atualizarEstoque() {
        System.out.printf("\nDigite o nome do produto que você deseja atualizar: ");
        String nome = input.nextLine();
        int i = buscarProduto(nome);
        if (i >= 0) {
            System.out.printf("\nId: %d | Nome: %S | Valor: %5.2f | Estoque: %d", produtos[i].code, produtos[i].name, produtos[i].valor, produtos[i].quantidade);

            System.out.printf("\nDigite das características você deseja atualizar: ");
            String option = input.nextLine();
            if (option.equalsIgnoreCase("Id")) {
                System.out.printf("\nDigite o novo Id: ");
                int code = input.nextInt();
                input.nextLine();
                produtos[i] = new Produtos(
                    code,
                    produtos[i].name(),
                    produtos[i].valor(),
                    produtos[i].quantidade()
                );
            }
            else if (option.equalsIgnoreCase("Nome")) {
                System.out.printf("\nDigite o novo nome: ");
                String name = input.nextLine();
                produtos[i] = new Produtos(
                    produtos[i].code(),
                    name,
                    produtos[i].valor(),
                    produtos[i].quantidade()
                );
            }
            else if (option.equalsIgnoreCase("Valor")) {
                System.out.printf("\nDigite o novo valor: ");
                float valor = input.nextFloat();
                produtos[i] = new Produtos(
                    produtos[i].code(),
                    produtos[i].name(),
                    valor,
                    produtos[i].quantidade()
                );
            }
            else if (option.equalsIgnoreCase("Estoque")) {
                System.out.printf("\nDigite o novo estoque: ");
                int quantidade = input.nextInt();
                input.nextLine();
                produtos[i] = new Produtos(
                    produtos[i].code(),
                    produtos[i].name(),
                    produtos[i].valor(),
                    quantidade
                );
            }
        }
        else {
            System.out.printf("Digite um item válido...");
        }
    }

    static private void baixoEstoque() {
        System.out.printf("\nBaixo estoque: ");
        for (int i = 0; i < positionProduto; i++) {
            int estoque = produtos[i].quantidade;
            if (estoque < 10) {
               System.out.printf("\nId: %d | Nome: %S | Valor: %5.2f | Estoque: %d", produtos[i].code, produtos[i].name, produtos[i].valor, produtos[i].quantidade); 
            }
        }
    }

    static public void main(String[] args) {
        
        int option = 0;
        while (true) {
            System.out.printf("\n\n\n== SISTEMA DE CONTROLE DE ESTOQUE ===\n");
            System.out.printf("1 - Cadastrar produto\n");
            System.out.printf("2 - Listar produtos\n");
            System.out.printf("3 - Buscar produto\n");
            System.out.printf("4 - Atualizar estoque\n");
            System.out.printf("5 - Relatório de produtos em baixo estoque\n");
            System.out.printf("6 - Sair\n");
            System.out.printf("Escolha uma opção: ");
            option = input.nextInt();
            input.nextLine();
            
            if (option == 0) {
                System.out.printf("\nEscolha uma alguma opção...\n");
            }

            else if (option == 1) {
                menuCadastrarProduto();
            }
            
            else if (option == 2) {
                listarProdutos();
            }
            
            else if (option == 3) {
                menuBuscarProduto();
            }
            
            else if (option == 4) {
                atualizarEstoque();
            }

            else if (option == 5) {
                baixoEstoque();
            }

            else if (option == 6) {
                System.out.printf("\nSaindo...");
                break;
            }

            else {
                System.out.printf("\nEscolha uma opção válida...\n");
            }
        }
    }
}