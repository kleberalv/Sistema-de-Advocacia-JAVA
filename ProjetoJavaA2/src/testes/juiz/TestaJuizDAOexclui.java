package testes.juiz;

import javax.swing.JOptionPane;
import persistencia.JuizDAO;

public class TestaJuizDAOexclui {

    public static void main(String[] args) throws Exception {
        
        //Inserir o ID para apagar o juiz.
        JOptionPane.showMessageDialog(null, JuizDAO.exclui1(10)); 
        
        //Inserir o nome para apagar o juiz.
//        JOptionPane.showMessageDialog(null, JuizDAO.exclui2("Fulano"));
        
        //Inserir o ID e o nome para apagar o juiz.
//        JOptionPane.showMessageDialog(null, JuizDAO.exclui3(10, "Fulano"));
      
        //Inserir o ID ou o nome para apagar o juiz.
//        JOptionPane.showMessageDialog(null, JuizDAO.exclui4(10, ""));
    }
    
}
    