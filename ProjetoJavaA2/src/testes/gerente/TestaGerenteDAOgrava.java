package testes.gerente;
import javax.swing.JOptionPane;
import persistencia.GerenteDAO;

public class TestaGerenteDAOgrava {

    public static void main(String[] args) throws Exception {
        
        //Inserir o ID, email, nome, cpf, sexo, idEndereco.        
        JOptionPane.showMessageDialog(null, GerenteDAO.grava(10, "oi@gemeai.com", "Legalzão", "123.695.741-20", "m", 1));
    }
    
}
