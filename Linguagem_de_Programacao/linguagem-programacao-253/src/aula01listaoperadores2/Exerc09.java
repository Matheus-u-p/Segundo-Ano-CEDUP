package aula01listaoperadores2;
import java.util.Scanner;

//Desenvolva um programa que declare variáveis para armazenar os anos de nascimento
// de duas pessoas. Solicite ao usuário que insira os anos de nascimento e, em seguida,
// compare os valores. O programa deve exibir uma mensagem indicando se a primeira pessoa
// é mais nova do que a segunda.

public class Exerc09 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int ano1;
        int ano2;
        boolean resultado;

        //Entrada
        System.out.print("Informe o primeiro ano de nascimento: ");
        ano1 = ler.nextInt();

        System.out.print("Informe o segundo ano de nascimento: ");
        ano2 = ler.nextInt();

        //Processamento
        resultado = (ano1 > ano2);

        //Saída
        System.out.print("A primeira pessoa é mais nova do que a segunda? "+resultado);
    }
}
