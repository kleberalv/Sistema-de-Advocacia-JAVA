package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Gerente;
import modelo.Endereco;

public class GerenteDAO {

    private static Connection connection;
    private static PreparedStatement st;
    private static ResultSet rs;

    public static List<Gerente> leTodos() throws Exception {
        List<Gerente> listGerentes = new ArrayList<Gerente>();
        try {
            String sql = "SELECT * FROM Gerente";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                Gerente ger = new Gerente();
                
                ger.setId(rs.getInt("id"));
                ger.setEmail(rs.getString("email"));
                ger.setNome(rs.getString("nome"));
                ger.setCpf(rs.getString("cpf"));
                ger.setSexo(rs.getString("sexo"));
                ger.setEndereco(EnderecoDAO.leUm1(rs.getInt("Endereco_idEndereco")));            
                
                listGerentes.add(ger);
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listGerentes;
    }

    public static Gerente leUm1(int id) throws Exception {
        Gerente ger = new Gerente();
        Endereco end = new Endereco();
        try {
            String sql = "SELECT * FROM Gerente WHERE id = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                ger.setId(rs.getInt("id"));
                ger.setEmail(rs.getString("email"));
                ger.setNome(rs.getString("nome"));
                ger.setCpf(rs.getString("cpf"));
                ger.setSexo(rs.getString("sexo"));
                ger.setEndereco(EnderecoDAO.leUm1(rs.getInt("Endereco_idEndereco"))); 
            }
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ger;
    }
    
    public static Gerente leUm2(int id) throws Exception {
        Gerente ger = new Gerente();

        try {
            String sql = "SELECT * FROM Gerente WHERE cpf = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                ger.setId(rs.getInt("id"));
                ger.setEmail(rs.getString("email"));
                ger.setNome(rs.getString("nome"));
                ger.setCpf(rs.getString("cpf"));
                ger.setSexo(rs.getString("sexo"));
                ger.setEndereco(EnderecoDAO.leUm1(rs.getInt("Endereco_idEndereco"))); 
            }
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ger;
    }
    
    public static Gerente leUm3(int id) throws Exception {
        Gerente ger = new Gerente();
        
        try {
            String sql = "SELECT * FROM Gerente WHERE id = ? AND cpf = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                ger.setId(rs.getInt("id"));
                ger.setEmail(rs.getString("email"));
                ger.setNome(rs.getString("nome"));
                ger.setCpf(rs.getString("cpf"));
                ger.setSexo(rs.getString("sexo"));
                ger.setEndereco(EnderecoDAO.leUm1(rs.getInt("Endereco_idEndereco"))); 
            }
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ger;
    }
    
    public static Gerente leUm4(int id) throws Exception {
        Gerente ger = new Gerente();

        try {
            String sql = "SELECT * FROM Gerente WHERE id = ? OR cpf = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                ger.setId(rs.getInt("id"));
                ger.setEmail(rs.getString("email"));
                ger.setNome(rs.getString("nome"));
                ger.setCpf(rs.getString("cpf"));
                ger.setSexo(rs.getString("sexo"));
                ger.setEndereco(EnderecoDAO.leUm1(rs.getInt("Endereco_idEndereco"))); 
            }
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ger;
    }

    public static int grava(int id, String email, String nome, String cpf, String sexo, int idEndereco) throws Exception {
        int ret = 0;
        try {
            String sql = "INSERT INTO Gerente (id,email, nome, cpf, sexo, Endereco_idEndereco) VALUES (?, ?, ?, ?, ?, ?)";
            connection = GerenteDeConexao.getConnection();
           st = connection.prepareStatement(sql);
            st.setInt(1, id);
            st.setString(2, email);
            st.setString(3, nome);
            st.setString(4, cpf);
            st.setString(5, sexo);
            st.setInt(6, idEndereco);

            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int altera1(int id, String nome, String sexo, String cpf, String email) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE Gerente SET nome = ?, sexo = ?, cpf = ?, email = ? WHERE id = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            
            st.setString(1, nome);
            st.setString(2, sexo);
            st.setString(3, cpf);
            st.setString(4, email);
            st.setInt(5, id);
            ret = st.executeUpdate();

            
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    
    public static int altera2(String nome, String sexo, int id, String email, String cpfn, String cpf) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE Gerente SET nome = ?, sexo = ?, id = ?, email = ?, cpf = ? WHERE cpf = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            
            st.setString(1, nome);
            st.setString(2, sexo);
            st.setInt(3, id);
            st.setString(4, email);
            st.setString(5, cpfn);
            st.setString(6, cpf);
            ret = st.executeUpdate();

            
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    
    public static int altera3(String nome, String sexo, int idn, String email, String cpfn,int id, String cpf) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE Gerente SET nome = ?, sexo = ?, id = ?, email = ?, cpf = ? WHERE id = ? AND cpf = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            
            st.setString(1, nome);
            st.setString(2, sexo);
            st.setInt(3, idn);
            st.setString(4, email);
            st.setString(5, cpfn);
            st.setInt(6, id);
            st.setString(7, cpf);
            ret = st.executeUpdate();

            
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    
    public static int altera4(String nome, String sexo, int idn, String email, String cpfn,int id, String cpf) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE Gerente SET nome = ?, sexo = ?, id = ?, email = ?, cpf = ? WHERE id = ? OR cpf = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            
            st.setString(1, nome);
            st.setString(2, sexo);
            st.setInt(3, idn);
            st.setString(4, email);
            st.setString(5, cpfn);
            st.setInt(6, id);
            st.setString(7, cpf);
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
            String sql = "DELETE FROM Gerente WHERE id = ?";
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

    public static int exclui2(String cpf) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM Gerente WHERE cpf = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, cpf);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int exclui3(int id, String cpf) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM Gerente WHERE id = ? AND cpf = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, id);
            st.setString(2, cpf);            
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }    

    public static int exclui4(int id, String cpf) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM Gerente WHERE id = ? OR cpf = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, id);
            st.setString(2, cpf);            
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }    
}
