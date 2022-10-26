package br.com.projetoIza.cotacoes;

import java.util.Scanner;

public class Conversao {

    static Scanner input = new Scanner(System.in);

    private void iniciaCotacao(){

        System.out.print("Entre com a cotação dólar/real:");
        float cotacao = input.nextFloat();
        System.out.print("Entre com a montante em dólares:");
        float montante = input.nextFloat();
        new Real().converteMoeda(cotacao,montante);
    }

    public static void main(String[] args) {

        /*float cotacao;
        float montante;
        Scanner input = new Scanner(System.in);
        */
        System.out.println("Programa de conversões de moeda!");
        new Conversao().iniciaCotacao();
        /*System.out.print("Entre com a cotação dólar/real:");
        cotacao = input.nextFloat();
        System.out.print("Entre com a montante em dólares:");
        montante = input.nextFloat();
        new Real().converteMoeda(cotacao,montante);
*/

        System.out.println("Quer realizao uma nova cotação? S/N");
        String opcao = input.next();
        switch (opcao){
            case "S":
            case "s":
                new Conversao().iniciaCotacao();
                break;
            default:
                System.out.println("Ok! Obrigado!");
        }



    }
}
