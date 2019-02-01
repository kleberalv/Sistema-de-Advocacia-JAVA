package testes.DeAgendamento;
import javax.swing.JOptionPane;
import persistencia.DeAgendamentoDAO;

public class TestaDeAgendamentoDAOexclui {

    public static void main(String[] args) throws Exception {
        
        //Inserir o ID para apagar a audiência desejado.
        JOptionPane.showMessageDialog(null, DeAgendamentoDAO.exclui1(10)); 
        
        //Inserir a data agendada para a exclir.
        JOptionPane.showMessageDialog(null, DeAgendamentoDAO.exclui2("27/11/2018"));
        
        //Inserir o ID e a data agendada para excluir.
        JOptionPane.showMessageDialog(null, DeAgendamentoDAO.exclui3(1, "27/11/2018"));
        
        //Inserir o ID OU a data agendada para excluir.
        JOptionPane.showMessageDialog(null, DeAgendamentoDAO.exclui4(0, "27/11/2018"));
      
    }
    
}
    