package testes.DeFuncionarioAdvogado;
import javax.swing.JOptionPane;
import persistencia.DeFuncionarioAdvogadoDAO;

public class TestaDeFuncionarioAdvogadoDAOgrava {

    public static void main(String[] args) throws Exception {
        
        // ID agendamento de funcionário, ID do advogado, ID DeFuncionarioAdvogado
        JOptionPane.showMessageDialog(null, DeFuncionarioAdvogadoDAO.grava(2,1,9));

    }
    
}
