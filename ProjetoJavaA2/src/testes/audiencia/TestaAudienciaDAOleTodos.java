package testes.audiencia;
import javax.swing.JOptionPane;
import persistencia.AudienciaDAO;

public class TestaAudienciaDAOleTodos {

    public static void main(String[] args) throws Exception {
        
        JOptionPane.showMessageDialog(null, AudienciaDAO.leTodos());   
        
    }
    
}
