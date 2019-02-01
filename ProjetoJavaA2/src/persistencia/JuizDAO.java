package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Juiz;

public class JuizDAO {

    private static Connection connection;
    private static PreparedStatement st;
    private static ResultSet rs;

    public static List<Juiz> leTodos() throws Exception {
        List<Juiz> listJuiz = new ArrayList<Juiz>();
        try {
            String sql = "SELECT * FROM Juiz";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {

                Juiz juiz = new Juiz();

                juiz.setNome(rs.getString("nome"));
                juiz.setId(rs.getInt("id"));

                listJuiz.add(juiz);
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listJuiz;
    }

    public static Juiz leUm1(int idJuiz) throws Exception {
        Juiz juiz = new Juiz();
        try {
            String sql = "SELECT * FROM Juiz WHERE id = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idJuiz);
            rs = st.executeQuery();
            if (rs.next()) {

                juiz.setNome(rs.getString("nome"));
                juiz.setId(rs.getInt("id"));
            }
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return juiz;
    }
    
    public static Juiz leUm2(String nome) throws Exception {
        Juiz juiz = new Juiz();
        try {
            String sql = "SELECT * FROM Juiz WHERE nome = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, nome);
            rs = st.executeQuery();
            if (rs.next()) {

                juiz.setNome(rs.getString("nome"));
                juiz.setId(rs.getInt("id"));
            }
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return juiz;
    }
    
    public static Juiz leUm3(int idJuiz, String nome) throws Exception {
        Juiz juiz = new Juiz();
        try {
            String sql = "SELECT * FROM Juiz WHERE id = ? AND nome = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idJuiz);
            st.setString(2, nome);
            rs = st.executeQuery();
            if (rs.next()) {

                juiz.setNome(rs.getString("nome"));
                juiz.setId(rs.getInt("id"));
            }
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return juiz;
    }
    
    public static Juiz leUm4(int idJuiz, String nome) throws Exception {
        Juiz juiz = new Juiz();
        try {
            String sql = "SELECT * FROM Juiz WHERE id = ? OR nome = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idJuiz);
            st.setString(2, nome);
            rs = st.executeQuery();
            if (rs.next()) {

                juiz.setNome(rs.getString("nome"));
                juiz.setId(rs.getInt("id"));
            }
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return juiz;
    }

    public static int grava(String nome, int id) throws Exception {
        int ret = 0;
        try {
            String sql = "INSERT INTO Juiz (nome, id) VALUES (?, ?)";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setString(1, nome);
            st.setInt(2, id);

            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int altera1(String nome, int id, int idn) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE Juiz SET nome = ?, id = ? WHERE id = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, nome);
            st.setInt(2, id);
            st.setInt(3, idn);

            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int altera2(String nome, int id, String nomen) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE Juiz SET nome = ?, id = ? WHERE nome = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, nome);
            st.setInt(2, id);
            st.setString(3, nomen);

            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int altera3(String nome, int id, String nomen, int idn) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE Juiz SET nome = ?, id = ? WHERE id = ? AND nome = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, nome);
            st.setInt(2, id);
            st.setInt(3, idn);
            st.setString(4, nomen);

            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    
    public static int altera4(String nome, int id, String nomen, int idn) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE Juiz SET nome = ?, id = ? WHERE id = ? OR nome = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, nome);
            st.setInt(2, id);
            st.setInt(3, idn);
            st.setString(4, nomen);

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
            String sql = "DELETE FROM Juiz WHERE id = ?";
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

    public static int exclui2(String nome) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM Juiz WHERE nome = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, nome);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int exclui3(int id, String nome) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM Juiz WHERE id = ? AND nome = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, id);
            st.setString(2, nome);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int exclui4(int id, String nome) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM Juiz WHERE id = ? OR nome = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, id);
            st.setString(2, nome);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
 
}
