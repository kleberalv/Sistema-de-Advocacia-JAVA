package modelo;

/**
 *
 * @author Kleber Jr
 */
public abstract class Reuniao {
    private String dataAgendada;

    public String getDataAgendada() {
        return dataAgendada;
    }

    public void setDataAgendada(String dataAgendada) {
        this.dataAgendada = dataAgendada;
    }
    
    public Reuniao(){}
    
    public Reuniao(String dataAgendada){
        this.dataAgendada=dataAgendada;
    }
    
    @Override
    public abstract String toString();
}
