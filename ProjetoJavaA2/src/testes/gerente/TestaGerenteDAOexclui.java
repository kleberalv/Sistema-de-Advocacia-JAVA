package testes.gerente;
import javax.swing.JOptionPane;
import persistencia.GerenteDAO;

public class TestaGerenteDAOexclui {

    public static void main(String[] args) throws Exception {
        
        //Inserir o ID para apagar o gerente desejado.
        JOptionPane.showMessageDialog(null, GerenteDAO.exclui1(12));  
        
        //Inserir o CPD para apagar o gerente desejado
//        JOptionPane.showMessageDialog(null, GerenteDAO.exclui2("000.000.000-00"));
        
        //Inserir o ID e o CPF do gerente para efetuar a exclusão.
//        JOptionPane.showMessageDialog(null, GerenteDAO.exclui3(10, "000.000.000-00"));
        
        //Inserir o ID ou o CPF do gerente para efetuar a exclusão.
//        JOptionPane.showMessageDialog(null, GerenteDAO.exclui4(0, "000.000.000-00"));
      
    }
    
}
    