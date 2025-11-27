package aula01listaoperadores2;
import java.util.Scanner;

//Desenvolva um programa que declare variáveis para armazenar duas palavras.
// Peça ao usuário que insira as palavras e, em seguida, compare a quantidade de
// letras de cada uma. O programa deve exibir uma mensagem indicando se a primeira
// palavra possui mais letras do que a segunda.

public class Exerc10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String palavra1;
        String palavra2;
        boolean resultado;

        //Entrada
        System.out.print("Escreva uma palavra: ");
        palavra1 = ler.next();

        System.out.print("Escreva outra palavra: ");
        palavra2 = ler.next();

        //Processamento
        resultado = (palavra1.length() > palavra2.length());

        //Saída
        System.out.println("A primeira palavra possui mais letras doque a segunda?"+ resultado);
    }
}
