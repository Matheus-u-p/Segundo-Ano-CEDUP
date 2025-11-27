package aula01listaoperadores2;
import java.util.Scanner;

//Desenvolva um programa que declare variáveis para armazenar duas strings.
// Solicite ao usuário que insira as duas strings e, em seguida, compare os seus tamanhos.
// O programa deve exibir uma mensagem indicando se o tamanho da primeira string é menor
// que o tamanho da segunda.

public class Exerc08 {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    //Declaração de variaveis
        String tamanho1;
        String tamanho2;
        boolean resultado;

        //Entrada
        System.out.print("Informe o primeiro valor: ");
        tamanho1 = ler.next();

        System.out.print("Informe o segundo valor:");
        tamanho2 = ler.next();

        //Processamento
        resultado = (tamanho1.length() < tamanho2.length());

        //Saída
        System.out.println("O primeiro valor tem o tamanho menor do que o segundo? "+resultado);

    }
}
