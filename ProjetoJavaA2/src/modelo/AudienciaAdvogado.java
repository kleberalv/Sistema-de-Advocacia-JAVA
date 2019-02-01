package modelo;

/**
 *
 * @author Kleber Jr
 */
public class AudienciaAdvogado {
    private String motivoAgendamento;
    private Advogado advogado;
    private Audiencia audiencia;
    private int idAudienciaAdvogado;

    public String getMotivoAgendamento() {
        return motivoAgendamento;
    }

    public void setMotivoAgendamento(String motivoAgendamento) {
        this.motivoAgendamento = motivoAgendamento;
    }

    public Advogado getAdvogado() {
        return advogado;
    }

    public void setAdvogado(Advogado advogado) {
        this.advogado = advogado;
    }

    public Audiencia getAudiencia() {
        return audiencia;
    }

    public void setAudiencia(Audiencia audiencia) {
        this.audiencia = audiencia;
    }
    
    public int getIdAudienciaAdvogado() {
        return idAudienciaAdvogado;
    }

    public void setIdAudienciaAdvogado(int idAudienciaAdvogado) {
        this.idAudienciaAdvogado = idAudienciaAdvogado;
    }
    
    public AudienciaAdvogado(){}

    public AudienciaAdvogado(String motivoAgendamento, int idAudienciaAdvogado, Advogado advogado, Audiencia audiencia) {
        this.motivoAgendamento = motivoAgendamento;
        this.idAudienciaAdvogado=idAudienciaAdvogado;
        this.advogado = advogado;
        this.audiencia = audiencia;
    }
    
    @Override
    public String toString(){
        return  "\n   --Dados da audiência com o advogado--"+
                "\n ID: "+getIdAudienciaAdvogado()+
                "\n Motivo da audiência: "+getMotivoAgendamento()+
                "\n "+getAdvogado()+
                "\n "+getAudiencia()+
                "\n ";
    }
    
}
