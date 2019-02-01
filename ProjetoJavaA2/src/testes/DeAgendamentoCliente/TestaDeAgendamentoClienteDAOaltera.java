package testes.DeAgendamentoCliente;
import javax.swing.JOptionPane;
import persistencia.DeAgendamentoClienteDAO;

public class TestaDeAgendamentoClienteDAOaltera {

    public static void main(String[] args) throws Exception {
        
        //  Id do agendamento onde o id de agendamento cliente for.         
        JOptionPane.showMessageDialog(null, DeAgendamentoClienteDAO.altera1(2,3));
        
        //ID do agendamento, CPF do cliente onde o id do agendamento cliente for.
//        JOptionPane.showMessageDialog(null, DeAgendamentoClienteDAO.altera2(1, "147.258.369-10", 3));
        
    }
    
}
