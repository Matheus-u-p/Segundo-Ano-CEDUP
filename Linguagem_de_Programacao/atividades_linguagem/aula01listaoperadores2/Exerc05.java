package aula01listaoperadores2;
import java.util.Scanner;
//Escreva um programa que declare variáveis para armazenar os preços de dois produtos.
// Solicite ao usuário que informe o preço do primeiro e do segundo produto. Em seguida,
// compare os preços e exiba uma mensagem indicando se o preço do primeiro produto é menor
// ou igual ao do segundo.

public class Exerc05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //Declaração de variaveis
        float preco1;
        float preco2;
        boolean resultado_igual;
        boolean resultado_menor;

        //Entrada
        System.out.print("Informe o primeiro preco do produto: ");
        preco1 = ler.nextFloat();

        System.out.print("Informe o segundo preco do produto: ");
        preco2 = ler.nextFloat();

        //Processamento
        resultado_igual = (preco1 == preco2);
        resultado_menor = (preco1 < preco2);

        //Saída
        System.out.print("O primeiro produto tem o preço menor do que o primeiro? "+resultado_menor);
        System.out.print("O primeiro produto e o segunnda, tem o mesmo valor? "+ resultado_igual);
    }
}
