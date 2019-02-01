package testes.juiz;
import javax.swing.JOptionPane;
import persistencia.JuizDAO;

public class TestaJuizDAOaltera {

    public static void main(String[] args) throws Exception {
        
        //Inserir o novo nome do juiz, novo id e o id atual para alteração
        JOptionPane.showMessageDialog(null, JuizDAO.altera1("Krebin", 11, 10));

        //Inserir o novo nome do juiz, novo id e o nome atual para alteração
//        JOptionPane.showMessageDialog(null, JuizDAO.altera2("Krebun", 11, "Krebin"));
        
        //Inserir o novo nome do juiz, novo id.O id atual e o nome atual para alteração
//        JOptionPane.showMessageDialog(null, JuizDAO.altera3("Kreball", 12, "Krebun", 11));

        //Inserir o novo nome do juiz, novo id. O id atual ou nome atual para alteração
//        JOptionPane.showMessageDialog(null, JuizDAO.altera4("Krebin", 10, "", 12));
        
        
    }
    
}
