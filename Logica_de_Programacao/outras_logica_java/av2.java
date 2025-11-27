import java.util.*;

public class av2 {
  public static void main(String[] args) {
    Scanner var = new Scanner(System.in);
    int idade, idadenv =0, idadevel=0, idadeant= 0;

    for(int i =0; i < 3; i++){
      System.out.print("Informe a idade do jogador: ");
      idade = var.nextInt();

      if ( idade > idadeant){
        idadevel = idade;
       }
       else if(idade < idadeant){
        idadenv = idade;
       }
       idadeant = idade;

    }
    System.out.print("A idade do jogador mais velho é : "+idadevel+ ". E a idade do mais novo é: "+idadenv);
    

  }
  
}
