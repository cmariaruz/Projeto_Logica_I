package br.com.projetoIza.controleEstoque;

import java.util.ArrayList;

public class Produtos {

    ArrayList<String> produto = new ArrayList<>();

    public void incluirProduto(String item){
        produto.add(item);
    }

    public String procurarProduto(int posicao){
        return produto.get(posicao);
    }

    public int tamanhoEstoqueProdutos(){
        return produto.size();
    }
}
