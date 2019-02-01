package testes.audienciaAdvogado;
import javax.swing.JOptionPane;
import persistencia.AudienciaAdvogadoDAO;

public class TestaAudienciaAdvogadoDAOaltera {

    public static void main(String[] args) throws Exception {
        
        //Motivo do agendamento, ID da audiência, novo id da audiência com o advogado, onde for o antigo id da audiência com o advogado. 
        JOptionPane.showMessageDialog(null, AudienciaAdvogadoDAO.altera1("Processo nº 456780", 1, 12, 11));        
        
        //Motivo do agendamento, ID do advogado, ID da audiência, novo id da audiência com o advogado, onde for o antigo id da audiência com o advogado. 
//        JOptionPane.showMessageDialog(null, AudienciaAdvogadoDAO.altera2("Processo nº 456780", 2, 2, 13, 12));
    }
    
}
