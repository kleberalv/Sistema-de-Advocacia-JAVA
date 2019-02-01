package testes.audienciaCliente;
import javax.swing.JOptionPane;
import persistencia.AudienciaClienteDAO;

public class TestaAudienciaClienteDAOexclui {

    public static void main(String[] args) throws Exception {
        
        //Inserir o ID da audiência com o cliente para apagar a audiência desejada.
        JOptionPane.showMessageDialog(null, AudienciaClienteDAO.exclui1(0));
        
        //Inserir o ID da audiência com o cliente e o CPF do cliente para apagar a audiência desejada.        
//        JOptionPane.showMessageDialog(null, AudienciaClienteDAO.exclui2(0, ""));
      
    }
    
}
    