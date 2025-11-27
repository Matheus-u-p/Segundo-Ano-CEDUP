import java.util.*;
//Matheus Uggioni Possamai
//Camilli Votória Salvaro Honorato
//253

public class atv2 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        float n1, n2, soma, sub, div, mult;

        System.out.print("Digite um numero: ");
        n1 = var.nextFloat();

        System.out.print("Digite outro numero: ");
        n2 = var.nextFloat();

        soma = n1 + n2;
        sub = n1 -n2;
        div = n1/ n2;
        mult= n1* n2;

        System.out.println("A soma entre os numeros é: " +soma);
        System.out.println("A subtração entre os numeros é: " +sub);
        System.out.println("A divisão entre os numeros é: " +div);
        System.out.println("A multiplicação entre os numeros é: " +mult);

    }
    
}
