import java.util.*;
//Matheus Uggioni Possamai
//Camilli Vitória Salvaro Honorato
//253
public class atv6 {
    
public static void main(String[] args) {
    
    Scanner var = new Scanner(System.in);

    float a, b, c;

    System.out.print("Digite o primeiro valor: ");
    a= var.nextFloat();
    c =a;

    System.out.print("Digite o segundo valor: ");
    b= var.nextFloat();
    a=b;
    b=c;

    System.out.print("O valor de A é " +a+  "e o valor de B é " +b);

}

}
