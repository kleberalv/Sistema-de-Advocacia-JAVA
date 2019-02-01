package testes.DeAgendamento;
import javax.swing.JOptionPane;
import persistencia.DeAgendamentoDAO;

public class TestaDeAgendamentoleUm {

    public static void main(String[] args) throws Exception {

        //Inserir o ID do agendamento para a consulta.        
        JOptionPane.showMessageDialog(null, DeAgendamentoDAO.leUm1(10));

        //Inserir a data agendada para a consulta.
//        JOptionPane.showMessageDialog(null, DeAgendamentoDAO.leUm2("25/11/2018"));
        
        //Inserir o ID e a data pra consulta.
//        JOptionPane.showMessageDialog(null, DeAgendamentoDAO.leUm3(1, "25/11/2018"));
        
        //Inserir o ID ou a data para consulta
//        JOptionPane.showMessageDialog(null, DeAgendamentoDAO.leUm4(1,""));

        
        
        
    }
    
}
