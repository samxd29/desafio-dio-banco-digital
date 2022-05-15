import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;

@Getter
@Setter
public abstract class Conta {

    private int numero;
    private int agencia;
    private double saldo;

    private Cliente cliente;

    public void depositar(double valor){
        if (valor <= 0){
            System.out.println("Valor deve ser maior que zero");
        }
        else {
            this.saldo = this.saldo + valor;
            System.out.println("Deposito efetuado com sucesso!");
        }
    }

    public void sacar(double valor){
        if (valor > this.saldo){
            System.out.println("Saldo insuficiente.");
        }else {
            this.saldo = this.saldo - valor;
            System.out.println("Saque efetuado com sucesso!");
        }
    }

    public void transferir(Conta contaDestino, double valor){
        if (valor > this.saldo){
            System.out.println("Saldo insuficiente");
        }
        else {
            this.saldo = this.saldo - valor;
            System.out.println("Conta de origem: "+this.numero);
            System.out.println("Conta de destino: "+contaDestino.getNumero());
            System.out.println("Titual Conta Destino: "+contaDestino.cliente.getNome());
            System.out.println("Valor da transferido: "+valor);
            System.out.println("Tranferencia efetuado com sucesso");
            contaDestino.saldo = contaDestino.saldo + valor;
        }
    }

    public void extrato(){
        System.out.println("-------- Extrato da conta ------");
        System.out.println("Titutal da Conta: "+this.cliente.getNome());
        System.out.println("Conta numero : "+this.numero);
        System.out.println("Agencia numero : "+this.agencia);
        System.out.println("Saldo atual: "+this.saldo);
    }
}
