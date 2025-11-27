import java.util.*;

public class atvsala2 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);

        float media = 0, nota, notaacul = 0;

        for(int i = 0; i <10; i++){
            System.out.print("Digite a nota: ");
            nota = var.nextFloat();

            notaacul = nota + notaacul;
            media = notaacul / 10;

        }
        System.out.print("A média das notas é: " +media);
    }    
}
