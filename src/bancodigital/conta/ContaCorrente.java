package bancodigital.conta;

import bancodigital.Cliente;

public class ContaCorrente extends Conta {
    public ContaCorrente(int numero, int agencia, Cliente cliente) {
        super(numero, agencia, cliente);
    }

    public ContaCorrente(int numero, int agencia, double saldo, Cliente cliente) {
        super(numero, agencia, saldo, cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("====== Extrato Conta Corrente ======");
        super.imprimirInformacoesConta();
    }
}
