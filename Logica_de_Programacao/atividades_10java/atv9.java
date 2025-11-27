import java.util.*;
//Matheus Uggioni Possamai
//Camilli Votória Salvaro Honorato
//253

public class atv9 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);

        float deposito, totaljuros, total,mes,taxa;

        System.out.print("Informe o valor depositado: ");
        deposito = var.nextFloat();

        System.out.print("Quantos meses você deixo depositado? ");
        mes= var.nextFloat();

        
        totaljuros =  (mes* 70)/100;
        total = totaljuros * deposito;

        System.out.print("Após "+mes+" mês seu dinheiro rendeu: "+total);
    }
    
}