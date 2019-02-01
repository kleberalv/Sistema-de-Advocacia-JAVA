package teste.conexao;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import persistencia.GerenteDeConexao;

public class TestaConexao {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        GerenteDeConexao g = new GerenteDeConexao();

        if (g != null) {
            JOptionPane.showMessageDialog(null, "Conectado!");
        } else {
            JOptionPane.showMessageDialog(null, "Não conectado! Revise as opções e tente novamente.");
        }

    }

}
