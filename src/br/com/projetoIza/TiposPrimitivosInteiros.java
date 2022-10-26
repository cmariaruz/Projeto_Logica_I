package br.com.projetoIza;

public class TiposPrimitivosInteiros {

    //variável de classe: se aplica para todos os métodos dentro da classe
    final static long LONG_ESTATICO = 5; //final deixa a variavel constante
    final static double DOUBLE_CONSTANTE = 2.5;

    public static void main(String[] args) {

        //variáveis locais: iniciam e morrem dentro da execução do método
        short b = 1;
        int i = 5;
        long l = 1;


        /*
        soma +
        subtração -
        divisão /
        multiplicação *
         */

        int soma = i + 10;
        int sub = i - 10;
        int div = (int) (i/LONG_ESTATICO);
        int mult = i*10;


        /*
        System.out.println("soma = " + somar(i,(int)LONG_ESTATICO));
        System.out.println("subtracao = " + sub);
        System.out.println("divisao = " + dividir(i,DOUBLE_CONSTANTE));
        System.out.println("multiplicacao = " + mult);
        */

        int var1 = 1;
        if (var1 <=10){
            tabuada(var1);
            var1++;
        }

    }

    static int somar (int var1, int var2){
      int soma = var1 + var2;
      return soma;
    }

    static void tabuada(int var1){
        int fator = 1;
        if (fator<10){
            System.out.println(var1 + "x" + fator + " = " + (var1*fator));
            fator++;
        }

    }

    static double dividir (double var1, double var2){
        double divisao = var1/var2;
        return divisao;
    }
}
