package testes.DeFuncionarioGerente;
import javax.swing.JOptionPane;
import persistencia.DeFuncionarioGerenteDAO;

public class TestaDeFuncionarioGerenteDAOleTodos {

    public static void main(String[] args) throws Exception {
                   
//        System.out.println(DeFuncionarioGerenteDAO.leTodos1());
        JOptionPane.showMessageDialog(null, DeFuncionarioGerenteDAO.leTodos1());   
        
        //Lê todos por gerente.
//        System.out.println(DeFuncionarioGerenteDAO.leTodos2(1));
//        JOptionPane.showMessageDialog(null, DeFuncionarioGerenteDAO.leTodos2(1));   
        
    }
    
}
