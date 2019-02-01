package testes.audienciaAdvogado;
import javax.swing.JOptionPane;
import persistencia.AudienciaAdvogadoDAO;

public class TestaAudienciaAdvogadoDAOexclui {

    public static void main(String[] args) throws Exception {
        
        //Inserir o ID para apagar a audiência desejado.
        JOptionPane.showMessageDialog(null, AudienciaAdvogadoDAO.exclui1(12));    
        
        //ID da audiencia e o id do advogado
//        JOptionPane.showMessageDialog(null, AudienciaAdvogadoDAO.exclui2(0, 0));
      
    }
    
}
    