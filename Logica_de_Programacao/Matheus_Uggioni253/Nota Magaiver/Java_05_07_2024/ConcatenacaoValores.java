//Camilli Vitória Salvaro Honorato
//Matheus Uggioni Possamai
//2-53
//Matheus: https://drive.google.com/drive/folders/1zgywiI6SWrg60CdZLMNMSJLOWxGBm6sJ?usp=sharing
//Camilli: https://drive.google.com/drive/folders/1FBs-dmqw8QHQlaW0SSlkvnMDDwvHI6Ho?usp=drive_link

import javax.swing.JOptionPane; //Importação do Pop Up

public class ConcatenacaoValores {
  
  public static void main(String[] args){

    String primeiroValor = JOptionPane.showInputDialog("Digite o primeiro valor: ");
    //Digitar o primeiro valor
    String segundoValor = JOptionPane.showInputDialog("Digite o segundo valor: ");
    //Digitar o segundo valor
    String resultado = primeiroValor + segundoValor;
    //Concatenação(junção dos dois valores)

    JOptionPane.showMessageDialog(null,
    "Resultado da concatenação: "+ resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    //Mostra o resultado da concatenação

  }

}
