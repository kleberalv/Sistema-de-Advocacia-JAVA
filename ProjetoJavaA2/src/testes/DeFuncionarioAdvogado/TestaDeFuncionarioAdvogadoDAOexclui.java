package testes.DeFuncionarioAdvogado;
import javax.swing.JOptionPane;
import persistencia.DeFuncionarioAdvogadoDAO;

public class TestaDeFuncionarioAdvogadoDAOexclui {

    public static void main(String[] args) throws Exception {
        
        //Inserir o ID para apagar o agendamento desejado.
        JOptionPane.showMessageDialog(null, DeFuncionarioAdvogadoDAO.exclui1(9)); 
        
        //ID do agendamento dejejado e ID do advogado
//        JOptionPane.showMessageDialog(null, DeFuncionarioAdvogadoDAO.exclui2(9, 1));    
      
    }
    
}
    