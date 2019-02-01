package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.AudienciaJuiz;

public class AudienciaJuizDAO {

    private static Connection connection;
    private static PreparedStatement st;
    private static ResultSet rs;

    
    public static List<AudienciaJuiz> leTodos1() throws Exception {
        List<AudienciaJuiz> listAudienciaJuizs = new ArrayList<AudienciaJuiz>();
        try {
            String sql = "SELECT * FROM AudienciaJuiz";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                AudienciaJuiz audj = new AudienciaJuiz();
                
                audj.setIdAudienciaJuiz(rs.getInt("idAudienciaJuiz"));
                audj.setAudiencia(AudienciaDAO.leUm1(rs.getInt("audiencia_idAudiencia")));
                audj.setJuiz(JuizDAO.leUm1(rs.getInt("juiz_id")));
                
                listAudienciaJuizs.add(audj);
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listAudienciaJuizs;
    }

//SELECT * FROM produto p INNER JOIN " +
//"juridicaproduto jp ON p.codBarra = jp.produto_codBarra " +
//"WHERE jp.juridica_cnpj = ?
    
    public static List<AudienciaJuiz> leTodos2(int juiz_id) throws Exception {
        List<AudienciaJuiz> listAudienciaJuizs = new ArrayList<AudienciaJuiz>();
        try {
            String sql =    "SELECT * FROM  Audiencia a INNER JOIN "+
                            "Audienciajuiz aj ON aj.idAudienciaJuiz = aj.idAudienciaJuiz "+
                            "WHERE juiz_id = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, juiz_id);
            rs = st.executeQuery();
            while (rs.next()) {
                AudienciaJuiz audj = new AudienciaJuiz();
                
                audj.setIdAudienciaJuiz(rs.getInt("idAudienciaJuiz"));
                audj.setAudiencia(AudienciaDAO.leUm1(rs.getInt("audiencia_idAudiencia")));
                audj.setJuiz(JuizDAO.leUm1(rs.getInt("juiz_id")));
                
                listAudienciaJuizs.add(audj);
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listAudienciaJuizs;
    }

    public static int grava(int Audiencia_idAudiencia, int Juiz_id, int idAudienciaJuiz) throws Exception {
        int ret = 0;
        try {
            String sql = "INSERT INTO AudienciaJuiz (Audiencia_idAudiencia, Juiz_id, idAudienciaJuiz) VALUES ( ?, ?, ?)";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setInt(1, Audiencia_idAudiencia);
            st.setInt(2, Juiz_id);
            st.setInt(3, idAudienciaJuiz);

            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    
    public static int altera1(int Audiencia_idAudiencia, int idAudienciaJuizn, int idAudienciaJuiz ) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE AudienciaJuiz SET Audiencia_idAudiencia = ?, idAudienciaJuiz = ? WHERE idAudienciaJuiz = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setInt(1, Audiencia_idAudiencia); //1 ou 2
            st.setInt(2, idAudienciaJuizn);
            st.setInt(3, idAudienciaJuiz);
            ret = st.executeUpdate();

            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    
    public static int altera2(int Audiencia_idAudiencia, int Juiz_id, int idAudienciaJuizn, int idAudienciaJuiz) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE AudienciaJuiz SET Audiencia_idAudiencia = ?, Juiz_id  = ?, idAudienciaJuiz = ? WHERE idAudienciaJuiz = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setInt(1, Audiencia_idAudiencia); //1 ou 2
            st.setInt(2, Juiz_id); //1 ou 2
            st.setInt(3, idAudienciaJuizn);
            st.setInt(4, idAudienciaJuiz);
            ret = st.executeUpdate();

            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int exclui1(int idAudienciaJuiz) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM AudienciaJuiz WHERE idAudienciaJuiz = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idAudienciaJuiz);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    
    public static int exclui2(int idAudienciaJuiz, int Juiz_id) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM AudienciaJuiz WHERE idAudienciaJuiz = ? AND Juiz_id = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idAudienciaJuiz);
            st.setInt(2, Juiz_id);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

}
