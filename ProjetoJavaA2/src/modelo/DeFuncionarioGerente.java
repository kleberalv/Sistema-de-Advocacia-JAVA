package modelo;

/**
 *
 * @author Kleber Jr
 */
public class DeFuncionarioGerente {
    private DeFuncionario deFuncionario;
    private Gerente gerente;
    private int idDeFuncionarioGerente;
    
    public DeFuncionario getDeFuncionario() {
        return deFuncionario;
    }

    public void setDeFuncionario(DeFuncionario deFuncionario) {
        this.deFuncionario = deFuncionario;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
    
    public int getIdDeFuncionarioGerente() {
        return idDeFuncionarioGerente;
    }

    public void setIdDeFuncionarioGerente(int idDeFuncionarioGerente) {
        this.idDeFuncionarioGerente = idDeFuncionarioGerente;
    }
    
    public DeFuncionarioGerente(){}

    public DeFuncionarioGerente(int idDeFuncionarioGerente, DeFuncionario deFuncionario, Gerente gerente) {
        this.idDeFuncionarioGerente=idDeFuncionarioGerente;
        this.deFuncionario = deFuncionario;
        this.gerente = gerente;
    }
    
    @Override
    public String toString(){
        return  "\n   --Dados da reunião do funcionário gerente--"+
                "\n ID: "+getIdDeFuncionarioGerente()+
                "\n "+getDeFuncionario()+
                "\n "+getGerente()+
                "\n ";
    }
    
}
