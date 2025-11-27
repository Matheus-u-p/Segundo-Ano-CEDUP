import java.util.*;
public class atv5 {
  public static void main(String[] args) {
    Scanner var = new Scanner(System.in);
    String sexo,corolhos, corcabelo;
    int idade;
    int sexF =0 , sexM =0 , corcP =0, corcL =0, corcC =0, coroA=0, coroV =0 , coroC =0, idade2 = 0, mediaidade;

    for (int i =0; i <50 ; i++){

    System.out.print("Qual seu genêro? [F] [M]");
    sexo = var.next();

    System.out.print("Informe a cor dos seus olhos: (azul, verde ou castanho): ");
    corolhos= var.next();

    System.out.print("Qual a cor do seu cabelo? (louro, castanho ou preto): ");
    corcabelo = var.next();

    System.out.print("Qual a sua idade: ");
    idade = var.nextInt();
    idade2 = idade +idade2;

    System.out.println("");

    if(sexo.equals("F")){
        sexF ++;
    }
    else if(sexo.equals("M")){
        sexM ++;
    }

    if(corolhos.equals("azul")){
        coroA ++;
    }
    else if(corolhos.equals("verde")){
        coroV ++;
    }
    else if(corolhos.equals("castanho")){
        coroC ++;
    }

    if(corcabelo.equals("louro")){
        corcL ++;
    }
    else if(corcabelo.equals("castanho")){
        corcC ++;
    }
    else if(corcabelo.equals("preto")){
        corcP ++;
    }

}   
    mediaidade = idade2 / 50;

    System.out.println("A quantidade de pessoas do gênero feminino é de: "+sexF+". E a quantidade de pessoas do gênero masculino é de: "+sexM);
    System.out.println("A quantidade de pessoas com olhos azuis é de: "+coroA+". E a quantidade de pessoas com o olhos verdes é de: "+coroV+". E a quantidade de pessoa com o olho castanho é de: "+coroC);
    System.out.println("A quantidade de pessoas com cabelo loiro é de: "+corcL+". E a quantidade de pessoas com cabelo preto é de: "+corcP+". E a quantidade de pessoa com o cabelo castanho é de: "+corcC);
    System.out.println("A média de idade é de: "+mediaidade);
}
}