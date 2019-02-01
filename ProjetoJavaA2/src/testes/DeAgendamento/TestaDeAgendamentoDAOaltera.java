package testes.DeAgendamento;

import javax.swing.JOptionPane;
import persistencia.DeAgendamentoDAO;

public class TestaDeAgendamentoDAOaltera {

    public static void main(String[] args) throws Exception {
        
        //Motivo do agendamento, data do agendamento, novo ID do agendamento, ID do agendamento a ser alterado.
        JOptionPane.showMessageDialog(null, DeAgendamentoDAO.altera1("testeE", "27/11/2018", 10, 10));
        
        //Motivo do agendamento, data do agendamento, ID do agendamento, data do dataAgendadamento a ser alterado.
//        JOptionPane.showMessageDialog(null, DeAgendamentoDAO.altera2("Testando", "27/11/2018", 11, "27/11/2018"));
        
        //Motivo do agendamento, data do agendamento, ID do agendamento, onde o ID e a data agendada forem.
//        JOptionPane.showMessageDialog(null, DeAgendamentoDAO.altera3("Testinho", "27/11/2018", 11, 11, "27/11/2018"));
        
        //Motivo do agendamento, data do agendamento, ID do agendamento, onde o ID OU a data agendada forem.
//        JOptionPane.showMessageDialog(null, DeAgendamentoDAO.altera4("TestE", "27/11/2018", 11, 11, ""));
        
    }
    
}
