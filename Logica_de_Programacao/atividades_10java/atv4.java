import java. util.*;
//Matheus Uggioni Possamai
//Camilli Votória Salvaro Honorato
//253

public class atv4 {
    public static void main(String[] args){
        Scanner var =  new Scanner(System.in);

        String nome, mes;
        float salario, vendas, salario1, totalsalario;

        System.out.print("Qual o seu nome? ");
        nome = var.nextLine();

        System.out.print("Em qual mês? ");
        mes = var.nextLine();

        System.out.print("Qual é o seu salario fixo?");
        salario = var.nextFloat();

        System.out.print("Qual o valor das vendas você efetuou este mês? ");
        vendas = var.nextFloat();

        salario1 = (vendas * 25) /100;
        totalsalario = salario1 +salario;
        System.out.print("O nome do funcionario é: "+ nome + ". O salario fixo é de: "+ salario+". Foi efetuada: " +vendas+" reais em vendas pelo mesmo no mês de "+ mes+" e seu salario final é: "+totalsalario);

    }
}
