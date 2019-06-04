/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telagrafica;

import java.lang.Object;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author henrique
 */
public class TelaPrincipal extends JFrame {

    private JLabel lblPrimeiraTela;
    private JButton btnUhul;
   
    
    public TelaPrincipal() {
        super("Primeira Tela com JFrame");

        
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        //LABEL PRIMEIRA TELA
        lblPrimeiraTela = new JLabel();
        lblPrimeiraTela.setText("Primeira Tela!");
        
        //BOTAO UHUL
        btnUhul = new JButton();        
        btnUhul.setText("Uhul!");
        btnUhul.setActionCommand("1");
        
        GerenciadorBotoes btnManager = new GerenciadorBotoes();
        btnUhul.addActionListener(btnManager);
        
        container.add(lblPrimeiraTela);
        container.add(btnUhul);
        
        setSize(360, 360);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
