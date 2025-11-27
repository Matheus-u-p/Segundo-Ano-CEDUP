//Camilli Vitória Salvaro Honorato
//Matheus Uggioni Possamai
//2-53
//Matheus: https://drive.google.com/drive/folders/1zgywiI6SWrg60CdZLMNMSJLOWxGBm6sJ?usp=sharing
//Camilli: https://drive.google.com/drive/folders/1FBs-dmqw8QHQlaW0SSlkvnMDDwvHI6Ho?usp=drive_link

import javax.swing.JOptionPane; //Importação do Pop Up

public class ColetaDeDados{
  public static void main(String[]args){

    String texto = JOptionPane.showInputDialog("Digite um valor para \n uma variavel do tipo \n String'texto:'");
    //Digitar um texto (String)

    int inteiro = Integer.parseInt(JOptionPane.showInputDialog
    ("Digite um valor para \n uma variavel do tipo inteiro \n ex:'numero indivisivel/sem virgula'"));
    //Digitar um número inteiro(int) ex:4; 56; 99.

    double pontoFlutuante = Double.parseDouble(JOptionPane.showInputDialog
    ("Digite um valor para \n uma variavel do tipo float/real \n ex:'numero divisivel'"));
    //Digitar um número real(com ou sem vircula) ex:5; 89,3; 7,0;

    int respostaBoolean = JOptionPane.showConfirmDialog(null,
    "\"escolha uma opção para \n uma variavel do tipo boleano \n",
    "Escolha", JOptionPane.YES_NO_OPTION);
    boolean booleano = (respostaBoolean == JOptionPane.YES_OPTION);
    //Escolher uma opção entre sim e não(boolean)

    String mensagem = String.format
    ("var. String: %s\nvar. inteiro: %d\nvar. Float/real: %.2f\nvar. boleana: %b",
    texto, inteiro, pontoFlutuante, booleano);
    JOptionPane.showMessageDialog(null, mensagem, "Dados Inseridos",
    JOptionPane.INFORMATION_MESSAGE);
    //Mostra todos os dados digitados
  }
}