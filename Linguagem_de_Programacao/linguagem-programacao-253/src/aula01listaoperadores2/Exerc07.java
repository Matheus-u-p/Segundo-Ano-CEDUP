package aula01listaoperadores2;
import java.util.Scanner;
//Desenvolva um programa que declare variáveis para armazenar as alturas de duas pessoas.
// Solicite ao usuário que insira as alturas e, em seguida, compare-as.
// O programa deve exibir uma mensagem indicando se a altura da primeira pessoa é maior
// ou igual à altura da segunda.

public class Exerc07 {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    //Declaração de variaveis
        float altura1;
        float altura2;
        boolean resultado;

        //Entrada
        System.out.print("Informe a primeira altura:");
        altura1 = ler.nextFloat();

        System.out.print("Informe a segunda altura: ");
        altura2 = ler.nextFloat();

        //Processamento
        resultado = (altura2 <= altura1);

        //Saída
        System.out.println("A primeira pessoa é a maior ou do mesmo tamanho que a segunda? "+resultado);
    }
}
