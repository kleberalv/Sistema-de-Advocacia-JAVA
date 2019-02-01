package testes.DeFuncionario;
import javax.swing.JOptionPane;
import persistencia.DeFuncionarioDAO;

public class TestaDeFuncionarioDAOexclui {

    public static void main(String[] args) throws Exception {
        
        //Inserir o ID para apagar a reunião de funcionário.
        JOptionPane.showMessageDialog(null, DeFuncionarioDAO.exclui1(5));    
        
        //Inserir a data para apagar a reunião de funcionário.
//        JOptionPane.showMessageDialog(null, DeFuncionarioDAO.exclui2("27/11/2018"));
      
        //Inserir o ID e a data para apagar a reunião de funcionário.
//        JOptionPane.showMessageDialog(null, DeFuncionarioDAO.exclui3(5, "27/11/2018"));
        
        //Inserir o ID ou a data para apagar a reunião de funcionário.        
//        JOptionPane.showMessageDialog(null, DeFuncionarioDAO.exclui4(0, "27/11/2018"));
        
    }
    
}
    