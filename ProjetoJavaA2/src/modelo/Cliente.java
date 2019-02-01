package modelo;

/**
 *
 * @author Kleber Jr
 */
public class Cliente {
    private String nome;
    private String cpf;
    private int idade;
    private String sexo;
    private Endereco endereco;
    private Advogado advogado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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

    public Advogado getAdvogado() {
        return advogado;
    }

    public void setAdvogado(Advogado advogado) {
        this.advogado = advogado;
    }
    
    public Cliente(){}

    public Cliente(String nome, String cpf, int idade, String sexo, Endereco endereco, Advogado advogado) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
        this.endereco = endereco;
        this.advogado = advogado;
    }
    
    @Override
    public String toString(){
        return  "\n   --Dados do cliente--"+
                "\n Nome: "+getNome()+
                "\n CPF: "+getCpf()+
                "\n Idade: "+getIdade()+
                "\n Sexo: "+getSexo()+
                "\n "+getEndereco()+
                "\n "+getAdvogado()+
                "\n ";
    }
    
}
