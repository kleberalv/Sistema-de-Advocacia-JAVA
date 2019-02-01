package testes.advogado;
import javax.swing.JOptionPane;
import persistencia.AdvogadoDAO;

public class TestaAdvogadoDAOleUm {

    public static void main(String[] args) throws Exception {

    //Inserir o ID do advogado.        
        JOptionPane.showMessageDialog(null,AdvogadoDAO.leUm1(10));

    //Inserir a OAB do advogado.   
//        JOptionPane.showMessageDialog(null,AdvogadoDAO.leUm2(96325));

    //Inserir o ID e a OAB do advogado.   
//        JOptionPane.showMessageDialog(null,AdvogadoDAO.leUm3(1, 12345));

    //Inserir o ID ou a OAB do advogado.   
//        JOptionPane.showMessageDialog(null,AdvogadoDAO.leUm4(1, 12345));


        
        
        
    }
    
}
