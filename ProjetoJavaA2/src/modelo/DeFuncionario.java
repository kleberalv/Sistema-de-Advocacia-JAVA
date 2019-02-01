package modelo;

/**
 *
 * @author Kleber Jr
 */
public class DeFuncionario extends Reuniao{
    private String motivoAgendamento;
    private int idAgendamento;

    public String getMotivoAgendamento() {
        return motivoAgendamento;
    }

    public void setMotivoAgendamento(String motivoAgendamento) {
        this.motivoAgendamento = motivoAgendamento;
    }
 
    public int getIdAgendamento() {
        return idAgendamento;
    }

    public void setIdAgendamento(int idAgendamento) {
        this.idAgendamento = idAgendamento;
    }
    
    public DeFuncionario(){}

    public DeFuncionario(String motivoAgendamento, int idAgendamento, String dataAgendada) {
        super(dataAgendada);
        this.motivoAgendamento = motivoAgendamento;
        this.idAgendamento=idAgendamento;
    }
    
    @Override
    public String toString(){
        return  "\n   --Dados da reunião de funcionarios-- "+
                "\n Motivo do agendamento: "+getMotivoAgendamento()+
                "\n id Agendamento: "+getIdAgendamento()+
                "\n Data agendada: "+getDataAgendada()+
                "\n ";
    }
    
    
}
