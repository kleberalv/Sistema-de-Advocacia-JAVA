package testes.cliente;

import javax.swing.JOptionPane;
import persistencia.ClienteDAO;

public class TestaCllienteDAOaltera {

    public static void main(String[] args) throws Exception {
        
        //nome, idade, sexo, cpf, advogado_id, idEndereco onde for o antigo cpf
        JOptionPane.showMessageDialog(null, ClienteDAO.altera1("Maria Eduarda", 18, "f", "066.475.896-78", 2, 3, "987.654.321-00"));

        //nome, idade, sexo, cpf, advogado_id, idEndereco onde for o antigo nome
//        JOptionPane.showMessageDialog(null, ClienteDAO.altera2("Vinicius Braga", 32, "m", "159.745.963-25", 1, 2, "Maria Eduarda"));

        //nome, idade, sexo, cpf, adovogado_id, idEndereco onde for o antigo cpf e antigo nome
//        JOptionPane.showMessageDialog(null, ClienteDAO.altera3("Vini Preuss", 30, "m", "789.456.258-96", 1, 2, "159.745.963-25", "Vinicius Braga"));

        //nome, idade, sexo, cpf, adovogado_id, idEndereco onde for o antigo cpf OU o antigo nome
//        JOptionPane.showMessageDialog(null, ClienteDAO.altera4("João", 18, "m", "101.202.303-96", 1, 2, "159.745.963-25", "Vini Preuss"));
    }
    
}
