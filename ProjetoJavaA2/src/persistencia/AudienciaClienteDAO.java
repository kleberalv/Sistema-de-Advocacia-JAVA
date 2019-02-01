package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.AudienciaCliente;

public class AudienciaClienteDAO {

    private static Connection connection;
    private static PreparedStatement st;
    private static ResultSet rs;

    public static List<AudienciaCliente> leTodos1() throws Exception {
        List<AudienciaCliente> listAudienciaCliente = new ArrayList<AudienciaCliente>();
        try {
            String sql = "SELECT * FROM AudienciaCliente";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                AudienciaCliente audcli = new AudienciaCliente();
                
                audcli.setMotivoAgendamento(rs.getString("motivoAgendamento"));
                audcli.setIdAudienciaCliente(rs.getInt("idAudienciaCliente"));
                audcli.setCliente(ClienteDAO.leUm1(rs.getString("cliente_cpf")));
                audcli.setAudiencia(AudienciaDAO.leUm1(rs.getInt("audiencia_idAudiencia")));

                listAudienciaCliente.add(audcli);
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listAudienciaCliente;
    }
  
    public static List<AudienciaCliente> leTodos2(String cpf) throws Exception {
        List<AudienciaCliente> listAudienciaCliente = new ArrayList<AudienciaCliente>();
        try {
            String sql =    "SELECT * FROM  Audiencia a INNER JOIN "+
                            "AudienciaCliente ac ON ac.idAudienciaCliente = ac.idAudienciaCliente "+
                            "WHERE cliente_cpf = ?";
            
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, cpf);
            rs = st.executeQuery();
            while (rs.next()) {
                AudienciaCliente audcli = new AudienciaCliente();

                audcli.setMotivoAgendamento(rs.getString("motivoAgendamento"));
                audcli.setIdAudienciaCliente(rs.getInt("idAudienciaCliente"));
                audcli.setCliente(ClienteDAO.leUm1(rs.getString("cliente_cpf")));
                audcli.setAudiencia(AudienciaDAO.leUm1(rs.getInt("audiencia_idAudiencia")));

                listAudienciaCliente.add(audcli);
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listAudienciaCliente;
    }

    public static int grava(int idAudienciaCliente, String motivoAgendamento, int audiencia_idAudiencia, String cliente_cpf) throws Exception {
        int ret = 0;
        try {
            String sql = "INSERT INTO AudienciaCliente (idAudienciaCliente, motivoAgendamento, audiencia_idAudiencia, cliente_cpf) VALUES (?, ?, ?,?)";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            
            st.setInt(1, idAudienciaCliente);
            st.setString(2, motivoAgendamento);
            st.setInt(3, audiencia_idAudiencia);
            st.setString(4, cliente_cpf);            
 
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    
    public static int altera1(String motivoAgendamento, String cliente_cpf, int idAudienciaClienten, int idAudienciaCliente) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE audienciaCliente SET motivoAgendamento = ?, cliente_cpf = ?, idAudienciaCliente = ? WHERE idAudienciaCliente = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            
            st.setString(1, motivoAgendamento);
            st.setString(2, cliente_cpf); 
            st.setInt(3, idAudienciaClienten);
            st.setInt(4, idAudienciaCliente);
            ret = st.executeUpdate();
            
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }    
    
    public static int altera2(String motivoAgendamento, int audiencia_idAudiencia, String cliente_cpf, int idAudienciaClienten, int idAudienciaCliente) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE audienciaCliente SET motivoAgendamento = ?, audiencia_idAudiencia = ?, cliente_cpf = ?, idAUdienciaCliente = ? WHERE idAudienciaCliente = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            
            st.setString(1, motivoAgendamento);
            st.setInt(2, audiencia_idAudiencia);
            st.setString(3, cliente_cpf); 
            st.setInt(4, idAudienciaClienten);
            st.setInt(5, idAudienciaCliente);
            ret = st.executeUpdate();
            
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int exclui1(int idAudienciaCliente) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM audienciaCliente WHERE idAudienciaCliente = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idAudienciaCliente);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    
    public static int exclui2(int idAudienciaCliente, String cliente_cpf) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM audienciaCliente WHERE idAudienciaCliente = ? AND cliente_cpf = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idAudienciaCliente);
            st.setString(2, cliente_cpf);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

}
