package testes.gerente;
import javax.swing.JOptionPane;
import persistencia.JuizDAO;

public class TestaGerenteDAOleUm {

    public static void main(String[] args) throws Exception {
        
        //Inserir o ID do juiz para a consulta.
        JOptionPane.showMessageDialog(null, JuizDAO.leUm1(1));
        
        //Inserir o nome do juiz para a consulta.
//        JOptionPane.showMessageDialog(null, JuizDAO.leUm2("Sergio"));
        
        //Inserir o ID e o nome para a consulta.
//        JOptionPane.showMessageDialog(null, JuizDAO.leUm3(1,"Reginaldo"));
        
        //Inserir o ID ou o nome para consulta
//        JOptionPane.showMessageDialog(null, JuizDAO.leUm4(0,"Sergio"));

        
        
        
    }
    
}
