package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.DeFuncionarioGerente;

public class DeFuncionarioGerenteDAO {

    private static Connection connection;
    private static PreparedStatement st;
    private static ResultSet rs;

    
    public static List<DeFuncionarioGerente> leTodos1() throws Exception {
        List<DeFuncionarioGerente> listDeFuncionarioGerentes = new ArrayList<DeFuncionarioGerente>();
        try {
            String sql = "SELECT * FROM DeFuncionarioGerente";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                DeFuncionarioGerente defuge = new DeFuncionarioGerente();
                
                defuge.setDeFuncionario(DeFuncionarioDAO.leUm1(rs.getInt("DeFuncionario_idAgendamento")));
                defuge.setGerente(GerenteDAO.leUm1(rs.getInt("Gerente_id")));
                defuge.setIdDeFuncionarioGerente(rs.getInt("idDeFuncionarioGerente"));
                
                listDeFuncionarioGerentes.add(defuge);
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listDeFuncionarioGerentes;
    }
    
    public static List<DeFuncionarioGerente> leTodos2(int gerente_id) throws Exception {
        List<DeFuncionarioGerente> listDeFuncionarioGerentes = new ArrayList<DeFuncionarioGerente>();
        try {
            String sql =    "SELECT * FROM  DeFuncionario df INNER JOIN "+
                            "DeFuncionarioGerente dfg ON dfg.idDeFuncionarioGerente = dfg.idDeFuncionarioGerente "+
                            "WHERE Gerente_id = ?";
            
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, gerente_id);
            rs = st.executeQuery();
            while (rs.next()) {
                DeFuncionarioGerente defuge = new DeFuncionarioGerente();
                
                defuge.setDeFuncionario(DeFuncionarioDAO.leUm1(rs.getInt("DeFuncionario_idAgendamento")));
                defuge.setGerente(GerenteDAO.leUm1(rs.getInt("Gerente_id")));
                defuge.setIdDeFuncionarioGerente(rs.getInt("idDeFuncionarioGerente"));
                
                listDeFuncionarioGerentes.add(defuge);
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listDeFuncionarioGerentes;
    }

    public static int grava(int DeFuncionario_idAgendamento, int Gerente_id, int idDeFuncionarioGerente) throws Exception {
        int ret = 0;
        try {
            String sql = "INSERT INTO DeFuncionarioGerente (DeFuncionario_idAgendamento, Gerente_id, idDeFuncionarioGerente) VALUES ( ?, ?, ?)";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setInt(1, DeFuncionario_idAgendamento);
            st.setInt(2, Gerente_id);
            st.setInt(3, idDeFuncionarioGerente);

            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int altera1(int DeFuncionario_idAgendamento, int idDeFuncionarioGerente) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE DeFuncionarioGerente SET deFuncionario_idAgendamento = ? WHERE idDeFuncionarioGerente = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setInt(1, DeFuncionario_idAgendamento); //1 ou 2
            st.setInt(2, idDeFuncionarioGerente);
            ret = st.executeUpdate();

            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    
    public static int altera2(int DeFuncionario_idAgendamento, int Gerente_id, int idDeFuncionarioGerente) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE DeFuncionarioGerente SET deFuncionario_idAgendamento = ?, Gerente_id = ? WHERE idDeFuncionarioGerente = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setInt(1, DeFuncionario_idAgendamento); //1 ou 2
            st.setInt(2, Gerente_id); //1 ou 2
            st.setInt(3, idDeFuncionarioGerente);
            ret = st.executeUpdate();

            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int exclui1(int idDeFuncionarioGerente) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM DeFuncionarioGerente WHERE idDeFuncionarioGerente = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idDeFuncionarioGerente);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int exclui2(int idDeFuncionarioGerente) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM DeFuncionarioGerente WHERE idDeFuncionarioGerente = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idDeFuncionarioGerente);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

}
