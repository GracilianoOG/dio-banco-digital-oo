package bancodigital.conta;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(int numero, int agencia) {
        super(numero, agencia);
    }

    public ContaPoupanca(int numero, int agencia, double saldo) {
        super(numero, agencia, saldo);
    }
}
