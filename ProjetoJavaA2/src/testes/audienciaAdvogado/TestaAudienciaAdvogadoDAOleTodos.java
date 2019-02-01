package testes.audienciaAdvogado;
import javax.swing.JOptionPane;
import persistencia.AudienciaAdvogadoDAO;

public class TestaAudienciaAdvogadoDAOleTodos {

    public static void main(String[] args) throws Exception {

//        System.out.println(AudienciaAdvogadoDAO.leTodos1());
        JOptionPane.showMessageDialog(null, AudienciaAdvogadoDAO.leTodos1());
        
        //Lê todos por ID do advogado.
//        System.out.println(AudienciaAdvogadoDAO.leTodos2(1));
//        JOptionPane.showMessageDialog(null, AudienciaAdvogadoDAO.leTodos2(1));
        
    }
    
}
