package testes.endereco;

import javax.swing.JOptionPane;
import persistencia.EnderecoDAO;

public class TestaEnderecoDAOaltera {

    public static void main(String[] args) throws Exception {
        
        //Novo nome da rua, novo número, novo id onde o id for: 
        JOptionPane.showMessageDialog(null, EnderecoDAO.altera1("ELESIM", 89, 25, 10));
        
        //Novo nome da rua, novo número, novo id onde o nome da rua for: 
//        JOptionPane.showMessageDialog(null, EnderecoDAO.altera2("ELENAO", 50, 15, "ELESIM"));

        //Novo nome da rua, novo número, novo ID. Ondeo  id for E o nome da rua for:
//        JOptionPane.showMessageDialog(null, EnderecoDAO.altera3("Goiânia", 69, 8, 15, "CUSIM"));

        //Novo nome da rua, novo número, novo ID. Ondeo  id for OU O nome da rua for:
//        JOptionPane.showMessageDialog(null, EnderecoDAO.altera4("Planaltina", 25, 6, 8, ""));
    }
    
}
