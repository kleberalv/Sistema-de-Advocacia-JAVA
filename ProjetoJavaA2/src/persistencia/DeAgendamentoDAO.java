package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.DeAgendamento;

public class DeAgendamentoDAO {

    private static Connection connection;
    private static PreparedStatement st;
    private static ResultSet rs;

    
    public static List<DeAgendamento> leTodos() throws Exception {
        List<DeAgendamento> listDeAgendamentos = new ArrayList<DeAgendamento>();
        try {
            String sql = "SELECT * FROM DeAgendamento";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                DeAgendamento deag = new DeAgendamento();
               
                deag.setIdAgendamento(rs.getInt("idAgendamento"));
                deag.setDataAgendada(rs.getString("dataAgendada"));
                deag.setMotivoAgendamento(rs.getString("motivoAgendamento"));

                listDeAgendamentos.add(deag);
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listDeAgendamentos;
    }

    public static DeAgendamento leUm1(int idAgendamento) throws Exception {
        DeAgendamento deag = new DeAgendamento();
        
        try {
            String sql = "SELECT * FROM DeAgendamento WHERE idAgendamento = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idAgendamento);
            rs = st.executeQuery();
            if (rs.next()) {
                
                deag.setIdAgendamento(rs.getInt("idAgendamento"));
                deag.setDataAgendada(rs.getString("dataAgendada"));
                deag.setMotivoAgendamento(rs.getString("motivoAgendamento")); 
            }
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return deag;
    }
    
    public static DeAgendamento leUm2(String dataAgendada) throws Exception {
        DeAgendamento deag = new DeAgendamento();
        
        try {
            String sql = "SELECT * FROM DeAgendamento WHERE dataAgendada = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, dataAgendada);
            rs = st.executeQuery();
            if (rs.next()) {
                
                deag.setIdAgendamento(rs.getInt("idAgendamento"));
                deag.setDataAgendada(rs.getString("dataAgendada"));
                deag.setMotivoAgendamento(rs.getString("motivoAgendamento")); 
            }
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return deag;
    }
    
    public static DeAgendamento leUm3(int idAgendamento, String dataAgendada) throws Exception {
        DeAgendamento deag = new DeAgendamento();
        
        try {
            String sql = "SELECT * FROM DeAgendamento WHERE idAgendamento = ? AND dataAgendada = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idAgendamento);
            st.setString(2, dataAgendada);
            
            rs = st.executeQuery();
            if (rs.next()) {
                
                deag.setIdAgendamento(rs.getInt("idAgendamento"));
                deag.setDataAgendada(rs.getString("dataAgendada"));
                deag.setMotivoAgendamento(rs.getString("motivoAgendamento")); 
            }
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return deag;
    }
    
    public static DeAgendamento leUm4(int idAgendamento, String dataAgendada) throws Exception {
        DeAgendamento deag = new DeAgendamento();
        
        try {
            String sql = "SELECT * FROM DeAgendamento WHERE idAgendamento = ? OR dataAgendada = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idAgendamento);
            st.setString(2, dataAgendada);
            
            rs = st.executeQuery();
            if (rs.next()) {
                
                deag.setIdAgendamento(rs.getInt("idAgendamento"));
                deag.setDataAgendada(rs.getString("dataAgendada"));
                deag.setMotivoAgendamento(rs.getString("motivoAgendamento")); 
            }
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return deag;
    }

    public static int grava(int idAgendamento, String dataAgendada, String motivoAgendamento) throws Exception {
        int ret = 0;
        try {
            String sql = "INSERT INTO DeAgendamento (idAgendamento, dataAgendada, motivoAgendamento) VALUES ( ?, ?, ?)";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setInt(1, idAgendamento);            
            st.setString(2, dataAgendada);
            st.setString(3, motivoAgendamento);

            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int altera1(String motivoAgendamento, String dataAgendada, int idAgendamenton, int idAgendamento) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE DeAgendamento SET motivoAgendamento = ?, dataAgendada = ?, idAgendamento = ? WHERE idAgendamento = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setString(1, motivoAgendamento);
            st.setString(2, dataAgendada);
            st.setInt(3, idAgendamenton);
            st.setInt(4, idAgendamento);
            ret = st.executeUpdate();

            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    
    public static int altera2(String motivoAgendamento, String dataAgendadan , int idAgendamento, String dataAgendada) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE DeAgendamento SET motivoAgendamento = ?, dataAgendada = ?, idAgendamento = ? WHERE dataAgendada = ?";
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
    
    public static int altera3(String motivoAgendamento, String dataAgendadan , int idAgendamenton, int idAgendamento, String dataAgendada) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE DeAgendamento SET motivoAgendamento = ?, dataAgendada = ?, idAgendamento = ? WHERE idAgendamento = ? AND dataAgendada = ?";
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
    
    public static int altera4(String motivoAgendamento, String dataAgendadan , int idAgendamenton, int idAgendamento, String dataAgendada) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE DeAgendamento SET motivoAgendamento = ?, dataAgendada = ?, idAgendamento = ? WHERE idAgendamento = ? OR dataAgendada = ?";
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

    public static int exclui1(int idDeAgendamento) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM DeAgendamento WHERE idAgendamento = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idDeAgendamento);
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
            String sql = "DELETE FROM DeAgendamento WHERE dataAgendada = ? ";
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

    public static int exclui3(int idDeAgendamento, String dataAgendada) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM DeAgendamento WHERE idAgendamento = ? AND dataAgendada = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idDeAgendamento);
            st.setString(2, dataAgendada);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int exclui4(int idDeAgendamento, String dataAgendada) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM DeAgendamento WHERE idAgendamento = ? OR dataAgendada = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idDeAgendamento);
            st.setString(2, dataAgendada);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

}
