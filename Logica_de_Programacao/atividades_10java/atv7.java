import java.util.*;
//Matheus Uggioni Possamai
//Camilli Votória Salvaro Honorato
//253

public class atv7 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);

        float temperaturaC, temperaturaF;

        System.out.print("Digite a temperatura em Cº: ");
        temperaturaC = var.nextFloat();

        temperaturaF = (9* temperaturaC + 160)/ 5;

        System.out.print("A temperatura em Fahrenheit é:"+temperaturaF);
    }
    
}
