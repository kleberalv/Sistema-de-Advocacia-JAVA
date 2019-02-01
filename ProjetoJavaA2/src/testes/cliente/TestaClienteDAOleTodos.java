package testes.cliente;
import javax.swing.JOptionPane;
import persistencia.ClienteDAO;

public class TestaClienteDAOleTodos {

    public static void main(String[] args) throws Exception {
        
        JOptionPane.showMessageDialog(null, ClienteDAO.leTodos());   

    }
    
}
