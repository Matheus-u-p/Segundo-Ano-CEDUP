//Camilli Vitória Salvaro Honorato
//Matheus Uggioni Possamai
//2-53
//Matheus: https://drive.google.com/drive/folders/1zgywiI6SWrg60CdZLMNMSJLOWxGBm6sJ?usp=sharing
//Camilli: https://drive.google.com/drive/folders/1FBs-dmqw8QHQlaW0SSlkvnMDDwvHI6Ho?usp=drive_link

import java.time.Period;//Importação da data do pc
import java.time.LocalDate; //Importação da data do pc
import java.util.*; //Importação do Java para rodar o Scanner
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class cadastro_5_21_05_2024{
public static void main(String[] args) {
      Scanner var = new Scanner(System.in);
      //Declaração das variaveis
      String nome, sobrenome, sexo, rg, endereco,anonasc, cpf; //Variaveis que armazenam palavras
      float salario; //Variavel que armazena numeros reais
      char genero; //Variavel que armazena uma letra

      //Parte que o usuario interage com o sistema
      System.out.print("Informe seu nome: "); //Mostra o que está escrito entre as aspas na tela para o usuario
      nome = var.nextLine(); //Campo onde o usuario escreve, e armazena o que foi escrito na variavel

      System.out.print("Digite seu sobrenome: "); 
      sobrenome = var.nextLine(); 

      System.out.print("Digite seu gênero: (F) ou (M) "); 
      genero = var.next().charAt(0);//Esse é diferente porque o Scanner não suporta o Char

      if(genero == 'F' || genero == 'f'){ //Condição de SE
        sexo = "Feminino" ; //Se condição for verdadeira ele armazena a palavra feminino na variavel sexo.
      }else if(genero == 'M' || genero == 'm'){ //Condição de SE SENÃO
        sexo = "Masculino"; //Se condição for verdadeira ele armazena a palavra masculino na variavel sexo.
      }else{//Condição de SENÃO
      sexo = "Indefinido"; //Se condição for falsa ele armazena a palavra indefinido na variavel sexo.
      }

      System.out.print("Digite seu CPF: ");
      cpf = var.next();

      System.out.print("Digite seu endereço: ");
      endereco = var.next();

      System.out.print("Digite seu salario: ");
      salario = var.nextFloat();

      System.out.print("Digite seu RG: ");
      rg = var.next();

      System.out.print("Informe sua data de nascimento no formato AAAA-MM-DD: ");
      anonasc = var.next();
      
      //Local para transformar a data na idade no dia atual, com extensões que le a data do pc
      LocalDate DataNascimento = LocalDate.parse(anonasc);
      LocalDate dataAtual = LocalDate.now();
      Period periodo = Period.between(DataNascimento, dataAtual);
      int idade = periodo.getYears();
      
      //Mostra as informações que foram preenchidas no decorrer do programa
      System.out.println("Nome: "+nome); //Mostra o que está escrito entre as aspas na tela para o usuario/ O que está escrito fora das aspas no +, é a uma variavel, e mostra na tela o que tem armazenada nela
      System.out.println("Sobrenome: "+sobrenome);
      System.out.println("Gênero: "+sexo); 
      System.out.println("CPF: "+cpf);
      System.out.println("Endereço: "+endereco);
      System.out.println("Salário: "+salario);
      System.out.println("RG: "+rg);
      System.out.println("Ano de nascimento: "+anonasc);
      System.out.println("Idade: "+idade);

      salvarCadastro(nome, sobrenome, sexo);

      System.out.println("Cadastro salvo com sucesso!");

}
public static void salvarCadastro(String nome, String sobrenome, String sexo){
  try{
    FileWriter FileWriter = new FileWriter("cadastroDEcliente.txt", true);
    PrintWriter printWriter = new PrintWriter(FileWriter);

    printWriter.println("Nome: " +nome);
    printWriter.println("Sobrenome: "+sobrenome);
    printWriter.println("Sexo: "+sexo);
    printWriter.println();

    printWriter.close();
  }

  catch (IOException e){
    System.out.println("Erro ao salvar o cadastro: " +e.getMessage());
  }
}
} 
