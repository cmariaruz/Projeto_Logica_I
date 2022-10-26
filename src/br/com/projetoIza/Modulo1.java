package br.com.projetoIza;

import java.security.DrbgParameters;
import java.util.Scanner;



   /* public static void main(String[] args) {
        int var1 = 1;
        while (var1 <=10){
            tabuada(var1);
            ++var1;
        }
    }*/

    /*
    public static void main(String[] args) {
        int opcao;
        Scanner input = new Scanner(System.in);
        float var1;
        float var2;

        System.out.println("Bem vindo a calculadora!!");
        System.out.println("Qual operação deseja realizar? 1 = Somar; 2 = Subtrair; 3 = Multiplicar; 4 = Dividir;");
        opcao = input.nextInt();
        System.out.println("Entre com a primeira variável da operacao:");
        var1 = input.nextInt();
        System.out.println("Entre com a segunda variável da operacao:");
        var2 = input.nextInt();

        if(opcao == 1){
            System.out.println(somar(var1, var2));
        }else if (opcao == 2){
            System.out.println(subtrair(var1,var2));
        }else if (opcao == 3){
            System.out.println(multiplicar(var1,var2));
        }else if (opcao == 4) {
            System.out.println(dividir(var1, var2));
        }else System.out.println("Voce nao escolheu uma operacao valida! Adeus!");
    }

    static void tabuada (int var1){
        int fator = 1;
        int tabuada;
        while( fator<10){
            tabuada = fator*var1;
            System.out.println(var1 + "x" + fator + " = " + tabuada);
            ++fator;
        }
    }

    static int [] selecionarOperacao(){
        int opcao;
        Scanner input = new Scanner(System.in);
        float var1;
        float var2;

        System.out.println("Qual operação deseja realizar? 1 = Somar; 2 = Subtrair; 3 = Multiplicar; 4 = Dividir;");
        opcao = input.nextInt();
        System.out.println("Entre com a primeira variável da operacao:");
        var1 = input.nextInt();
        System.out.println("Entre com a segunda variável da operacao:");
        var2 = input.nextInt();
        return [opcao,var1,var2];
    }
    static float somar (float var1, float var2){
        float soma = var1 + var2;
        return soma;
    }

    static float subtrair (float var1, float var2){
        float subtracao = var1 - var2;
        return subtracao;
    }

    static float multiplicar (float var1, float var2){
        float multiplicacao = var1 * var2;
        return multiplicacao;
    }

    static float dividir (float var1, float var2){
        float divisao = var1 / var2;
        return divisao;
    }
    */
    public class Modulo1 {

        final static int RENDIMENTO =12;

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            float distancia;

            System.out.println("Bem vindo!!");
            System.out.print("Entre com o tempo gasto em horas:");
            float tempo = input.nextFloat();
            System.out.print("Entre com a velocidade media em km/h:");
            float velocidade = input.nextFloat();
            distancia = calcularDistancia(tempo,velocidade);
            System.out.println("Velocidade media: "+ velocidade);
            System.out.println("Tempo gasto: "+ tempo);
            System.out.println("Distancia percorrida: "+ distancia);
            System.out.println("Quantidade de litros usados: "+ calcularLitros(distancia));

    }

    static float calcularDistancia (float tempo, float velocidade){
            float distancia;
            return distancia = tempo * velocidade;

    }

    static float calcularLitros (float distancia){
            float litros;
            return litros = distancia/RENDIMENTO;
        }


}
