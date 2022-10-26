package br.com.projetoIza.tarefa_operacoes;

public class Tabuada {
    public void calcularTabuada(float fator1, float fator2){
        Multiplicar multiplicar = new Multiplicar();

        int fator = 0;
        while( fator<=fator2){
            multiplicar.realizarOperacao(fator1,fator);
            //System.out.println(var1 + "x" + fator + " = " + tabuada);
            ++fator;
        }
    }
}
