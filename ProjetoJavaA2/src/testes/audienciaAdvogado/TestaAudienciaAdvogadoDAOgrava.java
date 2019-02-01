package testes.audienciaAdvogado;
import javax.swing.JOptionPane;
import persistencia.AudienciaAdvogadoDAO;

public class TestaAudienciaAdvogadoDAOgrava {

    public static void main(String[] args) throws Exception {

        //ID da audiência com advogado, motivo da audiência, ID da audiência, ID do advogado.
        JOptionPane.showMessageDialog(null, AudienciaAdvogadoDAO.grava(11, "Teste", 1, 2));

    }
    
}
