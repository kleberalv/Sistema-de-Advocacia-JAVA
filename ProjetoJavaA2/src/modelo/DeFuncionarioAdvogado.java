package modelo;

/**
 *
 * @author Kleber Jr
 */
public class DeFuncionarioAdvogado {
    private DeFuncionario deFuncionario;
    private Advogado advogado;
    private int idDeFuncionarioAdvogado;

    public DeFuncionario getDeFuncionario() {
        return deFuncionario;
    }

    public void setDeFuncionario(DeFuncionario deFuncionario) {
        this.deFuncionario = deFuncionario;
    }

    public Advogado getAdvogado() {
        return advogado;
    }

    public void setAdvogado(Advogado advogado) {
        this.advogado = advogado;
    }
    
    public int getIdDeFuncionarioAdvogado() {
        return idDeFuncionarioAdvogado;
    }

    public void setIdDeFuncionarioAdvogado(int idDeFuncionarioAdvogado) {
        this.idDeFuncionarioAdvogado = idDeFuncionarioAdvogado;
    }
    
    public DeFuncionarioAdvogado(){}

    public DeFuncionarioAdvogado(int idDeFuncionarioAdvogado, DeFuncionario deFuncionario, Advogado advogado) {
        this.idDeFuncionarioAdvogado=idDeFuncionarioAdvogado;
        this.deFuncionario = deFuncionario;
        this.advogado = advogado;
    }
    
    @Override
    public String toString(){
        return  "\n   --Dados da reunião do funcionário advogado--"+
                "\n ID: "+getIdDeFuncionarioAdvogado()+
                "\n "+getDeFuncionario()+
                "\n "+getAdvogado()+
                "\n ";
    }
    
}
