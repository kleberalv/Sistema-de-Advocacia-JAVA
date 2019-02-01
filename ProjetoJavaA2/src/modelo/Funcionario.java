package modelo;

/**
 *
 * @author Kleber Jr
 */
public abstract class Funcionario implements Salario {

    private int id;
    private String nome;
    private String sexo;
    private Endereco endereco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Funcionario(){}

    public Funcionario(int id, String nome, String sexo, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.endereco = endereco;
    }
    
    @Override
    public abstract Double percentualSalario();
    
    @Override
    public abstract String toString();
    
}
