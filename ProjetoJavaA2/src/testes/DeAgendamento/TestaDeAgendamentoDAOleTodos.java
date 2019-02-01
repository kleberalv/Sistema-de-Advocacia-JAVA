package testes.DeAgendamento;

import javax.swing.JOptionPane;
import persistencia.DeAgendamentoDAO;

public class TestaDeAgendamentoDAOleTodos {

    public static void main(String[] args) throws Exception {
                   
//        System.out.println(DeAgendamentoDAO.leTodos());         
        JOptionPane.showMessageDialog(null, DeAgendamentoDAO.leTodos());
        
    }
    
}
