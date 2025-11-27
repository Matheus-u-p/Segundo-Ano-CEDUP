package aula01listaoperadores2;
//Crie um programa que declare duas variáveis para armazenar números reais,
// solicite que o usuário insira os valores e, por fim, verifique e exiba se o
// primeiro número é maior que o segundo.

import util.Util;

import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        //Entrada
        //Declaração de variaveis
        double valor1;
        double valor2;
        boolean resultado;

        //Entrada de dados
        System.out.print("Informe o primeiro valor: ");
        valor1 = ler.nextDouble();

        System.out.print("Informe o segundo valor: ");
        valor2 = ler.nextDouble();
        //Processamento
        resultado = (valor1 > valor2);
        //Saída
        Util.imprimeResultado("O primeiro valor é maior que o segundo? " + resultado);

    }
}
