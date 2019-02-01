package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.DeFuncionario;

public class DeFuncionarioDAO {

    private static Connection connection;
    private static PreparedStatement st;
    private static ResultSet rs;

    
    public static List<DeFuncionario> leTodos() throws Exception {
        List<DeFuncionario> listDeFuncionarios = new ArrayList<DeFuncionario>();
        try {
            String sql = "SELECT * FROM DeFuncionario";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                DeFuncionario defu = new DeFuncionario();
               
                defu.setIdAgendamento(rs.getInt("idAgendamento"));
                defu.setMotivoAgendamento(rs.getString("motivoAgendamento"));
                defu.setDataAgendada(rs.getString("dataAgendada"));

                listDeFuncionarios.add(defu);
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listDeFuncionarios;
    }

    public static DeFuncionario leUm1(int idAgendamento) throws Exception {
        DeFuncionario defu = new DeFuncionario();
        
        try {
            String sql = "SELECT * FROM DeFuncionario WHERE idAgendamento = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idAgendamento);
            rs = st.executeQuery();
            if (rs.next()) {
                
                defu.setIdAgendamento(rs.getInt("idAgendamento"));
                defu.setMotivoAgendamento(rs.getString("motivoAgendamento"));
                defu.setDataAgendada(rs.getString("dataAgendada"));

            }
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return defu;
    }
    
    public static DeFuncionario leUm2(String dataAgendada) throws Exception {
        DeFuncionario defu = new DeFuncionario();
        
        try {
            String sql = "SELECT * FROM DeFuncionario WHERE dataAgendada = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, dataAgendada);
            rs = st.executeQuery();
            if (rs.next()) {
                
                defu.setIdAgendamento(rs.getInt("idAgendamento"));
                defu.setMotivoAgendamento(rs.getString("motivoAgendamento"));
                defu.setDataAgendada(rs.getString("dataAgendada"));
 
            }
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return defu;
    }
    
    public static DeFuncionario leUm3(int idAgendamento, String dataAgendada) throws Exception {
        DeFuncionario defu = new DeFuncionario();
        
        try {
            String sql = "SELECT * FROM DeFuncionario WHERE idAgendamento = ? AND dataAgendada = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idAgendamento);
            st.setString(2, dataAgendada);
            rs = st.executeQuery();
            if (rs.next()) {
                
                defu.setIdAgendamento(rs.getInt("idAgendamento"));
                defu.setMotivoAgendamento(rs.getString("motivoAgendamento"));
                defu.setDataAgendada(rs.getString("dataAgendada"));
                
            }
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return defu;
    }
    
    public static DeFuncionario leUm4(int idAgendamento, String dataAgendada) throws Exception {
        DeFuncionario defu = new DeFuncionario();
        
        try {
            String sql = "SELECT * FROM DeFuncionario WHERE idAgendamento = ? OR  dataAgendada = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idAgendamento);
            st.setString(2, dataAgendada);
            rs = st.executeQuery();
            if (rs.next()) {
                
                defu.setIdAgendamento(rs.getInt("idAgendamento"));
                defu.setMotivoAgendamento(rs.getString("motivoAgendamento"));
                defu.setDataAgendada(rs.getString("dataAgendada"));

            }
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return defu;
    }

    public static int grava(int idAgendamento, String motivoAgendamento, String dataAgendada) throws Exception {
        int ret = 0;
        try {
            String sql = "INSERT INTO DeFuncionario (idAgendamento, motivoAgendamento, dataAgendada) VALUES ( ?, ?, ?)";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setInt(1, idAgendamento);            
            st.setString(2, motivoAgendamento);
            st.setString(3, dataAgendada);

            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int altera1(String motivoAgendamento, String dataAgendada, int idAgendamento) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE DeFuncionario SET motivoAgendamento = ?, dataAgendada = ? WHERE idAgendamento = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setString(1, motivoAgendamento);
            st.setString(2, dataAgendada);
            st.setInt(3, idAgendamento);
            ret = st.executeUpdate();

            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    } 
    public static int altera2(String motivoAgendamento, String dataAgendadan, int idAgendamento, String dataAgendada) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE DeFuncionario SET motivoAgendamento = ?, dataAgendada = ?, idAgendamento = ? WHERE dataAgendada = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setString(1, motivoAgendamento);
            st.setString(2, dataAgendadan);
            st.setInt(3, idAgendamento);
            st.setString(4, dataAgendada);            
            ret = st.executeUpdate();

            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    
    public static int altera3(String motivoAgendamento, String dataAgendadan, int idAgendamenton, int idAgendamento, String dataAgendada) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE DeFuncionario SET motivoAgendamento = ?, dataAgendada = ?, idAgendamento = ? WHERE idAgendamento = ? AND dataAgendada = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setString(1, motivoAgendamento);
            st.setString(2, dataAgendadan);
            st.setInt(3, idAgendamenton);
            st.setInt(4, idAgendamento);
            st.setString(5, dataAgendada);            
            ret = st.executeUpdate();

            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    
    public static int altera4(String motivoAgendamento, String dataAgendadan, int idAgendamenton, int idAgendamento, String dataAgendada) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE DeFuncionario SET motivoAgendamento = ?, dataAgendada = ?, idAgendamento = ? WHERE idAgendamento = ? OR dataAgendada = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setString(1, motivoAgendamento);
            st.setString(2, dataAgendadan);
            st.setInt(3, idAgendamenton);
            st.setInt(4, idAgendamento);
            st.setString(5, dataAgendada);            
            ret = st.executeUpdate();

            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int exclui1(int idDeFuncionario) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM DeFuncionario WHERE idAgendamento = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idDeFuncionario);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int exclui2(String dataAgendada) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM DeFuncionario WHERE dataAgendada = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, dataAgendada);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int exclui3(int idDeFuncionario, String dataAgendada) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM DeFuncionario WHERE idDeFuncionario = ? AND dataAgendada = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idDeFuncionario);
            st.setString(2, dataAgendada);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int exclui4(int idDeFuncionario, String dataAgendada) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM DeFuncionario WHERE idDeFuncionario = ? OR dataAgendada = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idDeFuncionario);
            st.setString(2, dataAgendada);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

}
