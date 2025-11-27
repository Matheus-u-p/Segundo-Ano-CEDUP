import java.util.*;

public class av4 {
  public static void main(String[] args) {
    Scanner var= new Scanner(System.in);
        int numero;

        System.out.print("Escreva um número: ");
        numero = var.nextInt();
         
            if(numero%2==1 && numero >= 92 && numero <=1478) {
                 
                System.out.println("Numero é primo! ");
            }
            else if(numero >= 92 && numero <=1478) {              
                System.out.println("Numero não é primo! ");
                 
            }else{
                System.out.println("Numero não esta entre 92 e 1478! ");
            }
        
     
    }
 
}
