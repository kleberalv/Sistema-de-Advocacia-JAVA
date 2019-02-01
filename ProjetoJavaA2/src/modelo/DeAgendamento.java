package modelo;

/**
 *
 * @author Kleber Jr
 */
public class DeAgendamento extends Reuniao {
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
    
    
    public DeAgendamento(){}

    public DeAgendamento(String motivoAgendamento, int idDeAgendamento, String dataAgendada) {
        super(dataAgendada);
        this.motivoAgendamento=motivoAgendamento;
        this.idAgendamento=idDeAgendamento;
    }
    
    @Override
    public String toString(){
        return  "\n   --Dados da reunião de agendamento--"+
                "\n Motivo do agendamento: "+getMotivoAgendamento()+
                "\n ID: "+getIdAgendamento()+
                "\n Data agendada: "+getDataAgendada()+
                "\n ";
    }


    
    
    
}
