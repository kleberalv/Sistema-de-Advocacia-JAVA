package testes.gerente;

import javax.swing.JOptionPane;
import persistencia.GerenteDAO;

public class TestaGerenteDAOaltera {

    public static void main(String[] args) throws Exception {
        
        //Inserir o ID no qual os dados serão alterados, novo nome, sexo, cpf e e-mail.
        JOptionPane.showMessageDialog(null, GerenteDAO.altera1(12, "Luvas", "f", "000.000.000-00", "@"));
        
        //Inserir o novo nome, sexo, ID, e-mail, cpf novo e o antigo cpf no qual será alterado.
//        JOptionPane.showMessageDialog(null, GerenteDAO.altera2("Luvas", "f", 11, "@an", "006...", "000.000.000-00"));

        //Inserir o novo nome, sexo, ID, e-mail, cpf e o antigo id e CPF no qual será alterado.
//        JOptionPane.showMessageDialog(null, GerenteDAO.altera3("Lucas", "m", 12, "Lucas@tacerto.org", "111.222.333-44", 11, "006..."));

        //Inserir o novo nome, sexo, ID, e-mail, cpf e o antigo ID ou CPF no qual será alterado.
//        JOptionPane.showMessageDialog(null, GerenteDAO.altera4("LucasS", "m", 12, "Lucas@tacerto.org", "111.222.333-44", 12, ""));
        
        
    }
    
}
