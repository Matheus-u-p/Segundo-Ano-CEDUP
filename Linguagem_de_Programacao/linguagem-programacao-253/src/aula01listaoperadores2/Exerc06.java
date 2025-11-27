package aula01listaoperadores2;
import java.util.Scanner;

//Desenvolva um programa que declare variáveis para armazenar dois caracteres.
// Peça ao usuário que insira os dois caracteres e, em seguida, compare-os.
// O programa deve exibir uma mensagem indicando se os caracteres são iguais ou diferentes.

public class Exerc06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //Declaração de variaveis
        char caracter1;
        char caracter2;
        boolean resultado;

        //Entrada
        System.out.print("Informe o primeiro caracter: ");
        caracter1 = ler.next().charAt(0);

        System.out.print("Informe o segundo caracter: ");
        caracter2 = ler.next().charAt(0);

        //Processamento
        resultado = (caracter1 == caracter2);

        //Saída
        System.out.println("O primeiro caracter é igual ao segundo? "+resultado);

    }
}
