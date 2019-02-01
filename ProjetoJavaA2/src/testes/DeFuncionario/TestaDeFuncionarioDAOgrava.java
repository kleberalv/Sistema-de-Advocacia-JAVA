package testes.DeFuncionario;
import javax.swing.JOptionPane;
import persistencia.DeFuncionarioDAO;

public class TestaDeFuncionarioDAOgrava {

    public static void main(String[] args) throws Exception {
        
        //ID do agendamento, motivo do agendamento e a data agendada.
        JOptionPane.showMessageDialog(null, DeFuncionarioDAO.grava(5, "Teste","27/11/2018"));

    }
    
}
