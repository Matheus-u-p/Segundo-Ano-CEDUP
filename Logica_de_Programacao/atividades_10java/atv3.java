import java.util.*;
public class atv3 {
    
//Matheus Uggioni Possamai
//Camilli Votória Salvaro Honorato
//253
    public static void main(String[] args) {
        
        Scanner var = new Scanner(System.in);

        float media, distancia, combustivel;
        
        System.out.print("Quanto de combustível foi gasto? ");
        combustivel= var.nextFloat();

        System.out.print("Qual foi a distância percorrida? ");
        distancia= var.nextFloat();

        media= distancia/combustivel;

        System.out.print("A média de comsumo é: " +media+ " Km/l");

    }
}
