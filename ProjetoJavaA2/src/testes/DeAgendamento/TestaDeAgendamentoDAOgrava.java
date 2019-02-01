package testes.DeAgendamento;
import javax.swing.JOptionPane;
import persistencia.DeAgendamentoDAO;

public class TestaDeAgendamentoDAOgrava {

    public static void main(String[] args) throws Exception {
// idAgendamento, dataAgendada, motivoAgendamento

        JOptionPane.showMessageDialog(null, DeAgendamentoDAO.grava(10,"27/11/2018", "Teste"));

    }
    
}
