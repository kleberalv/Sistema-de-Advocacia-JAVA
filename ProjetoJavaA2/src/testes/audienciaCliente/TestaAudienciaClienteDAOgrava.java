package testes.audienciaCliente;
import javax.swing.JOptionPane;
import persistencia.AudienciaClienteDAO;

public class TestaAudienciaClienteDAOgrava {

    public static void main(String[] args) throws Exception {
        
        //Id da audiencia, motivo da audiencia, cpf do cliente, ID da audiência
        JOptionPane.showMessageDialog(null, AudienciaClienteDAO.grava(3, "oi", 3, "123.456.789-10"));

    }
    
}
