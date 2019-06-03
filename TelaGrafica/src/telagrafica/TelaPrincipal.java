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

        lblPrimeiraTela = new JLabel();
        btnUhul = new JButton();
        
        lblPrimeiraTela.setText("Primeira Tela!");
        btnUhul.setText("Uhul!");
        
        container.add(lblPrimeiraTela);
        container.add(btnUhul);
        
        setSize(360, 360);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
