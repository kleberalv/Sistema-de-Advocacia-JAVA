package testes.endereco;
import javax.swing.JOptionPane;
import persistencia.EnderecoDAO;

public class TestaEnderecoDAOgrava {

    public static void main(String[] args) throws Exception {
        
        //Rua, numero, idEndereco
        JOptionPane.showMessageDialog(null, EnderecoDAO.grava("VIcente Claras",14,3));
    }
    
}
