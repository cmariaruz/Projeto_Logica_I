package br.com.projetoIza.controleEstoque;

import java.util.ArrayList;
import java.util.Collections;

public class Precos {

    ArrayList<Float> preco = new ArrayList<>();

    public void incluirPreco(float valor){
        preco.add(valor);
    }

    public float maiorPreco(){
       return Collections.max(preco);
    }

    public float menorPreco(){
        return Collections.min(preco);
    }

    public int posicaoPrecoEstoque(float precoProcurado){
        return preco.indexOf(precoProcurado);
    }

    public float procurarPreco(int posicao){
        return preco.get(posicao);
    }



}
