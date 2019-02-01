package modelo;

/**
 *
 * @author Kleber Jr
 */
public class Juiz {
    
    private String nome;
    private int id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Juiz(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }
    
    public Juiz(){}
    
    @Override
    public String toString(){
        return  "\n   --Dados do juiz--"+
                "\n Nome: "+getNome()+
                "\n ID: "+getId()+
                "\n ";
    }
    
}
