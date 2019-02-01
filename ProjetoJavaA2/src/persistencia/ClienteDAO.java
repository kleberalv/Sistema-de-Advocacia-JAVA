package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;

public class ClienteDAO {

    private static Connection connection;
    private static PreparedStatement st;
    private static ResultSet rs;

    public static List<Cliente> leTodos() throws Exception {
        List<Cliente> listClientes = new ArrayList<Cliente>();
        try {
            String sql = "SELECT * FROM Cliente";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                
                Cliente cli = new Cliente();
                
                
                cli.setNome(rs.getString("nome"));
                cli.setCpf(rs.getString("cpf"));
                cli.setIdade(rs.getInt("idade"));
                cli.setSexo(rs.getString("sexo"));
                cli.setAdvogado(AdvogadoDAO.leUm1(rs.getInt("Advogado_id")));
                cli.setEndereco(EnderecoDAO.leUm1(rs.getInt("Endereco_idEndereco")));
                       
                
                listClientes.add(cli);
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listClientes;
    }

    public static Cliente leUm1(String cpf) throws Exception {
        
        Cliente cli = new Cliente();
        
        try {
            String sql = "SELECT * FROM Cliente WHERE cpf = ? ";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, cpf);
            rs = st.executeQuery();
            if (rs.next()) {
                
                cli.setNome(rs.getString("nome"));
                cli.setCpf(rs.getString("cpf"));
                cli.setIdade(rs.getInt("idade"));
                cli.setSexo(rs.getString("sexo"));
                cli.setAdvogado(AdvogadoDAO.leUm1(rs.getInt("advogado_id")));
                cli.setEndereco(EnderecoDAO.leUm1(rs.getInt("Endereco_idEndereco")));
                
            }
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return cli;
    }
    
    public static Cliente leUm2(String nome) throws Exception {
        
        Cliente cli = new Cliente();
        
        try {
            String sql = "SELECT * FROM Cliente WHERE nome = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, nome);
            rs = st.executeQuery();
            if (rs.next()) {
                
                cli.setNome(rs.getString("nome"));
                cli.setCpf(rs.getString("cpf"));
                cli.setIdade(rs.getInt("idade"));
                cli.setSexo(rs.getString("sexo"));
                cli.setAdvogado(AdvogadoDAO.leUm1(rs.getInt("advogado_id")));
                cli.setEndereco(EnderecoDAO.leUm1(rs.getInt("Endereco_idEndereco")));
                
            }
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return cli;
    }
    
    public static Cliente leUm3(String cpf, String nome) throws Exception {
        
        Cliente cli = new Cliente();
        
        try {
            String sql = "SELECT * FROM Cliente WHERE cpf = ? AND nome = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, cpf);
            st.setString(2, nome);
            rs = st.executeQuery();
            if (rs.next()) {
                
                cli.setNome(rs.getString("nome"));
                cli.setCpf(rs.getString("cpf"));
                cli.setIdade(rs.getInt("idade"));
                cli.setSexo(rs.getString("sexo"));
                cli.setAdvogado(AdvogadoDAO.leUm1(rs.getInt("advogado_id")));
                cli.setEndereco(EnderecoDAO.leUm1(rs.getInt("Endereco_idEndereco")));
                
            }
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return cli;
    }
    
    public static Cliente leUm4(String cpf, String nome) throws Exception {
        
        Cliente cli = new Cliente();
        
        try {
            String sql = "SELECT * FROM Cliente WHERE cpf = ? OR nome = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, cpf);
            st.setString(2, nome);
            rs = st.executeQuery();
            if (rs.next()) {
                
                cli.setNome(rs.getString("nome"));
                cli.setCpf(rs.getString("cpf"));
                cli.setIdade(rs.getInt("idade"));
                cli.setSexo(rs.getString("sexo"));
                cli.setAdvogado(AdvogadoDAO.leUm1(rs.getInt("advogado_id")));
                cli.setEndereco(EnderecoDAO.leUm1(rs.getInt("Endereco_idEndereco")));
                
            }
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return cli;
    }

    public static int grava(String nome, String cpf, int idade, String sexo, int advogado_id, int idEndereco) throws Exception {
        int ret = 0;
        try {
            String sql = "INSERT INTO Cliente (nome, cpf, idade, sexo, advogado_id, Endereco_idEndereco) VALUES (?, ?, ?, ?, ?, ?)";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, nome);
            st.setString(2, cpf);
            st.setInt(3, idade);
            st.setString(4, sexo);
            st.setInt(5, advogado_id);
            st.setInt(6, idEndereco);
            
 
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int altera1(String nome, int idade, String sexo, String cpfn, int advogado_id, int idEndereco, String cpf) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE Cliente SET nome = ?, idade = ?, sexo = ?, cpf = ?, advogado_id = ?, Endereco_idEndereco = ? WHERE cpf = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, nome);
            st.setInt(2, idade);
            st.setString(3, sexo);
            st.setString(4, cpfn);
            st.setInt(5, advogado_id);
            st.setInt(6, idEndereco);
            st.setString(7, cpf);
            
            ret = st.executeUpdate();
          
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    
    public static int altera2(String nomen, int idade, String sexo, String cpfn, int advogado_id, int idEndereco, String nome) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE Cliente SET nome = ?, idade = ?, sexo = ?, cpf = ?, advogado_id = ?, Endereco_idEndereco = ? WHERE nome = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, nomen);
            st.setInt(2, idade);
            st.setString(3, sexo);
            st.setString(4, cpfn);
            st.setInt(5, advogado_id);
            st.setInt(6, idEndereco);
            st.setString(7, nome);
            
            ret = st.executeUpdate();
          
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    
    public static int altera3(String nomen, int idade, String sexo, String cpfn, int advogado_id, int idEndereco, String cpf, String nome) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE Cliente SET nome = ?, idade = ?, sexo = ?, cpf = ?, advogado_id = ?, Endereco_idEndereco = ? WHERE cpf = ? AND nome = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, nomen);
            st.setInt(2, idade);
            st.setString(3, sexo);
            st.setString(4, cpfn);
            st.setInt(5, advogado_id);
            st.setInt(6, idEndereco);
            st.setString(7, cpf);
            st.setString(8, nome);
            
            ret = st.executeUpdate();
          
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    
    public static int altera4(String nomen, int idade, String sexo, String cpfn, int advogado_id, int idEndereco, String cpf, String nome) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE Cliente SET nome = ?, idade = ?, sexo = ?, cpf = ?, advogado_id = ?, Endereco_idEndereco = ? WHERE cpf = ? OR nome = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, nomen);
            st.setInt(2, idade);
            st.setString(3, sexo);
            st.setString(4, cpfn);
            st.setInt(5, advogado_id);
            st.setInt(6, idEndereco);
            st.setString(7, cpf);
            st.setString(8, nome);
            
            ret = st.executeUpdate();
          
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    
    public static int exclui1(String cpf) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM Cliente WHERE cpf = ?";
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
    
    public static int exclui2(String nome) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM Cliente WHERE nome = ?";
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
    
    public static int exclui3(String cpf, String nome) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM Cliente WHERE cpf = ? AND nome = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, cpf);
            st.setString(2, nome);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    
    public static int exclui4(String cpf, String nome) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM Cliente WHERE cpf = ? OR nome = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, cpf);
            st.setString(2, nome);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

}
