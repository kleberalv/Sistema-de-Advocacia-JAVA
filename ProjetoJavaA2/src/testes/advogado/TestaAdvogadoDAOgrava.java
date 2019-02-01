package testes.advogado;
import javax.swing.JOptionPane;
import persistencia.AdvogadoDAO;

public class TestaAdvogadoDAOgrava {

    public static void main(String[] args) throws Exception {
        
        //id,nome, sexo, oab, email, Endereco_idEndereco        
        JOptionPane.showMessageDialog(null,AdvogadoDAO.grava(10, "oi", "m", 14563, "oi@", 1));
    }
    
}
