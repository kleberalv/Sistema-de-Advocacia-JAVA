package testes.DeFuncionarioGerente;
import javax.swing.JOptionPane;
import persistencia.DeFuncionarioGerenteDAO;

public class TestaDeFuncionarioGerenteDAOgrava {

    public static void main(String[] args) throws Exception {
        
        // ID agendamento do funcionário, ID do gerente, ID DeFuncionarioGerente 
        JOptionPane.showMessageDialog(null, DeFuncionarioGerenteDAO.grava(2,1,10));

    }
    
}
