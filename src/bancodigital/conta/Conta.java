package bancodigital.conta;

import bancodigital.Cliente;

public abstract class Conta implements IConta {
    private int numero;
    private int agencia;
    private double saldo;
    private Cliente cliente;

    public Conta(int numero, int agencia, Cliente cliente) {
        this.numero = numero;
        this.agencia = agencia;
        this.cliente = cliente;
    }

    public Conta(int numero, int agencia, double saldo, Cliente cliente) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public boolean sacar(double valor) {
        if(valor > this.saldo) {
            System.out.println("Saldo insuficiente para saque!");
            return false;
        }

        this.saldo -= valor;
        return true;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void transferir(double valor, Conta conta) {
        if(this.sacar(valor)) {
            conta.depositar(valor);
        }
    }

    protected void imprimirInformacoesConta() {
        String divisor = "====================================";
        System.out.println(divisor);
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Número.: " + this.numero);
        System.out.printf("Saldo..: R$ %.2f\n", this.saldo);
        System.out.println(divisor);
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }
}
