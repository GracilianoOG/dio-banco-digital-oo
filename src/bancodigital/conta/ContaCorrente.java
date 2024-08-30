package bancodigital.conta;

public class ContaCorrente extends Conta {
    public ContaCorrente(int numero, int agencia) {
        super(numero, agencia);
    }

    public ContaCorrente(int numero, int agencia, double saldo) {
        super(numero, agencia, saldo);
    }
}
