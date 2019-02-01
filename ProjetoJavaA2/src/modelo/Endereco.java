package modelo;

/**
 *
 * @author Kleber Jr
 */
public class Endereco implements Logradouro {
    private String rua;
    private int numero;
    protected int idEndereco;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }
    
    public Endereco(){}

    public Endereco(String rua, int numero, int idEndereco) {
        this.rua = rua;
        this.numero = numero;
        this.idEndereco=idEndereco;
    }
    
    @Override
    public String toString(){
        return  "\n   --Endereço--"+
                "\n Rua: "+getRua()+
                "\n Número: "+getNumero()+
                "\n ID: "+getIdEndereco()+
                "\n Cidade: "+Logradouro.cidade+
                "\n UF: "+Logradouro.uf+
                "\n ";
    }
    
}
