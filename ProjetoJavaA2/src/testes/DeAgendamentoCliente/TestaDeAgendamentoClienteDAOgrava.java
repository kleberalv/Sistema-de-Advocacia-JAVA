package testes.DeAgendamentoCliente;
import javax.swing.JOptionPane;
import persistencia.DeAgendamentoClienteDAO;

public class TestaDeAgendamentoClienteDAOgrava {

    public static void main(String[] args) throws Exception {
        
        // cpf, deAgendamento_idAgendamento, idDeAgendamentoCliente
        JOptionPane.showMessageDialog(null, DeAgendamentoClienteDAO.grava("147.258.369-10",1,3));

    }
    
}
