package testes.DeFuncionario;
import javax.swing.JOptionPane;
import persistencia.DeFuncionarioDAO;

public class TestaDeFuncionarioDAOaltera {

    public static void main(String[] args) throws Exception {
        
        
        //Motivo do agendamento, data agendada, id do agendamento funcionario
        JOptionPane.showMessageDialog(null, DeFuncionarioDAO.altera1("Demissão de funcionario", "28/11/2018",5));
        
        //Motivo do agendamento, data agendada, id do agendaemnto, data agendada onde tudo será alterado
//        JOptionPane.showMessageDialog(null, DeFuncionarioDAO.altera2("Contratação de funcionario", "28/11/2018",5, "28/11/2018"));
       
        //Motivo do agendamento, data agendada, id do agendamento, id do agendamento e a data que será alterada
//        JOptionPane.showMessageDialog(null, DeFuncionarioDAO.altera3("Admissão de funcionario", "28/11/2018", 5, 5, "28/11/2018"));
       
        //Motivo do agendamento, data agendada, id do agendamento, id do agendamento ou a data que será alterada
//        JOptionPane.showMessageDialog(null, DeFuncionarioDAO.altera3("morte de funcionario", "28/11/2018", 5, 5, "28/11/2018"));
        
        
    }
    
}
