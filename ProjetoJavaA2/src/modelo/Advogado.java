package modelo;

/**
 *
 * @author Kleber Jr
 */
public class Advogado extends Funcionario {
    private int oab;
    private String email;

    public int getOab() {
        return oab;
    }

    public void setOab(int oab) {
        this.oab = oab;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public Double percentualSalario() {
    return Salario.salarioAdv+(Salario.salarioAdv*0.25);
    }
    
    public Advogado(){}
    
    public Advogado(int oab, String email, int id, String nome, String sexo, Endereco endereco) {
        super(id, nome, sexo, endereco);
        this.oab=oab;
        this.email=email;
    }

    @Override
    public String toString() {
        return  "\n   --Dados do advogado--"+
                "\n Nome: "+getNome()+
                "\n Sexo: "+getSexo()+
                "\n OAB: "+getOab()+
                "\n E-mail: "+getEmail()+
                "\n ID: "+getId()+
                "\n Salário: "+percentualSalario()+
                "\n "+getEndereco()+
                "\n ";
    }    
    
}
