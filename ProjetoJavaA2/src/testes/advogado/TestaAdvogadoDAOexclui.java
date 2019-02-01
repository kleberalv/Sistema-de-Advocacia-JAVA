package testes.advogado;

import javax.swing.JOptionPane;
import persistencia.AdvogadoDAO;

public class TestaAdvogadoDAOexclui {

    public static void main(String[] args) throws Exception {
        
        //Inserir o ID para apagar o advogado desejado.
        JOptionPane.showMessageDialog(null,AdvogadoDAO.exclui1(10));
        
        //Inserir a OAB para apagar o advogado desejado.
//        JOptionPane.showMessageDialog(null,AdvogadoDAO.exclui2(96325));  
        
        //Inserir o ID e a OAB para apagar o advogado desejado.
//        JOptionPane.showMessageDialog(null,AdvogadoDAO.exclui3(0,0));
        
        //Inserir o ID ou a OAB para apagar o advogado desejado.
//        JOptionPane.showMessageDialog(null,AdvogadoDAO.exclui4(0,0));    
      
    }
    
}
    