package bancodigital.conta;

import bancodigital.cliente.Cliente;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(int numero, int agencia, Cliente cliente) {
        super(numero, agencia, cliente);
    }

    public ContaPoupanca(int numero, int agencia, double saldo, Cliente cliente) {
        super(numero, agencia, saldo, cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("====== Extrato Conta Poupança ======");
        super.imprimirInformacoesConta();
    }
}
