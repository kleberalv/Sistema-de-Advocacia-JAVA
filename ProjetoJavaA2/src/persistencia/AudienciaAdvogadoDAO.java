package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.AudienciaAdvogado;

public class AudienciaAdvogadoDAO {

    private static Connection connection;
    private static PreparedStatement st;
    private static ResultSet rs;

    
    public static List<AudienciaAdvogado> leTodos1() throws Exception {
        List<AudienciaAdvogado> listAudienciaAdvogados = new ArrayList<AudienciaAdvogado>();
        try {
            String sql = "SELECT * FROM AudienciaAdvogado";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                AudienciaAdvogado auda = new AudienciaAdvogado();
                
                auda.setIdAudienciaAdvogado(rs.getInt("idAudienciaAdvogado"));                
                auda.setMotivoAgendamento(rs.getString("motivoAgendamento"));
                auda.setAdvogado(AdvogadoDAO.leUm1(rs.getInt("advogado_id")));
                auda.setAudiencia(AudienciaDAO.leUm1(rs.getInt("audiencia_idAudiencia")));      

                listAudienciaAdvogados.add(auda);
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listAudienciaAdvogados;
    }
  
    public static List<AudienciaAdvogado> leTodos2(int advogado_id) throws Exception {
        List<AudienciaAdvogado> listAudienciaAdvogados = new ArrayList<AudienciaAdvogado>();
        try {
            String sql =    "SELECT * FROM  Audiencia a INNER JOIN "+
                            "AudienciaAdvogado aa ON aa.idAudienciaAdvogado = aa.idAudienciaAdvogado "+
                            "WHERE advogado_id = ?";
            
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, advogado_id);
            rs = st.executeQuery();
            while (rs.next()) {
                AudienciaAdvogado auda = new AudienciaAdvogado();
                
                auda.setIdAudienciaAdvogado(rs.getInt("idAudienciaAdvogado"));                
                auda.setMotivoAgendamento(rs.getString("motivoAgendamento"));
                auda.setAdvogado(AdvogadoDAO.leUm1(rs.getInt("advogado_id")));
                auda.setAudiencia(AudienciaDAO.leUm1(rs.getInt("audiencia_idAudiencia")));       

                listAudienciaAdvogados.add(auda);
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listAudienciaAdvogados;
    }
 
    public static int grava(int idAudienciaAdvogado, String motivoAgendamento, int audiencia_idAudiencia, int advogado_id) throws Exception {
        int ret = 0;
        try {
            String sql = "INSERT INTO AudienciaAdvogado (idAudienciaAdvogado, motivoAgendamento, audiencia_idAudiencia, advogado_id) VALUES ( ?, ?, ?, ?)";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setInt(1, idAudienciaAdvogado);            
            st.setString(2, motivoAgendamento);
            st.setInt(3, audiencia_idAudiencia);
            st.setInt(4, advogado_id);

            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    
    public static int altera1(String motivoAgendamento, int audiencia_idAudiencia, int idAudienciaAdvogadon, int idAudienciaAdvogado) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE audienciaAdvogado SET motivoAgendamento = ?, audiencia_idAudiencia = ?, idAudienciaAdvogado = ? WHERE idAudienciaAdvogado = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setString(1, motivoAgendamento);
            st.setInt(2, audiencia_idAudiencia);
            st.setInt(3, idAudienciaAdvogadon);
            st.setInt(4, idAudienciaAdvogado);
            ret = st.executeUpdate();
            
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    
    public static int altera2(String motivoAgendamento, int advogado_id, int audiencia_idAudiencia, int idAudienciaAdvogadon, int idAudienciaAdvogado) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE audienciaAdvogado SET motivoAgendamento = ?, advogado_id = ?, audiencia_idAudiencia = ?, idAudienciaAdvogado = ? WHERE idAudienciaAdvogado = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setString(1, motivoAgendamento);
            st.setInt(2, advogado_id);
            st.setInt(3, audiencia_idAudiencia);
            st.setInt(4, idAudienciaAdvogadon);
            st.setInt(5, idAudienciaAdvogado);
            ret = st.executeUpdate();
            
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    
    public static int exclui1(int idAudienciaAdvogado) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM audienciaAdvogado WHERE idAudienciaAdvogado = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idAudienciaAdvogado);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    
    public static int exclui2(int idAudienciaAdvogado, int advogado_id) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM audienciaAdvogado WHERE idAudienciaAdvogado = ? AND advogado_id = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idAudienciaAdvogado);
            st.setInt(2, advogado_id);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

}
