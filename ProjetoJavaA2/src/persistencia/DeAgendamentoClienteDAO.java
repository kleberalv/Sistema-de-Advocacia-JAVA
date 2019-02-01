package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.DeAgendamentoCliente;

public class DeAgendamentoClienteDAO {

    private static Connection connection;
    private static PreparedStatement st;
    private static ResultSet rs;

    
    public static List<DeAgendamentoCliente> leTodos1() throws Exception {
        List<DeAgendamentoCliente> listDeAgendamentoClientes = new ArrayList<DeAgendamentoCliente>();
        try {
            String sql = "SELECT * FROM DeAgendamentoCliente";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                DeAgendamentoCliente deagc = new DeAgendamentoCliente();
                
                deagc.setCliente(ClienteDAO.leUm1(rs.getString("cliente_cpf")));
                deagc.setDeAgendamento(DeAgendamentoDAO.leUm1(rs.getInt("deAgendamento_idAgendamento")));
                deagc.setIdDeAgendamentoCliente(rs.getInt("idDeAgendamentoCliente"));


                listDeAgendamentoClientes.add(deagc);
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listDeAgendamentoClientes;
    }
    
//SELECT * FROM produto p INNER JOIN " +
//"juridicaproduto jp ON p.codBarra = jp.produto_codBarra " +
//"WHERE jp.juridica_cnpj = ?      
    public static List<DeAgendamentoCliente> leTodos2(String cliente_cpf) throws Exception {
        List<DeAgendamentoCliente> listDeAgendamentoClientes = new ArrayList<DeAgendamentoCliente>();
        try {
            String sql =    "SELECT * FROM  DeAgendamento da INNER JOIN "+
                            "DeAgendamentoCLiente dac ON dac.idDeAgendamentoCliente = dac.idDeAgendamentoCliente "+
                            "WHERE cliente_cpf = ?";
            
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, cliente_cpf);  
            rs = st.executeQuery();
            while (rs.next()) {
                DeAgendamentoCliente deagc = new DeAgendamentoCliente();
                
                deagc.setCliente(ClienteDAO.leUm1(rs.getString("cliente_cpf")));
                deagc.setDeAgendamento(DeAgendamentoDAO.leUm1(rs.getInt("deAgendamento_idAgendamento")));
                deagc.setIdDeAgendamentoCliente(rs.getInt("idDeAgendamentoCliente"));


                listDeAgendamentoClientes.add(deagc);
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listDeAgendamentoClientes;
    }

    public static int grava(String cliente_cpf, int deAgendamento_idAgendamento, int idDeAgendamentoCliente) throws Exception {
        int ret = 0;
        try {
            String sql = "INSERT INTO DeAgendamentoCliente (cliente_cpf, deAgendamento_idAgendamento, idDeAgendamentoCliente) VALUES ( ?, ?, ?)";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setString(1, cliente_cpf);            
            st.setInt(2, deAgendamento_idAgendamento);
            st.setInt(3, idDeAgendamentoCliente);

            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int altera1(int deAgendamento_idAgendamento, int idDeAgendamentoCliente) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE DeAgendamentoCliente SET deAgendamento_idAgendamento = ? WHERE idDeAgendamentoCliente = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setInt(1, deAgendamento_idAgendamento);
            st.setInt(2, idDeAgendamentoCliente);
            ret = st.executeUpdate();

            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    
    public static int altera2(int deAgendamento_idAgendamento,String cliente_cpf, int idDeAgendamentoCliente) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE DeAgendamentoCliente SET deAgendamento_idAgendamento = ?, cliente_cpf = ? WHERE idDeAgendamentoCliente = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setInt(1, deAgendamento_idAgendamento);
            st.setString(2, cliente_cpf);
            st.setInt(3, idDeAgendamentoCliente);
            ret = st.executeUpdate();

            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int exclui1(int idDeAgendamentoCliente) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM DeAgendamentoCliente WHERE idDeAgendamentoCliente = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idDeAgendamentoCliente);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    
    public static int exclui2(int idDeAgendamentoCliente, String cliente_cpf) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM DeAgendamentoCliente WHERE idDeAgendamentoCliente = ? AND cliente_cpf = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idDeAgendamentoCliente);
            st.setString(2, cliente_cpf);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

}
