/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telagrafica;

/**
 *
 * @author henrique
 */
public class ControladorClientes {

    private static ControladorClientes instancia;

    private ControladorClientes(){
        
    }
    
    public static ControladorClientes getInstancia(){
        if(instancia == null){
            instancia = new ControladorClientes();
        }
        return instancia;
    }


    public void realizaAcao(String actionCommand) {
        System.out.println(actionCommand);
    }
}
