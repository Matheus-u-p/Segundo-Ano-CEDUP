import java.util.*;
//Matheus Uggioni Possamai
//Camilli Votória Salvaro Honorato
//253

public class atv8 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);

        float dolar, real,cotacao;

        System.out.print("Informe quantos dólars você tem: ");
        dolar = var.nextFloat();

        System.out.print("Informe a cotação do dólar: ");
        cotacao = var.nextFloat();

        real = dolar*cotacao;

        System.out.print("O valor de dólar em reais é: "+real+" R$");
    }
    
}