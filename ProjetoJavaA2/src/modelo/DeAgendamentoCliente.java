package modelo;

/**
 *
 * @author Kleber Jr
 */
public class DeAgendamentoCliente {
    private DeAgendamento deAgendamento;
    private Cliente cliente;
    private int idDeAgendamentoCliente;

    public DeAgendamento getDeAgendamento() {
        return deAgendamento;
    }

    public void setDeAgendamento(DeAgendamento deAgendamento) {
        this.deAgendamento = deAgendamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public int getIdDeAgendamentoCliente() {
        return idDeAgendamentoCliente;
    }

    public void setIdDeAgendamentoCliente(int idDeAgendamentoCliente) {
        this.idDeAgendamentoCliente = idDeAgendamentoCliente;
    }
    
    public DeAgendamentoCliente(){}

    public DeAgendamentoCliente(int idDeAgendamentoCliente, DeAgendamento deAgendamento, Cliente cliente) {
        this.idDeAgendamentoCliente=idDeAgendamentoCliente;
        this.deAgendamento = deAgendamento;
        this.cliente = cliente;
    }
    
    @Override
    public String toString(){
        return  "\n   --Dados do agendamento com o cliente: "+
                "\n ID: "+getIdDeAgendamentoCliente()+
                "\n "+getDeAgendamento()+
                "\n "+getCliente()+
                "\n ";
    }
    
}
