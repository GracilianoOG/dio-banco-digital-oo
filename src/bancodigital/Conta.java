package bancodigital;

public class Conta {
    private int numero;
    private int agencia;
    private double saldo;

    public Conta(int numero, int agencia) {
        this.numero = numero;
        this.agencia = agencia;
    }

    public Conta(int numero, int agencia, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
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

    public void imprimirInformacoesConta() {
        String divisor = "====================================";
        System.out.println(divisor);
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
