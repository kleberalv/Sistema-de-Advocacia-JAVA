package modelo;

/**
 *
 * @author Kleber Jr
 */
public class AudienciaCliente {
    private String motivoAgendamento;
    private Cliente cliente;
    private Audiencia audiencia;
    private int idAudienciaCliente;

    public String getMotivoAgendamento() {
        return motivoAgendamento;
    }

    public void setMotivoAgendamento(String motivoAgendamento) {
        this.motivoAgendamento = motivoAgendamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Audiencia getAudiencia() {
        return audiencia;
    }

    public void setAudiencia(Audiencia audiencia) {
        this.audiencia = audiencia;
    }
    
    public int getIdAudienciaCliente() {
        return idAudienciaCliente;
    }

    public void setIdAudienciaCliente(int idAudienciaCliente) {
        this.idAudienciaCliente = idAudienciaCliente;
    }    
    
    public AudienciaCliente(){}

    public AudienciaCliente(int idAudienciaCliente,String motivoAgendamento, Cliente cliente, Audiencia audiencia) {
        this.idAudienciaCliente=idAudienciaCliente;
        this.motivoAgendamento = motivoAgendamento;
        this.cliente = cliente;
        this.audiencia = audiencia;
    }
    
    @Override
    public String toString(){
        return  "\n   --Dados da audiência com cliente--"+
                "\n ID: "+getIdAudienciaCliente()+
                "\n Motivo da audiência: "+getMotivoAgendamento()+
                "\n "+getCliente()+
                "\n "+getAudiencia()+
                "\n ";
    }
    
}
