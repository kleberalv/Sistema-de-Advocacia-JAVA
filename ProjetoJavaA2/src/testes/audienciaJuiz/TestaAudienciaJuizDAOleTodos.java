package testes.audienciaJuiz;
import javax.swing.JOptionPane;
import persistencia.AudienciaJuizDAO;

public class TestaAudienciaJuizDAOleTodos {

    public static void main(String[] args) throws Exception {
                   
//        System.out.println(AudienciaJuizDAO.leTodos1());
        JOptionPane.showMessageDialog(null, AudienciaJuizDAO.leTodos1());  
        
        //Lê todos pelo ID do juiz.
//        System.out.println(AudienciaJuizDAO.leTodos2(2));
//        JOptionPane.showMessageDialog(null, AudienciaJuizDAO.leTodos2(2)); 
      
    }
    
}
