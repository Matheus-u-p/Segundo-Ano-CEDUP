import java.util.*;
public class av3 {
  public static void main(String[] args) {
    Scanner var = new Scanner(System.in);
    int matricula;
    float nota;

    for( int i =0; i<75; i++){
    System.out.print("Informe sua matricula:");
    matricula = var.nextInt();

    System.out.print("Informe sua nota final: ");
    nota = var.nextFloat();

    if( nota >= 0 && nota <=4.9){
      System.out.print("A conceito do aluno é: D ");
    }
    else if( nota >= 5 && nota <=6.9){
      System.out.print("A conceito do aluno é: C ");
    }
    else if( nota >= 7 && nota <=8.9){
      System.out.print("A conceito do aluno é: B ");
    }
    else if( nota >= 9 && nota <= 10){
      System.out.print("A conceito do aluno é: A ");
    }
    else{
      System.out.print("Erro! ");
    }
    System.out.println("");
  }
  }
}


