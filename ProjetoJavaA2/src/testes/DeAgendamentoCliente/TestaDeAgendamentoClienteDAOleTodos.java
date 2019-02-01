package testes.DeAgendamentoCliente;
import javax.swing.JOptionPane;
import persistencia.DeAgendamentoClienteDAO;

public class TestaDeAgendamentoClienteDAOleTodos {

    public static void main(String[] args) throws Exception {
         
        System.out.println(DeAgendamentoClienteDAO.leTodos1());
        JOptionPane.showMessageDialog(null, DeAgendamentoClienteDAO.leTodos1());   

        //Lê todos por cliente.
//        System.out.println(DeAgendamentoClienteDAO.leTodos2("123.456.789-10"));
//        JOptionPane.showMessageDialog(null, DeAgendamentoClienteDAO.leTodos2("123.456.789-10"));   
        
        
    }
    
}
