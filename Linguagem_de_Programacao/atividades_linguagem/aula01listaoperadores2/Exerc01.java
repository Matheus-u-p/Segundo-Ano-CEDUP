package aula01listaoperadores2;
//Escreva um programa em Java que declare duas variáveis inteiras. Solicite ao usuário que
// insira dois valores, armazene-os nas variáveis e, em seguida, verifique se são iguais.
// Exiba “Os números são iguais” ou “Os números são diferentes”, conforme o caso.
import util.Util;

import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {
        // Entrada
        int valor1 = Util.solicitaInt("Informe o primeiro valor: ");
        int valor2 = Util.solicitaInt("Informe o segundo valor: ");
        //Processamento
        boolean resultado = (valor1 == valor2);
        //Saída
        Util.imprimeResultado("Os números são iguais?"+ resultado);
    }
}
