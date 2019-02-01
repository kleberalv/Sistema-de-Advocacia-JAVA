package testes.juiz;
import javax.swing.JOptionPane;
import persistencia.JuizDAO;

public class TestaJuizDAOgrava {

    public static void main(String[] args) throws Exception {
        
        //Inserir o nome do juiz e o ID.
        JOptionPane.showMessageDialog(null, JuizDAO.grava("Krebão", 10));
    }
    
}
