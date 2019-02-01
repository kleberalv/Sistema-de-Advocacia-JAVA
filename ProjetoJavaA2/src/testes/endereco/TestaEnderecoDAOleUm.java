package testes.endereco;
import javax.swing.JOptionPane;
import persistencia.EnderecoDAO;

public class TestaEnderecoDAOleUm {

    public static void main(String[] args) throws Exception {
        
        //Inserir o ID do endereço para a consulta.
        JOptionPane.showMessageDialog(null, EnderecoDAO.leUm1(1));
        
        //Inserir o nome da rua para a consulta
//        JOptionPane.showMessageDialog(null, EnderecoDAO.leUm2("Vicente Pires"));
        
        //Inserir o ID e o nome da rua para consulta
//        JOptionPane.showMessageDialog(null, EnderecoDAO.leUm3(1,"Areal"));           
        
        //Inserir o ID ou o nome da rua para consulta
//        JOptionPane.showMessageDialog(null, EnderecoDAO.leUm4(4,""));           
        
        
    }
    
}
