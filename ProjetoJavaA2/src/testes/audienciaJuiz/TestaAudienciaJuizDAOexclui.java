package testes.audienciaJuiz;
import javax.swing.JOptionPane;
import persistencia.AudienciaJuizDAO;

public class TestaAudienciaJuizDAOexclui {

    public static void main(String[] args) throws Exception {
        
        //Inserir o ID para apagar a audiência desejada.
        JOptionPane.showMessageDialog(null, AudienciaJuizDAO.exclui1(3));   
        
        //Inserir o ID da audiência com o juiz e o id do juiz para apagar a audiência
//        JOptionPane.showMessageDialog(null, AudienciaJuizDAO.exclui2(0, 0));
      
    }
    
}
    