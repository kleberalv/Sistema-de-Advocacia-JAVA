package testes.audiencia;

import javax.swing.JOptionPane;
import persistencia.AudienciaDAO;

public class TestaAudienciaDAOaltera {

    public static void main(String[] args) throws Exception {
        
        //Data da audiência, ID da audiência, onde for o antigo ID da audiência.
        JOptionPane.showMessageDialog(null,AudienciaDAO.altera1("27/05/1999",11, 10));
        
        //data da audiência, ID da audiência, onde for a data da audiência que será alterada.
//        JOptionPane.showMessageDialog(null,AudienciaDAO.altera2("27/06/1999",10, ""));

        //ID da audiência, data da audiência onde o id da aldiência a ser alterada e a data forem.
//        JOptionPane.showMessageDialog(null,AudienciaDAO.altera3(9,"27/06/1999", 0, ""));

        //ID da audiência, data da audiência onde a ID da audiência OU a data forem.
//        JOptionPane.showMessageDialog(null, AudienciaDAO.altera4(11,"afafa", 0, ""));
        
        
    }
    
}
