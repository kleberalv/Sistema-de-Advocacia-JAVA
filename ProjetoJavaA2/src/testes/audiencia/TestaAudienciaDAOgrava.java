package testes.audiencia;
import javax.swing.JOptionPane;
import persistencia.AudienciaDAO;

public class TestaAudienciaDAOgrava {

    public static void main(String[] args) throws Exception {
        
        //Data da audiência e o ID
        JOptionPane.showMessageDialog(null, AudienciaDAO.grava("", 4));
    }
    
}
