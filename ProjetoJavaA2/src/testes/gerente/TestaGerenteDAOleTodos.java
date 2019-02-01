package testes.gerente;
import javax.swing.JOptionPane;
import persistencia.GerenteDAO;

public class TestaGerenteDAOleTodos {

    public static void main(String[] args) throws Exception {
        
        JOptionPane.showMessageDialog(null, GerenteDAO.leTodos());   
        
    }
    
}
