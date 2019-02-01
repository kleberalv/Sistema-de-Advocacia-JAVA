package testes.DeAgendamentoCliente;
import javax.swing.JOptionPane;
import persistencia.DeAgendamentoClienteDAO;

public class TestaDeAgendamentoClienteDAOexclui {

    public static void main(String[] args) throws Exception {
        
        //Inserir o ID para apagar a audiência desejado.
        JOptionPane.showMessageDialog(null, DeAgendamentoClienteDAO.exclui1(3));
        
        //Inserir o ID e o CPF para apagar.
//        JOptionPane.showMessageDialog(null, DeAgendamentoClienteDAO.exclui2(3, "147.258.369-10"));
      
    }
    
}
    