package testes.DeFuncionario;
import javax.swing.JOptionPane;
import persistencia.DeFuncionarioDAO;

public class TestaDeFuncionarioDAOleUm {

    public static void main(String[] args) throws Exception {
       
        //Inserir o ID da reunião para a consulta.       
        JOptionPane.showMessageDialog(null, DeFuncionarioDAO.leUm1(5));
        
        //Inserir a data para consulta.
//        JOptionPane.showMessageDialog(null, DeFuncionarioDAO.leUm2("21/11/2018"));
        
        //Inserir o ID e a data para consulta
//        JOptionPane.showMessageDialog(null, DeFuncionarioDAO.leUm3(2, "22/11/2018"));
        
        //Inserir o ID ou a data para consulta
//        JOptionPane.showMessageDialog(null, DeFuncionarioDAO.leUm4(2, ""));

        
        
        
    }
    
}
