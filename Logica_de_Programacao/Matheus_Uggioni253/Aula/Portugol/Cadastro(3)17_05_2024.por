programa {
  funcao inicio() {
//Camilli Vitoria Salvaro Honorato
//Matheus Uggioni Possamai
//2-53
//Matheus: https://drive.google.com/drive/folders/1zgywiI6SWrg60CdZLMNMSJLOWxGBm6sJ?usp=sharing
//Camilli: https://drive.google.com/drive/folders/1FBs-dmqw8QHQlaW0SSlkvnMDDwvHI6Ho?usp=drive_link
	//declaração das variaveis
    cadeia nome, sobrenome, endereco, rg, genero //Variavel que armazena palavras
    caracter sexo //Variavel que armazena um caracter
    real cpf, salario //Variavel que armazena os numeros reais
    inteiro anonasc,idade //Variavel que armazena numeros inteiros
    
    //Parte que o usuario tem contato com o sistema, preenchendo as informações necessarias
    escreva("Informe seu primeiro nome: ") //Mostra para o usuario na tela
    leia(nome) //Armazena o que o usuario escreve / Campo onde o usuario escreve
    escreva("Informe seu sobrenome: ") //Mostra para o usuario na tela
    leia(sobrenome)  //Armazena o que o usuario escreve / Campo onde o usuario escreve
    escreva("Digite seu sexo 'M' ou 'F' ") 
    leia(sexo)  
    escreva("Digite seu CPF: ") 
    leia(cpf) 
    escreva("Digite seu endereço: ")
    leia(endereco) 
    escreva("Digite seu salario: ")
    leia(salario)
    escreva("Digite seu RG: ") 
    leia(rg)
    escreva("Digite seu ano de nascimento: ")
    leia(anonasc)
    limpa() //Apaga da tela o que já foi rodado
    se (sexo == 'M' ou sexo == 'm'){
    	genero = "Masculino"
    }se( sexo =='F' ou sexo == 'f'){
    	genero = "Feminino"
    }senao{
    	genero = "Indefinido"
    }
    idade = 2024 - anonasc //Conta para saber a idade da pessoa

    //Parte que mostra o resultado das informações preenchida
    escreva("\n O nome informado: "+nome) //Mostra o que esta escrito entre as aspas na tela para o usuario/ O que está escrito fora das aspas no +,é a uma variavel, e mostra na tela o que tem armazenada nela
    escreva("\n O sobrenome informado: "+sobrenome) 
    escreva("\n A idade informado: "+genero)  
    escreva("\n O CPF informado : "+cpf)
    escreva("\n O endereço informado : "+endereco)
    escreva("\n O salario informado : "+salario)
    escreva("\n O RG informado : "+rg)
    escreva("\n Sua idade é de : "+idade)
    escreva("\n Data: 17/05/2024")

  }
}
