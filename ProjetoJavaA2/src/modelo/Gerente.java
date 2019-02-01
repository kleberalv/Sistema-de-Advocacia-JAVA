package modelo;

/**
 *
 * @author Kleber Jr
 */
public class Gerente extends Funcionario {
    private String cpf;
    private String email;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public Double percentualSalario(){
        return Salario.salarioGerente+(Salario.salarioGerente*0.10);
    }
    
    public Gerente(){}
    
    public Gerente(String cpf, String email, int id, String nome, String sexo, Endereco endereco){
        super(id, nome, sexo, endereco);
        this.cpf=cpf;
        this.email=email;
    }
        
    @Override
    public String toString(){
        return  "\n   --Dados do gerente--"+
                "\n Nome: "+getNome()+
                "\n Sexo: "+getSexo()+
                "\n CPF: "+getCpf()+
                "\n E-mail: "+getEmail()+
                "\n ID: "+getId()+
                "\n Salário: "+percentualSalario()+
                "\n "+getEndereco()+
                "\n ";
    }
}
