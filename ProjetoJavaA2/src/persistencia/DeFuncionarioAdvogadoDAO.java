package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.DeFuncionarioAdvogado;

public class DeFuncionarioAdvogadoDAO {

    private static Connection connection;
    private static PreparedStatement st;
    private static ResultSet rs;

    
    public static List<DeFuncionarioAdvogado> leTodos1() throws Exception {
        List<DeFuncionarioAdvogado> listDeFuncionarioAdvogados = new ArrayList<DeFuncionarioAdvogado>();
        try {
            String sql = "SELECT * FROM DeFuncionarioAdvogado";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                DeFuncionarioAdvogado defuad = new DeFuncionarioAdvogado();
                
                defuad.setDeFuncionario(DeFuncionarioDAO.leUm1(rs.getInt("DeFuncionario_idAgendamento")));
                defuad.setAdvogado(AdvogadoDAO.leUm1(rs.getInt("Advogado_id")));
                defuad.setIdDeFuncionarioAdvogado(rs.getInt("idDeFuncionarioAdvogado"));
                
                listDeFuncionarioAdvogados.add(defuad);
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listDeFuncionarioAdvogados;
    }
//SELECT * FROM produto p INNER JOIN " +
//"juridicaproduto jp ON p.codBarra = jp.produto_codBarra " +
//"WHERE jp.juridica_cnpj = ?      
    public static List<DeFuncionarioAdvogado> leTodos2(int Advogado_id) throws Exception {
        List<DeFuncionarioAdvogado> listDeFuncionarioAdvogados = new ArrayList<DeFuncionarioAdvogado>();
        try {
            String sql =    "SELECT * FROM  DeFuncionario df INNER JOIN "+
                            "DeFuncionarioAdvogado dfa ON dfa.idDeFuncionarioAdvogado = dfa.idDeFuncionarioAdvogado "+
                            "WHERE Advogado_id = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, Advogado_id);
            rs = st.executeQuery();
            while (rs.next()) {
                DeFuncionarioAdvogado defuad = new DeFuncionarioAdvogado();
                
                defuad.setDeFuncionario(DeFuncionarioDAO.leUm1(rs.getInt("DeFuncionario_idAgendamento")));
                defuad.setAdvogado(AdvogadoDAO.leUm1(rs.getInt("Advogado_id")));
                defuad.setIdDeFuncionarioAdvogado(rs.getInt("idDeFuncionarioAdvogado"));
                
                listDeFuncionarioAdvogados.add(defuad);
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listDeFuncionarioAdvogados;
    }

    public static int grava(int DeFuncionario_idAgendamento, int Advogado_id, int idDeFuncionarioAdvogado) throws Exception {
        int ret = 0;
        try {
            String sql = "INSERT INTO DeFuncionarioAdvogado (DeFuncionario_idAgendamento, Advogado_id, idDeFuncionarioAdvogado) VALUES ( ?, ?, ?)";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setInt(1, DeFuncionario_idAgendamento);
            st.setInt(2, Advogado_id);
            st.setInt(3, idDeFuncionarioAdvogado);

            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int altera1(int DeFuncionario_idAgendamento, int idDeFuncionarioAdvogado) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE DeFuncionarioAdvogado SET deFuncionario_idAgendamento = ? WHERE idDeFuncionarioAdvogado = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setInt(1, DeFuncionario_idAgendamento); //1 ou 2
            st.setInt(2, idDeFuncionarioAdvogado);
            ret = st.executeUpdate();

            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }
    
    public static int altera2(int DeFuncionario_idAgendamento, int Advogado_id, int idDeFuncionarioAdvogado) throws Exception {
        int ret = 0;
        try {
            String sql = "UPDATE DeFuncionarioAdvogado SET deFuncionario_idAgendamento = ?, Advogado_id  = ? WHERE idDeFuncionarioAdvogado = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setInt(1, DeFuncionario_idAgendamento); //1 ou 2
            st.setInt(2, Advogado_id); //1 ou 2
            st.setInt(3, idDeFuncionarioAdvogado);
            ret = st.executeUpdate();

            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int exclui1(int idDeFuncionarioAdvogado) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM DeFuncionarioAdvogado WHERE idDeFuncionarioAdvogado = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idDeFuncionarioAdvogado);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static int exclui2(int idDeFuncionarioAdvogado, int advogado_id) throws Exception {
        int ret = 0;
        try {
            String sql = "DELETE FROM DeFuncionarioAdvogado WHERE idDeFuncionarioAdvogado = ? AND advogado_id = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idDeFuncionarioAdvogado);
            st.setInt(2, advogado_id);
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

}
