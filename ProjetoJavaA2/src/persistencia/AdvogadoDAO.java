package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Advogado;

public class AdvogadoDAO {

    private static Connection connection;
    private static PreparedStatement st;
    private static ResultSet rs;

    public static List<Advogado> leTodos() throws Exception {
        List<Advogado> listAdvogados = new ArrayList<Advogado>();
        try {
            String sql = "SELECT * FROM Advogado";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                Advogado adv = new Advogado();
                
                adv.setId(rs.getInt("id"));
                adv.setNome(rs.getString("nome"));
                adv.setSexo(rs.getString("sexo"));
                adv.setEmail(rs.getString("email"));
                adv.setOab(rs.getInt("oab"));
                adv.setEndereco(EnderecoDAO.leUm1(rs.getInt("Endereco_idEndereco")));            
                
                listAdvogados.add(adv);
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listAdvogados;
    }
    
    

    public static Advogado leUm1(int id) throws Exception {
        Advogado Adv = new Advogado();
        try {
            String sql = "SELECT * FROM Advogado WHERE id = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                Adv.setId(rs.getInt("id"));
                Adv.setNome(rs.getString("nome"));
                Adv.setSexo(rs.getString("sexo"));
                Adv.setEmail(rs.getString("email"));
                Adv.setOab(rs.getInt("oab"));
                Adv.setEndereco(EnderecoDAO.leUm1(rs.getInt("Endereco_idEndereco")));
            }
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return Adv;
    }
    
    public static Advogado leUm2(int oab) throws Exception {
        Advogado Adv = new Advogado();
        try {
            String sql = "SELECT * FROM Advogado WHERE oab = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            
            st.setInt(1, oab);
            rs = st.executeQuery();
            if (rs.next()) {
                Adv.setId(rs.getInt("id"));
                Adv.setNome(rs.getString("nome"));
                Adv.setSexo(rs.getString("sexo"));
                Adv.setEmail(rs.getString("email"));
                Adv.setOab(rs.getInt("oab"));
                Adv.setEndereco(EnderecoDAO.leUm1(rs.getInt("Endereco_idEndereco")));
            }
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return Adv;
    }
    
    public static Advogado leUm3(int id, int oab) throws Exception {
        Advogado Adv = new Advogado();
        try {
            String sql = "SELECT * FROM Advogado WHERE id = ? AND oab = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, id);
            st.setInt(2, oab);
            rs = st.executeQuery();
            if (rs.next()) {
                Adv.setId(rs.getInt("id"));
                Adv.setNome(rs.getString("nome"));
                Adv.setSexo(rs.getString("sexo"));
                Adv.setEmail(rs.getString("email"));
                Adv.setOab(rs.getInt("oab"));
                Adv.setEndereco(EnderecoDAO.leUm1(rs.getInt("Endereco_idEndereco")));
            }
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return Adv;
    }
    
    public static Advogado leUm4(int id, int oab) throws Exception {
        Advogado Adv = new Advogado();
        try {
            String sql = "SELECT * FROM Advogado WHERE id = ? OR oab = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, id);
            st.setInt(2, oab);
            rs = st.executeQuery();
            if (rs.next()) {
                Adv.setId(rs.getInt("id"));
                Adv.setNome(rs.getString("nome"));
                Adv.setSexo(rs.getString("sexo"));
                Adv.setEmail(rs.getString("email"));
                Adv.setOab(rs.getInt("oab"));
                Adv.setEndereco(EnderecoDAO.leUm1(rs.getInt("Endereco_idEndereco")));
            }
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return Adv;
    }
  
    public static int grava(int id, String nome, String sexo, int oab, String email, int idEndereco) throws Exception {
        int ret = 0;
        try {
            String sql = "INSERT INTO Advogado (id,nome, sexo, oab, email, Endereco_idEndereco) VALUES (?, ?, ?, ?, ?, ?)";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, id);
            st.setString(2, nome);
            st.setString(3, sexo);
            st.setInt(4, oab);
            st.setString(5, email);
            st.setInt(6, idEndereco);
            
 
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int altera1(String nome, String sexo, int oab, String email, int idn, int id) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE advogado SET nome = ?, sexo = ?, oab = ?, email = ?, id = ? WHERE id = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, nome);
            st.setString(2, sexo);
            st.setInt(3, oab);
            st.setString(4, email);
            st.setInt(5, idn);
            st.setInt(6, id);
            ret = st.executeUpdate();
            
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

        public static int altera2(String nome, String sexo, int oabn, String email, int id, int oab) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE advogado SET nome = ?, sexo = ?, oab = ?, email = ?, id = ? WHERE oab = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, nome);
            st.setString(2, sexo);
            st.setInt(3, oabn);
            st.setString(4, email);
            st.setInt(5, id);
            st.setInt(6, oab);
            ret = st.executeUpdate();
            
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
        
        public static int altera3(String nome, String sexo, int oabn, String email, int idn, int oab, int id) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE advogado SET nome = ?, sexo = ?, oab = ?, email = ?, id = ? WHERE oab = ? AND id = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, nome);
            st.setString(2, sexo);
            st.setInt(3, oabn);
            st.setString(4, email);
            st.setInt(5, idn);
            st.setInt(6, oab);
            st.setInt(7, id);
            ret = st.executeUpdate();
            
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
        
        public static int altera4(String nome, String sexo, int oabn, String email, int idn, int oab, int id) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE advogado SET nome = ?, sexo = ?, oab = ?, email = ?, id = ? WHERE oab = ? OR id = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, nome);
            st.setString(2, sexo);
            st.setInt(3, oabn);
            st.setString(4, email);
            st.setInt(5, idn);
            st.setInt(6, oab);
            st.setInt(7, id);
            ret = st.executeUpdate();
            
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    
    public static int exclui1(int id) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM Advogado WHERE id = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    
    public static int exclui2(int oab) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM Advogado WHERE oab = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, oab);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    
    public static int exclui3(int id, int oab) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM Advogado WHERE id = ? AND oab = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, id);
            st.setInt(1, oab);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    
    public static int exclui4(int id, int oab) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM Advogado WHERE id = ? OR oab = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, id);
            st.setInt(1, oab);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    

}
