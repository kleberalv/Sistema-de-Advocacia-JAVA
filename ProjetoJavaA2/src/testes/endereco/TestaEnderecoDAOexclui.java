package testes.endereco;

import javax.swing.JOptionPane;
import persistencia.EnderecoDAO;

public class TestaEnderecoDAOexclui {

    public static void main(String[] args) throws Exception {
        
        //Inserir o ID para apagar o endereço.
        JOptionPane.showMessageDialog(null, EnderecoDAO.exclui1(10));   
        
        //Inserir a rua para apagar o endereço.
//        JOptionPane.showMessageDialog(null, EnderecoDAO.exclui2("Vicente Claras"));
        
        //Inserir o ID e a rua para apagar o endereço.
//        JOptionPane.showMessageDialog(null, EnderecoDAO.exclui3(10, "Vicente Claras"));
        
        //Inserir o ID ou a rua para apagar o endereço.
//        JOptionPane.showMessageDialog(null, EnderecoDAO.exclui4(10, "Vicente Claras"));
      
    }
    
}
    