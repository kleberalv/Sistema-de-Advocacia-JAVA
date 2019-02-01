package modelo;

/**
 *
 * @author Kleber Jr
 */
public class AudienciaJuiz {
    private Audiencia audiencia;
    private Juiz juiz;
    private int idAudienciaJuiz;

    public Audiencia getAudiencia() {
        return audiencia;
    }

    public void setAudiencia(Audiencia audiencia) {
        this.audiencia = audiencia;
    }

    public Juiz getJuiz() {
        return juiz;
    }

    public void setJuiz(Juiz juiz) {
        this.juiz = juiz;
    }
    
    public int getIdAudienciaJuiz() {
        return idAudienciaJuiz;
    }

    public void setIdAudienciaJuiz(int idAudienciaJuiz) {
        this.idAudienciaJuiz = idAudienciaJuiz;
    }
    
    public AudienciaJuiz(){}

    public AudienciaJuiz(int idAudienciaJuiz, Audiencia audiencia, Juiz juiz) {
        this.idAudienciaJuiz=idAudienciaJuiz;
        this.audiencia = audiencia;
        this.juiz = juiz;
    }
    
    @Override
    public String toString(){
        return  "\n   --Dados da audiência com o Juiz: "+
                "\n ID: "+getIdAudienciaJuiz()+
                "\n "+getAudiencia()+
                "\n "+getJuiz()+
                "\n ";
    }
    
}
