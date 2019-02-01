package testes.DeFuncionarioGerente;
import javax.swing.JOptionPane;
import persistencia.DeFuncionarioGerenteDAO;

public class TestaDeFuncionarioGerenteDAOexclui {

    public static void main(String[] args) throws Exception {
        
        //Inserir o ID para apagar a reunião desejado.
        JOptionPane.showMessageDialog(null, DeFuncionarioGerenteDAO.exclui1(10));    
      
    }
    
}
    