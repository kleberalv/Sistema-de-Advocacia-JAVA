package testes.audienciaJuiz;

import javax.swing.JOptionPane;
import persistencia.AudienciaJuizDAO;

public class TestaAudienciaJuizDAOaltera {

    public static void main(String[] args) throws Exception {
        
        // ID da audiência, novo ID da audiência com o juiz, onde o ID da audiência com o juiz for:
        JOptionPane.showMessageDialog(null, AudienciaJuizDAO.altera1(2, 1, 1));
        
        //ID da audiencia, ID do juiz, novo ID da audiência com o juiz, onde o id antigo for
//        JOptionPane.showMessageDialog(null, AudienciaJuizDAO.altera2(0, 0, 0, 0));

        
        
    }
    
}
