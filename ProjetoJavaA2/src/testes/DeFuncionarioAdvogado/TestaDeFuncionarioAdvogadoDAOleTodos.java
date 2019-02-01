package testes.DeFuncionarioAdvogado;
import javax.swing.JOptionPane;
import persistencia.DeFuncionarioAdvogadoDAO;

public class TestaDeFuncionarioAdvogadoDAOleTodos {

    public static void main(String[] args) throws Exception {
                   
//        System.out.println(DeFuncionarioAdvogadoDAO.leTodos1());
        JOptionPane.showMessageDialog(null, DeFuncionarioAdvogadoDAO.leTodos1());   
        
        //Lê todos por advogado
//        System.out.println(DeFuncionarioAdvogadoDAO.leTodos2(3));
        JOptionPane.showMessageDialog(null, DeFuncionarioAdvogadoDAO.leTodos2(3));   
        
    }
    
}
