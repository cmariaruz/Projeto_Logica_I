package br.com.projetoIza;


import br.com.projetoIza.tarefa_operacoes.*;

import java.util.Scanner;

public class OperadorCalculadora {

    public static void main(String[] args) {
        int opcao;
        Scanner input = new Scanner(System.in);
        float var1;
        float var2;


            System.out.println("Bem vindo a calculadora!!");
        while (1==1) {
            System.out.println("Qual operação deseja realizar? 1 = Somar; 2 = Subtrair; 3 = Multiplicar; 4 = Dividir; 5 = Tabuada;");
            opcao = input.nextInt();
            System.out.println("Entre com a primeira variável da operacao:");
            var1 = input.nextFloat();
            System.out.println("Entre com a segunda variável da operacao:");
            var2 = input.nextFloat();

            switch (opcao) {
                case 1:
                    new Somar().realizarOperacao(var1, var2);
                    break;
                case 2:
                    new Subtrair().realizarOperacao(var1, var2);
                    break;
                case 3:
                    new Multiplicar().realizarOperacao(var1, var2);
                    break;
                case 4:
                    new Dividir().realizarOperacao(var1, var2);
                    break;
                case 5:
                    new Tabuada().calcularTabuada(var1, var2);
                default:
                    System.out.println("Voce nao escolheu uma operacao valida! Adeus!");
            }
        }
    }
}
