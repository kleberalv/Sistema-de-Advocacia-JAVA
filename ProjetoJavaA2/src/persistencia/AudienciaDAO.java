package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Audiencia;

public class AudienciaDAO {

    private static Connection connection;
    private static PreparedStatement st;
    private static ResultSet rs;

    public static List<Audiencia> leTodos() throws Exception {
        List<Audiencia> listAudiencia = new ArrayList<Audiencia>();
        try {
            String sql = "SELECT * FROM Audiencia";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                Audiencia aud = new Audiencia();
                
                aud.setIdAudiencia(rs.getInt("idAudiencia"));
                aud.setDataAudiencia(rs.getString("dataAudiencia"));               
                
                listAudiencia.add(aud);
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listAudiencia;
    }

    public static Audiencia leUm1(int idAudiencia) throws Exception {
        Audiencia Aud = new Audiencia();
        try {
            String sql = "SELECT * FROM Audiencia WHERE idAudiencia = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idAudiencia);
            rs = st.executeQuery();
            if (rs.next()) {
                Aud.setDataAudiencia(rs.getString("dataAudiencia"));
                Aud.setIdAudiencia(rs.getInt("idAudiencia"));
            }
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return Aud;
    }
    
    public static Audiencia leUm2(String dataAudiencia) throws Exception {
        Audiencia Aud = new Audiencia();
        try {
            String sql = "SELECT * FROM Audiencia WHERE dataAudiencia = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, dataAudiencia);
            rs = st.executeQuery();
            if (rs.next()) {
                Aud.setDataAudiencia(rs.getString("dataAudiencia"));
                Aud.setIdAudiencia(rs.getInt("idAudiencia"));
            }
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return Aud;
    }

        public static Audiencia leUm3(int idAudiencia, String dataAudiencia) throws Exception {
        Audiencia Aud = new Audiencia();
        try {
            String sql = "SELECT * FROM Audiencia WHERE idAudiencia = ? AND dataAudiencia = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idAudiencia);
            st.setString(2, dataAudiencia);
            rs = st.executeQuery();
            if (rs.next()) {
                Aud.setDataAudiencia(rs.getString("dataAudiencia"));
                Aud.setIdAudiencia(rs.getInt("idAudiencia"));
            }
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return Aud;
    }
        
    public static Audiencia leUm4(int idAudiencia, String dataAudiencia) throws Exception {
        Audiencia Aud = new Audiencia();
        try {
            String sql = "SELECT * FROM Audiencia WHERE idAudiencia = ? OR dataAudiencia = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idAudiencia);
            st.setString(2, dataAudiencia);
            rs = st.executeQuery();
            if (rs.next()) {
                Aud.setDataAudiencia(rs.getString("dataAudiencia"));
                Aud.setIdAudiencia(rs.getInt("idAudiencia"));
            }
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return Aud;
    }

    public static int grava(String dataAudiencia, int idAudiencia) throws Exception {
        int ret = 0;
        try {
            String sql = "INSERT INTO Audiencia (dataAudiencia, idAudiencia) VALUES (?, ?)";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, dataAudiencia);
            st.setInt(2, idAudiencia);
 
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int altera1(String dataAudiencia, int idAudiencian, int idAudiencia) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE audiencia SET dataAudiencia = ?, idAudiencia = ? WHERE idAudiencia = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, dataAudiencia);
            st.setInt(2, idAudiencian);
            st.setInt(3, idAudiencia);
            ret = st.executeUpdate();
            
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    public static int altera2(String dataAudiencia, int idAudiencia, String dataAudiencian) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE audiencia SET dataAudiencia = ?, idAudiencia = ? WHERE dataAudiencia = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, dataAudiencian);
            st.setInt(2, idAudiencia);
            st.setString(3, dataAudiencia);
            ret = st.executeUpdate();
            
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    public static int altera3(int idAudiencian, String dataAudiencian, int idAudiencia, String dataAudiencia) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE audiencia SET idAudiencia = ?, dataAudiencia = ? WHERE idAudiencia = ? AND dataAudiencia = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idAudiencian);
            st.setString(2, dataAudiencian);
            st.setInt(3, idAudiencia);
            st.setString(4, dataAudiencia);
            ret = st.executeUpdate();
            
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    
    public static int altera4(int idAudiencian, String dataAudiencian, int idAudiencia, String dataAudiencia) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE audiencia SET idAudiencia = ?, dataAudiencia = ? WHERE idAudiencia = ? OR dataAudiencia = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idAudiencian);
            st.setString(2, dataAudiencian);
            st.setInt(3, idAudiencia);
            st.setString(4, dataAudiencia);
            ret = st.executeUpdate();
            
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int exclui1(int idAudiencia) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM audiencia WHERE idAudiencia = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idAudiencia);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int exclui2(String dataAudiencia) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM audiencia WHERE dataAudiencia = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, dataAudiencia);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int exclui3(int idAudiencia, String dataAudiencia) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM audiencia WHERE idAudiencia = ? AND dataAudiencia = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idAudiencia);
            st.setString(2, dataAudiencia);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    
    public static int exclui4(int idAudiencia, String dataAudiencia) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM audiencia WHERE idAudiencia = ? OR dataAudiencia = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idAudiencia);
            st.setString(2, dataAudiencia);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }


}
