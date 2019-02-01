package testes.audienciaJuiz;
import javax.swing.JOptionPane;
import persistencia.AudienciaJuizDAO;

public class TestaAudienciaJuizDAOgrava {

    public static void main(String[] args) throws Exception {

        // Id da audiência, ID do juiz, ID da audiência com o juiz.
        JOptionPane.showMessageDialog(null, AudienciaJuizDAO.grava(1, 2, 3));

    }
    
}
