package testes.juiz;
import javax.swing.JOptionPane;
import persistencia.JuizDAO;

public class TestaJuizDAOleUm {

    public static void main(String[] args) throws Exception {
        
        //Inserir o ID para a consulta.
        JOptionPane.showMessageDialog(null, JuizDAO.leUm1(1));
        
        //Inserir o nome para consulta.
//        JOptionPane.showMessageDialog(null, JuizDAO.leUm2("Reginaldo"));
        
        //Inserir o id e o nome para consulta.
//        JOptionPane.showMessageDialog(null, JuizDAO.leUm3(1,"Reginaldo"));
        
        //Inserir ID ou o nome para consulta.
//        JOptionPane.showMessageDialog(null, JuizDAO.leUm4(0,"Reginaldo"));

        
        
        
    }
    
}
