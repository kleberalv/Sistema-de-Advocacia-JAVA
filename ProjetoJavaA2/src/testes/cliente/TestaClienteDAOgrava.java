package testes.cliente;
import javax.swing.JOptionPane;
import persistencia.ClienteDAO;

public class TestaClienteDAOgrava {

    public static void main(String[] args) throws Exception {

        // nome,  cpf, idade, sexo, advogado_id, idEndereco
        JOptionPane.showMessageDialog(null, ClienteDAO.grava("Maria Braga", "987.654.321-00", 17, "f", 2, 2));
    }
    
}
