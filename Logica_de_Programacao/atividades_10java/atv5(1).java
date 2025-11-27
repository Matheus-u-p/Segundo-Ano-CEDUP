import java.util.*;
//Matheus Uggioni Possamai
//Camilli Votória Salvaro Honorato
//253
public class atv5 {

    public static void main(String[] args) {

        Scanner var = new Scanner (System.in);
        String nome;
        Float n1, n2, n3, media;

        System.out.print("Qual o nome do aluno? ");
        nome = var.nextLine();

        System.out.print("Digite a primeira nota: ");
        n1 = var.nextFloat();

        System.out.print("Digite a segunda nota: ");
        n2 = var.nextFloat();
        
        System.out.print("Digite a terceira nota: ");
        n3 = var.nextFloat();

        media= (n1 + n2 + n3)/3;

        System.out.print("O aluno" +nome+ "possui a média das notas de: " +media);


    }
}
