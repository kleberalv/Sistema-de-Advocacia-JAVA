package testes.DeFuncionario;
import javax.swing.JOptionPane;
import persistencia.DeFuncionarioDAO;

public class TestaDeFuncionarioDAOleTodos {

    public static void main(String[] args) throws Exception {
                   
        JOptionPane.showMessageDialog(null, DeFuncionarioDAO.leTodos());   
        
    }
    
}
