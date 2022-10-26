package br.com.projetoIza.controleEstoque;


public class ControleEstoque {
    Produtos produto = new Produtos();
    Precos preco = new Precos();

    public void adicionarEstoque (String item, float valor){
        produto.incluirProduto(item);
        preco.incluirPreco(valor);
        System.out.println("Estoque:");
       for (int i = 0; i<produto.tamanhoEstoqueProdutos();i++) {
            System.out.println("Produto "+(i+1)+": "+produto.procurarProduto(i)+", R$" + preco.procurarPreco(i));
        }

    }

    public void encontrarMenorPreco(){
        float menorPreco = preco.menorPreco();
        int posicao = preco.posicaoPrecoEstoque(menorPreco);
        String produtoBarato = produto.procurarProduto(posicao);
        System.out.printf("Menor preço: %s - R$ %.2f \n", produtoBarato, menorPreco);
    }

    public void encontrarMaiorPreco(){
        float maiorPreco = preco.maiorPreco();
        int posicao = preco.posicaoPrecoEstoque(maiorPreco);
        String produtoCaro = produto.procurarProduto(posicao);
        System.out.printf("Maior preço: %s - R$ %.2f \n", produtoCaro, maiorPreco);
    }


}
