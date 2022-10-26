package br.com.projetoIza.operadorEstoque;

import br.com.projetoIza.controleEstoque.ControleEstoque;

import java.util.Scanner;

public class OperadorEstoque {

    //static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        ControleEstoque estoque = new ControleEstoque();
        Boolean opcao;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Inclua o nome do produto no estoque. " +
                                "Para produtos com mais de uma palavra, use _ EX: canivete_suico:");
            String item = input.nextLine();
            System.out.println("Inclua o preco do produto no estoque:");
            float valor = input.nextFloat();

            estoque.adicionarEstoque(item, valor);

            System.out.println("Deseja incluir um item no estoque? S/N");
            opcao = //input.next().equals("S");
            input.next().equalsIgnoreCase("S");

        }while (opcao);
            estoque.encontrarMenorPreco();
            estoque.encontrarMaiorPreco();
    }

}
