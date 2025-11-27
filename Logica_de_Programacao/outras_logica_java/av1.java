import java.util.*;
public class av1 {
  public static void main(String[] args) {
    Scanner var = new Scanner(System.in);
    int numero =0;
    int a[] = {0, 1, 2};
    int rep[] = {0, 1, 2};
    int numeroanterior[] = {0,1,2 };
  
    for (int j = 0; j < 3; j++) {
      System.out.print("Informe um número: ");
      numero = var.nextInt();
      if (numeroanterior[j] == numero) {
        a[j] = numero;
        rep[j]++;
      }
      else{

      }
      numeroanterior[-j] = numero;
    }
    System.out.println("O número " + a[0] + " foi repetido " + rep[0] + " vezes");
  
  }
  
}
