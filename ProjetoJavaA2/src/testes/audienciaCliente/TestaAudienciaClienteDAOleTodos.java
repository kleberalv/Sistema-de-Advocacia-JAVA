package testes.audienciaCliente;
import javax.swing.JOptionPane;
import persistencia.AudienciaClienteDAO;
 
public class TestaAudienciaClienteDAOleTodos {

    public static void main(String[] args) throws Exception {
        
//        System.out.println(AudienciaClienteDAO.leTodos1());
        JOptionPane.showMessageDialog(null, AudienciaClienteDAO.leTodos1());
        
        //Lê tudo por CPF cliente.
//       System.out.println(AudienciaClienteDAO.leTodos2("123.456.789-10"));
//        JOptionPane.showMessageDialog(null, AudienciaClienteDAO.leTodos2("123.456.789-10"));
        
    }
    
}
