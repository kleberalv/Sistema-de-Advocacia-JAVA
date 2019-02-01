package testes.advogado;
import javax.swing.JOptionPane;
import persistencia.AdvogadoDAO;

public class TestaAdvogadoDAOleTodos {

    public static void main(String[] args) throws Exception {
        
        JOptionPane.showMessageDialog(null, AdvogadoDAO.leTodos());   
        
    }
    
}
