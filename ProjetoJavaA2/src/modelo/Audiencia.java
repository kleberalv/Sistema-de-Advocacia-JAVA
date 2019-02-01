package modelo;

/**
 *
 * @author Kleber Jr
 */
public class Audiencia {
    private String dataAudiencia;
    private int idAudiencia;

    public String getDataAudiencia() {
        return dataAudiencia;
    }

    public void setDataAudiencia(String dataAudiencia) {
        this.dataAudiencia = dataAudiencia;
    }
    
    public int getIdAudiencia() {
        return idAudiencia;
    }

    public void setIdAudiencia(int idAudiencia) {
        this.idAudiencia = idAudiencia;
    }
    
    public Audiencia(){}

    public Audiencia(String dataAudiencia, int idAudiencia) {
        this.dataAudiencia = dataAudiencia;
        this.idAudiencia=idAudiencia;
    }
    
    @Override
    public String toString(){
        return  "\n   --Dados da audiência--"+
                "\n Data da audiência: "+getDataAudiencia()+
                "\n ID da audiência: "+getIdAudiencia()+
                "\n ";
    }
}
