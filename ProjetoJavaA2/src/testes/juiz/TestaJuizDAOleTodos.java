package testes.juiz;
import javax.swing.JOptionPane;
import persistencia.JuizDAO;

public class TestaJuizDAOleTodos {

    public static void main(String[] args) throws Exception {
       
        JOptionPane.showMessageDialog(null, JuizDAO.leTodos());   
        
    }
    
}
