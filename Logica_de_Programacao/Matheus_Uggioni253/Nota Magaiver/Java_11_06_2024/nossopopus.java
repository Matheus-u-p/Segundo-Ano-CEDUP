//Camilli Vitória Salvaro Honorato
//Matheus Uggioni Possamai
//2-53
//Matheus: https://drive.google.com/drive/folders/1zgywiI6SWrg60CdZLMNMSJLOWxGBm6sJ?usp=sharing
//Camilli: https://drive.google.com/drive/folders/1FBs-dmqw8QHQlaW0SSlkvnMDDwvHI6Ho?usp=drive_link

import javax.swing.*;
import java.time.Period;//Importação da data do pc
import java.time.LocalDate; //Importação da data do pc

public class nossopopus {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Olá! Seja Bem-Vindo!", 
        "Tyte", JOptionPane.INFORMATION_MESSAGE); //Mostra uma mensagem na tela em formato popup

        JOptionPane.showMessageDialog(null, "Eu sou a Tyte sua nova amiga ;D", 
        "Tyte", JOptionPane.INFORMATION_MESSAGE);

        int resposta = JOptionPane.showConfirmDialog(null, 
        "Posso coletar algumas informações suas?","Pergunta Tyte", JOptionPane.YES_NO_OPTION); //Pergunta 1| Caixa de pergunta de sim ou não

        //Caso a resposta seje não da variavel resposta
        if (resposta == JOptionPane.NO_OPTION){
            int resposta2 = JOptionPane.showConfirmDialog(null, 
            "Você deseja continuar sem suas informações? ","Pergunta Tyte", JOptionPane.YES_NO_OPTION); //Pergunta 2
            
            if (resposta2 == JOptionPane.NO_OPTION){
                int pergunt = JOptionPane.showConfirmDialog(null, 
                "Você tem algum problema em compartilhar informações? ","Pergunta Tyte", JOptionPane.YES_NO_OPTION); //Pergunta 3
            if (pergunt == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null, "Então nos vemos em uma proxima! Adeus", 
                "Tyte", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
            else{    
            }
            }
            if(resposta2 == JOptionPane.YES_NO_OPTION){ //Caso a resposta seje sim
                //Programa que continua caso não queira ser identificado
                JOptionPane.showMessageDialog(null, "Entao vamos conversar! ", 
                "Tyte", JOptionPane.INFORMATION_MESSAGE);
                int resposta0 = JOptionPane.showConfirmDialog(null, 
                "Você joga algum jogo?","Pergunta Tyte", JOptionPane.YES_NO_OPTION); //Pergunta 4
                
                if(resposta0 == JOptionPane.YES_NO_OPTION){
                    //Programa que continua caso nao queira ser identificado
                    String jogo = JOptionPane.showInputDialog(null,
                    "Qual você mais joga? ", "Tyte", JOptionPane.QUESTION_MESSAGE); //Pergunta 5 | É respondido com um campo para escrever
                            
                    JOptionPane.showMessageDialog(null, "Sério!? que legal! Eu também jogo "+jogo+"!", 
                    "Tyte", JOptionPane.INFORMATION_MESSAGE);          
                }
                            
                if (resposta == JOptionPane.NO_OPTION){//Caso a resposta seja não
                }

                int livro = JOptionPane.showConfirmDialog(null, 
                "Você gosta de livros?","Pergunta Tyte", JOptionPane.YES_NO_OPTION); //Pergunta 6
                if(livro == JOptionPane.YES_NO_OPTION){
                    String livro1 = JOptionPane.showInputDialog(null,
                    "Qual livro você está lendo ultimamente? ", "Tyte", JOptionPane.QUESTION_MESSAGE); //Pergunta 7
                    
                    JOptionPane.showMessageDialog(null, "Bacana!!!", 
                    "Tyte", JOptionPane.INFORMATION_MESSAGE);
                }
                        
                if (livro == JOptionPane.NO_OPTION){
                }
                    
                int resposta02 = JOptionPane.showConfirmDialog(null, 
                "Você faz exercicios fisicos? ","Pergunta Tyte", JOptionPane.YES_NO_OPTION); //Pergunta 8
                
                if(resposta02 == JOptionPane.YES_NO_OPTION){
                    JOptionPane.showMessageDialog(null, "Você deve ser bem forte então!!!", 
                    "Tyte", JOptionPane.INFORMATION_MESSAGE);
                }
                
                if (resposta02 == JOptionPane.NO_OPTION){
                    JOptionPane.showMessageDialog(null, "É melhor você começar o quanto antes!!!", 
                    "Tyte", JOptionPane.INFORMATION_MESSAGE);
                }
                String nome = JOptionPane.showInputDialog(null,
                "Qual aplicativo você não viveria sem? ", "Tyte informações",
                JOptionPane.QUESTION_MESSAGE); //Pergunta 9 

                int conversa = JOptionPane.showConfirmDialog(null, 
                "Ainda deseja conversar?","Pergunta Tyte", JOptionPane.YES_NO_OPTION); //Pergunta 10
                if(conversa == JOptionPane.YES_NO_OPTION){
                    JOptionPane.showMessageDialog(null, "Hmm..pensando em assuntos", 
                    "Tyte", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, "Tyte está sem assunto!Então nos despedimos aqui, Adeus!", 
                    "Tyte", JOptionPane.INFORMATION_MESSAGE);
                }
                if (conversa == JOptionPane.NO_OPTION){
                    JOptionPane.showMessageDialog(null, "Adeus! Prazer em te conhecer", 
                    "Tyte", JOptionPane.INFORMATION_MESSAGE);
                }
      
            }
        }

        //Caso a resposta seje sim da variavel resposta(Aceitou falar das informações)
        if(resposta == JOptionPane.YES_NO_OPTION){
            String nome = JOptionPane.showInputDialog(null,
            "Digite seu nome: ", "Tyte informações",
             JOptionPane.QUESTION_MESSAGE); //Pergunta 11
        
             if (nome == null || nome.trim().isEmpty()){ //Mensagem caso a resposta esteja em branco
                JOptionPane.showMessageDialog(null,
                "Tyte ficou triste com você! Adeus",
                "Tyte", JOptionPane.ERROR_MESSAGE); 
                System.exit(0); //Para a execução do programa
            }
        
             JOptionPane.showMessageDialog(null, "Olá "+nome+"!", 
            "Tyte", JOptionPane.INFORMATION_MESSAGE);

            String anonasc = JOptionPane.showInputDialog(null,
            "Informe sua data de nascimento no formato AAAA-MM-DD: ", "Tyte inforamações",
             JOptionPane.PLAIN_MESSAGE); //Pergunta 12
             if (anonasc == null || nome.trim().isEmpty()){
                JOptionPane.showMessageDialog(null,
                "Tyte ficou triste com você! Adeus",
                "Tyte", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
            //Pega a data/hora do computador para saber a idade da pessoa
            LocalDate DataNascimento = LocalDate.parse(anonasc);
            LocalDate dataAtual = LocalDate.now();
            Period periodo = Period.between(DataNascimento, dataAtual);
            int idade = periodo.getYears();
             
            JOptionPane.showMessageDialog(null, "Hmm..deixe me pensar... ", 
            "Tyte", JOptionPane.INFORMATION_MESSAGE);

            int resposta3 = JOptionPane.showConfirmDialog(null, 
            "Sua idade é: "+idade+"?","Pergunta Tyte", JOptionPane.YES_NO_OPTION); //Pergunta 13

            if (resposta3 == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null, "Você mentiu para Tyte, Adeus!", 
                "Tyte", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }

            String comida = JOptionPane.showInputDialog(null,
            "Quais comidas você gosta? ", "Tyte informações",
            JOptionPane.QUESTION_MESSAGE); //Pergunta 14

            JOptionPane.showMessageDialog(null, "Nunca senti o sabor de nenhuma dessas comidas", 
            "Tyte", JOptionPane.INFORMATION_MESSAGE);

            int resposta02 = JOptionPane.showConfirmDialog(null, 
            "Você tem alguma alergia? ","Pergunta Tyte", JOptionPane.YES_NO_OPTION); //Pergunta 15

            if(resposta02 == JOptionPane.YES_NO_OPTION){
                JOptionPane.showMessageDialog(null, "Sinto pena de você", 
                "Tyte", JOptionPane.INFORMATION_MESSAGE);
            }
            if (resposta02 == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null, "Você tem sorte!", 
                "Tyte", JOptionPane.INFORMATION_MESSAGE);
            }

            String bolacha = JOptionPane.showInputDialog(null,
            "Você fala biscoito ou bolacha ? ", "Tyte informações",
            JOptionPane.QUESTION_MESSAGE); //Pergunta 16

            int redes = JOptionPane.showConfirmDialog(null, 
            "Você é viciado em alguma rede social? ","Pergunta Tyte", JOptionPane.YES_NO_OPTION); //Pergunta 17

            if(redes == JOptionPane.YES_NO_OPTION){
                JOptionPane.showMessageDialog(null, "Isto é preocupante, tente fazer coisas diferentes!", 
                "Tyte", JOptionPane.INFORMATION_MESSAGE);
            }
            if (redes == JOptionPane.NO_OPTION){
            }
            String livre = JOptionPane.showInputDialog(null,
            "O que você faz no tempo livre? ", "Tyte informações",
            JOptionPane.QUESTION_MESSAGE); //Pergunta 18
            
            int gosto = JOptionPane.showConfirmDialog(null, 
                "Você gostou de conversar comigo?","Pergunta Tyte", JOptionPane.YES_NO_OPTION); //Pergunta  19
                if(gosto == JOptionPane.YES_NO_OPTION){
                    JOptionPane.showMessageDialog(null, "Isto me deixa feliz, eu também gostei de falar com você!", 
                    "Tyte", JOptionPane.INFORMATION_MESSAGE);
                    }
                if (gosto == JOptionPane.NO_OPTION){
                    JOptionPane.showMessageDialog(null, "Então é isto, adeus! Prazer em te conhecer", 
                    "Tyte", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }

            int conversa = JOptionPane.showConfirmDialog(null, 
                "Ainda deseja conversar?","Pergunta Tyte", JOptionPane.YES_NO_OPTION); //Pergunta  20
                if(conversa == JOptionPane.YES_NO_OPTION){
                    JOptionPane.showMessageDialog(null, "Hmm..pensando em assuntos", 
                    "Tyte", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, "Tyte está sem assunto!Então nos despedimos aqui, Adeus!", 
            "Tyte", JOptionPane.INFORMATION_MESSAGE);
                    }
                if (conversa == JOptionPane.NO_OPTION){
                    JOptionPane.showMessageDialog(null, "Adeus! Prazer em te conhecer", 
                    "Tyte", JOptionPane.INFORMATION_MESSAGE);
                }



            }
    
        }
    }





