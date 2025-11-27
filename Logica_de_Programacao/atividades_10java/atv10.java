import java.util.*;
//Matheus Uggioni Possamai
//Camilli Votória Salvaro Honorato
//253

public class atv10 {

    public static void main(String[] args) {
        
        Scanner var = new Scanner(System.in);

        float valor,qtndparcela;

        System.out.print("Qual o valor da compra realizada? ");
        valor= var.nextFloat();

        System.out.print("Quantas vezes desejar parcelar? ");
        qtndparcela= var.nextFloat();

        if(qtndparcela == 1){
            System.out.println("O valor das prestações em 1x é: "+valor);
        }
        else if(qtndparcela ==2){
            System.out.println("O valor das prestações em 2x é: "+valor / 2+ " por mês.");

        }
        else if(qtndparcela == 3){
            System.out.println("O valor das prestações em 3x é: "+valor / 3+ " por mês.");
        }
        else if(qtndparcela ==4){
            System.out.println("O valor das prestações em 4x é: "+valor / 4+ " por mês.");
        }
        else if(qtndparcela == 5){
            System.out.println("O valor das prestações em 3x é: "+valor / 5+ " por mês.");
        }
        else{
            System.out.print("Quantidade não parcelavel!");
        }

    }
}