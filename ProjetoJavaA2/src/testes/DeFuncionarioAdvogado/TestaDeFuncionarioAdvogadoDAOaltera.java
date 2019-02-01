package testes.DeFuncionarioAdvogado;
import javax.swing.JOptionPane;
import persistencia.DeFuncionarioAdvogadoDAO;

public class TestaDeFuncionarioAdvogadoDAOaltera {

    public static void main(String[] args) throws Exception {
        
        //ID agendamento do funcionario, id do agendamento funcionario advogado
        JOptionPane.showMessageDialog(null, DeFuncionarioAdvogadoDAO.altera1(2, 9));
        
        //ID do agendamento do funcionario, ID do advogado, id do agendamento funcionario advogado
//        JOptionPane.showMessageDialog(null, DeFuncionarioAdvogadoDAO.altera2(1, 2, 9));
        
    }
    
}
