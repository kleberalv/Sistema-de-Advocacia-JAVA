package testes.cliente;

import javax.swing.JOptionPane;
import persistencia.ClienteDAO;

public class TestaClienteDAOexclui {

    public static void main(String[] args) throws Exception {
        
        //Inserir o CPF para apagar o cliente desejado.
        JOptionPane.showMessageDialog(null, ClienteDAO.exclui1("987.654.321-00"));
        
        //Inserir o nome para apagar o cliente desejado.
//        JOptionPane.showMessageDialog(null, ClienteDAO.exclui2("Fulano"));
        
        //Inserir o CPF e o nome para apagar o cliente.
//        JOptionPane.showMessageDialog(null, ClienteDAO.exclui3("000.000.000-00", "Fulano"));
        
        //Inserir o CPF ou o nome para apagar o cliente.
//        JOptionPane.showMessageDialog(null, ClienteDAO.exclui4("", "Fulano"));
      
    }
    
}
    