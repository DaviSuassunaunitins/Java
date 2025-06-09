package Estoque;

import java.util.Scanner;

public class estoque {

    private record Produto(
        String nome,
        int quant
    ){};

    static private Scanner input = new Scanner(System.in);
    static private int position = 0;
    static private Produto[] produtos = new Produto[100];

    static private int menuPrincipal(){
        System.out.printf("\n==Loja simples==\n");
        System.out.printf("1-Cadastrar produto\n");
        System.out.printf("2-Vender produto\n");
        System.out.printf("3-Sair\n");
        System.out.printf("\nOpção: ");
        int option = input.nextInt();
        input.nextLine();
        return option;
    }

    static private void cadastrarProduto(String nome, int quant){
        produtos[position] = new Produto(nome, quant);
        position++;
    }

    static private int procurarProduto(String nome){
        for (int i=0; i<position; i++){
            if (produtos[i].nome.equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return -1;
    }

    static private void menuCadastrarProduto(){
        System.out.printf("\n==Cadastrar produto==\n");
        System.out.printf("Digite o nome do produto: ");
        String nome = input.nextLine();
        System.out.printf("Digite a quantidade de produtos: ");
        int quant = input.nextInt();
        input.nextLine();
        cadastrarProduto(nome, quant);
    }

    static private void venderProduto(){
        System.out.printf("\n==Vender produto==\n");
        for (int i = 0; i<position; i++){
            System.out.printf("Produto[%d]: %s [%d]\n", i+1, produtos[i].nome(), produtos[i].quant());
        }
        System.out.printf("\nDigite o nome do produto: ");
        String nomeNow = input.nextLine();
        int pos = procurarProduto(nomeNow);
        System.out.printf("Digite a quantidade de produtos: ");
        int quantNow = input.nextInt();
        input.nextLine();
        if ((pos>=0) && (quantNow<=produtos[pos].quant())) {
            System.out.printf("\nProduto[%d]: %s [%d]", pos+1, produtos[pos].nome(), quantNow);
            System.out.printf("\nVocê tem certeza que quer vender esse produto [y/n]: ");
            String YorN = input.nextLine();
            if (YorN.equalsIgnoreCase("Y")) {
                System.out.printf("\nVenda de %d do produto %s foi concluída com sucesso!\n", quantNow, produtos[pos].nome());
                produtos[pos] = new Produto(
                    produtos[pos].nome(),
                    produtos[pos].quant() - quantNow
                );
            }
            else if (YorN.equalsIgnoreCase("N")) {
                System.out.printf("\nVenda não foi concluída...\n");
            }
            else {
                System.out.printf("\nDigite uma opção válida e tente novamente...\n");
            }
        }
        else {
            System.out.printf("\nVocê não a quantidade necessária para vender, escolha outro número e tente novamente...");
        }
    }

    static public void main(String[] args){
        int option;
        while (true) {
            option = menuPrincipal();
            if (option==1) {
                menuCadastrarProduto();
            }
            else if (option==2) {
                venderProduto();
            }
            else if (option==3) {
                System.out.printf("\nSaindo...\n");
                break;
            }
            else {
                System.out.printf("\nDigite um número válido e tente novamente...\n");
            }
        }
        input.close();
    }
}