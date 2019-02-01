package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Endereco;

public class EnderecoDAO {

    private static Connection connection;
    private static PreparedStatement st;
    private static ResultSet rs;

    public static List<Endereco> leTodos() throws Exception {
        List<Endereco> listEndereco = new ArrayList<Endereco>();
        try {
            String sql = "SELECT * FROM Endereco";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                
                Endereco end = new Endereco();
                
                end.setRua(rs.getString("rua"));
                end.setNumero(rs.getInt("numero"));
                end.setIdEndereco(rs.getInt("idEndereco"));       
                
                listEndereco.add(end);
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listEndereco;
    }

    public static Endereco leUm1(int idEndereco) throws Exception {
        Endereco end = new Endereco();
        try {
            String sql = "SELECT * FROM Endereco WHERE idEndereco = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idEndereco);
            rs = st.executeQuery();
            if (rs.next()) {
                
                end.setRua(rs.getString("rua"));
                end.setNumero(rs.getInt("numero"));
                end.setIdEndereco(rs.getInt("idEndereco"));
            }
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return end;
    }
    
    public static Endereco leUm2(String rua) throws Exception {
        Endereco end = new Endereco();
        try {
            String sql = "SELECT * FROM Endereco WHERE rua = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, rua);
            rs = st.executeQuery();
            if (rs.next()) {
                
                end.setRua(rs.getString("rua"));
                end.setNumero(rs.getInt("numero"));
                end.setIdEndereco(rs.getInt("idEndereco"));
            }
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return end;
    }
    
    public static Endereco leUm3(int idEndereco, String rua) throws Exception {
        Endereco end = new Endereco();
        try {
            String sql = "SELECT * FROM Endereco WHERE idEndereco = ? AND rua = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idEndereco);
            st.setString(2, rua);
            rs = st.executeQuery();
            if (rs.next()) {
                
                end.setRua(rs.getString("rua"));
                end.setNumero(rs.getInt("numero"));
                end.setIdEndereco(rs.getInt("idEndereco"));
            }
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return end;
    }
    
    public static Endereco leUm4(int idEndereco, String rua) throws Exception {
        Endereco end = new Endereco();
        try {
            String sql = "SELECT * FROM Endereco WHERE idEndereco = ? OR rua = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idEndereco);
            st.setString(2, rua);
            rs = st.executeQuery();
            if (rs.next()) {
                
                end.setRua(rs.getString("rua"));
                end.setNumero(rs.getInt("numero"));
                end.setIdEndereco(rs.getInt("idEndereco"));
            }
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return end;
    }

    public static int grava(String rua, int numero, int idEndereco) throws Exception {
        int ret = 0;
        try {
            String sql = "INSERT INTO Endereco (rua, numero, idEndereco) VALUES (?, ?, ?)";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            
            st.setString(1, rua);
            st.setInt(2, numero);
            st.setInt(3, idEndereco);
 
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int altera1(String rua, int numero, int idEnderecon, int idEndereco) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE Endereco SET rua = ?, numero = ? , idEndereco = ? WHERE idEndereco = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, rua);
            st.setInt(2, numero);
            st.setInt(3, idEnderecon);
            st.setInt(4, idEndereco);
            ret = st.executeUpdate();           
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    
    public static int altera2(String ruan, int numero, int idEndereco, String rua) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE Endereco SET rua = ?, numero = ?, idEndereco = ? WHERE rua = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, ruan);
            st.setInt(2, numero);
            st.setInt(3, idEndereco);
            st.setString(4, rua);
            ret = st.executeUpdate();           
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    
    public static int altera3(String ruan, int numero, int idEnderecon, int idEndereco, String rua) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE Endereco SET rua = ?, numero = ? , idEndereco = ? WHERE idEndereco = ? AND rua = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, ruan);
            st.setInt(2, numero);
            st.setInt(3, idEnderecon);
            st.setInt(4, idEndereco);
            st.setString(5, rua);
            ret = st.executeUpdate();           
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    
    public static int altera4(String ruan, int numero, int idEnderecon, int idEndereco, String rua) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE Endereco SET rua = ?, numero = ? , idEndereco = ? WHERE idEndereco = ? OR rua = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, ruan);
            st.setInt(2, numero);
            st.setInt(3, idEnderecon);
            st.setInt(4, idEndereco);
            st.setString(5, rua);
            ret = st.executeUpdate();           
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int exclui1(int idEndereco) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM Endereco WHERE idEndereco = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idEndereco);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int exclui2(String rua) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM Endereco WHERE rua = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, rua);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int exclui3(int idEndereco, String rua) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM Endereco WHERE idEndereco = ? AND rua = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idEndereco);            
            st.setString(2, rua);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int exclui4(int idEndereco, String rua) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM Endereco WHERE idEndereco = ? OR rua = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idEndereco);            
            st.setString(2, rua);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

}
