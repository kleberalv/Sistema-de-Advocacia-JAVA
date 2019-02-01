package testes.audienciaCliente;

import javax.swing.JOptionPane;
import persistencia.AudienciaClienteDAO;

public class TestaAudienciaClienteDAOaltera {

    public static void main(String[] args) throws Exception {
        
        //Motivo do Agendamento, CPF do cliente, novo ID da audiência com o cliente onde for o antigo ID com o cliente
        JOptionPane.showMessageDialog(null, AudienciaClienteDAO.altera1("", "", 0, 0));
        
        //Motivo do agendamento, o ID da audiência, CPF do cliente, ID novo da audiência com o cliente onde for o antigo ID com o cliente
//        JOptionPane.showMessageDialog(null, AudienciaClienteDAO.altera2("", 0, "", 0, 0));
              
    }
    
}
