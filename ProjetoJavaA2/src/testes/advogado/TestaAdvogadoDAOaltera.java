package testes.advogado;

import javax.swing.JOptionPane;
import persistencia.AdvogadoDAO;

public class TestaAdvogadoDAOaltera {

    public static void main(String[] args) throws Exception {
        
        //Nome, sexo, OAB, E-mail | ID
        JOptionPane.showMessageDialog(null,AdvogadoDAO.altera1("Kleber", "m", 101010, "kleber@@", 10, 10));
        
        //Nome, sexo, ID, E-mail | OAB
//        JOptionPane.showMessageDialog(null,AdvogadoDAO.altera2("", "", 0, "", 0, 0));
        
        //Nome, sexo, OAB, E-mail | ID e OAB
//        JOptionPane.showMessageDialog(null,AdvogadoDAO.altera3("", "", 0, "", 0, 0, 0));
        
        //Nome, sexo, OAB, E-mail | ID ou OAB
//        JOptionPane.showMessageDialog(null,AdvogadoDAO.altera4("", "", 0, "", 0, 0, 0));
        
        
    }
    
}
