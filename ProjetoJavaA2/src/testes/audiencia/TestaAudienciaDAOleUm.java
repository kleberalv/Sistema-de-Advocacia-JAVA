package testes.audiencia;
import javax.swing.JOptionPane;
import persistencia.AudienciaDAO;

public class TestaAudienciaDAOleUm {

    public static void main(String[] args) throws Exception {
        
        //Inserir o ID da audiência para a consulta.       
        JOptionPane.showMessageDialog(null, AudienciaDAO.leUm1(1));
        
        //Inserir a data da audiência para consulta.
//        JOptionPane.showMessageDialog(null, AudienciaDAO.leUm2("21/11/2018"));
        
        //Inserir o ID da audiência e a data para consulta.
//       JOptionPane.showMessageDialog(null, AudienciaDAO.leUm3(1,"21/11/2018"));
        
        //Inserir o ID da audiência ou a data para consulta
//        JOptionPane.showMessageDialog(null, AudienciaDAO.leUm4(1,""));

        
        
        
    }
    
}
