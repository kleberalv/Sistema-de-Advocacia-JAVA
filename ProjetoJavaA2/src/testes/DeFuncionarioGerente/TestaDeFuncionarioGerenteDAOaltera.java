package testes.DeFuncionarioGerente;
import javax.swing.JOptionPane;
import persistencia.DeFuncionarioGerenteDAO;

public class TestaDeFuncionarioGerenteDAOaltera {

    public static void main(String[] args) throws Exception {
        
        //ID do agendamento de funcionario, ID funcionario gerente
        JOptionPane.showMessageDialog(null, DeFuncionarioGerenteDAO.altera1(2, 10));
        
        //ID do agendamento de funcionario, ID do gerente, ID funcionario gerente
//        JOptionPane.showMessageDialog(null, DeFuncionarioGerenteDAO.altera2(2, 2, 10));
        
    }
    
}
