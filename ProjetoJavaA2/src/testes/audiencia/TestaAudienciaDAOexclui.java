package testes.audiencia;
import javax.swing.JOptionPane;
import persistencia.AudienciaDAO;

public class TestaAudienciaDAOexclui {

    public static void main(String[] args) throws Exception {
        
        //Inserir o ID para apagar a audiência desejado.
        JOptionPane.showMessageDialog(null, AudienciaDAO.exclui1(4));  
        
        //Inserir a data da audiência para excluir
//        JOptionPane.showMessageDialog(null, AudienciaDAO.exclui2("27/11/2018"));
        
        //Inserir o ID e a data da audiência para excluir.
//        JOptionPane.showMessageDialog(null, AudienciaDAO.exclui3(1, "27/11/2018"));
        
        //Inserir o ID OU a data da audiência para excluir.
//        JOptionPane.showMessageDialog(null, AudienciaDAO.exclui4(1, "27/11/2018"));
    }
    
}
    