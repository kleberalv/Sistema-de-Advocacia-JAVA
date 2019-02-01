package testes.endereco;
import javax.swing.JOptionPane;
import persistencia.EnderecoDAO;

public class TestaEnderecoDAOleTodos {

    public static void main(String[] args) throws Exception {
       
        JOptionPane.showMessageDialog(null, EnderecoDAO.leTodos());   
        
    }
    
}
