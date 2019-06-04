/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telagrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author henrique
 */

class GerenciadorBotoes implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Botão Pressionado: " + e.getActionCommand(), "Uhul", 1);
        ControladorClientes.getInstancia().realizaAcao(e.getActionCommand());
    }
}
