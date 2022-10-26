package br.com.projetoIza.cotacoes;

public class Real {

    final static String REAL = "Montante em R$: ";

    public void converteMoeda(float cotacao, float montante){

        System.out.println(REAL +  (cotacao*montante));
    }
}
