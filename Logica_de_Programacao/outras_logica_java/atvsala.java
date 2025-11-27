import java.util.*;

public class atvsala {

    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);

        float notas, media= 0, soma = 0;

        for (int i = 0; i > 10; i++) {
            System.out.print("Diga a nota " + i + ": ");
            notas = var.nextFloat();

            soma = soma + notas;
            media = soma / 10;
        }

        System.out.print("A média das notas é: " + media);

    }

}
