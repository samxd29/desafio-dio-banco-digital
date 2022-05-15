import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContaCorrente extends Conta {

    private double chequeEspecial;

    @Override
    public void extrato() {
        super.extrato();
        System.out.println("Saldo cheque Expecial: "+this.chequeEspecial);
    }
}
