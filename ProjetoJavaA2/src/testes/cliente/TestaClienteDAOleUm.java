package testes.cliente;

import javax.swing.JOptionPane;
import persistencia.ClienteDAO;

public class TestaClienteDAOleUm {

    public static void main(String[] args) throws Exception {

        //Inserir o CPF para a consulta.
        JOptionPane.showMessageDialog(null, ClienteDAO.leUm1("123.456.789-10"));
        
        //Inserir o nome para a consulta.
//        JOptionPane.showMessageDialog(null, ClienteDAO.leUm2("Raquel"));
        
        //Inserir o CPF e o nome para a consulta. Obrigatoriamente os dois. 
//        JOptionPane.showMessageDialog(null, ClienteDAO.leUm3("123.456.789-10","Raquel"));
        
        //Inserir o CPF ou o nome para consulta
//        JOptionPane.showMessageDialog(null, ClienteDAO.leUm4("123.456.789-10","Raquel"));

        
        
        
    }
    
}
