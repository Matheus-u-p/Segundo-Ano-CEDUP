import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//Camilli Vitória Salvaro Honorato
//Matheus Uggioni Possamai
//2-53
//Matheus: https://drive.google.com/drive/folders/1zgywiI6SWrg60CdZLMNMSJLOWxGBm6sJ?usp=sharing
//Camilli: https://drive.google.com/drive/folders/1FBs-dmqw8QHQlaW0SSlkvnMDDwvHI6Ho?usp=drive_link

public class mainmenu {
    public static void main(String[] args) {
        //Criação do frame principal
        JFrame frame = new JFrame("Menu Principal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(470, 370);
        frame.setLayout(new BorderLayout());

        //Criação da barra de menu
        JMenuBar menuBar =  new JMenuBar();
        
        //Criação do menu
        JMenu menu = new JMenu("Opções");
        menuBar.add(menu);

        //Criação dos itens do menu
        JMenuItem cadastro5 = new JMenuItem("Cadastro LACO de REP");
        JMenuItem OlaMundoPopus = new JMenuItem("Olá Mundo Popup");

        //Adicionando itens ao menu
        menu.add(cadastro5);
        menu.add(OlaMundoPopus);

        //Adicionando ActionListener para cada item de menu
        cadastro5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastro5.main(null); //Chama o arquivo cadastroLacodeREP.java
            }
        });

        OlaMundoPopus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OlaMundoPopus.main(null); //Chama o arquivo cadastroLacodeREP.java
            }
        });

        //Adicionando a barra de menu ao frame
        frame.setJMenuBar(menuBar);

        //Criação do painel para o botão de sair
        JPanel panel = new JPanel();
        JButton sairButton = new JButton("Sair");

        //Adicionando ActionListener para o botão de sair
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0); //Sai do programa
            }
        });

        //Adicionando o botão ao painel
        panel.add(sairButton);

        //Adicionando o painel ao frame
        frame.add(panel, BorderLayout.SOUTH);

        //Confirgurando o frame para ser visível
        frame.setVisible(true);
    }
}