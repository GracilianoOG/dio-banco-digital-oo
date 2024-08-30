package bancodigital;

import bancodigital.conta.Conta;
import bancodigital.conta.ContaCorrente;
import bancodigital.conta.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente bob = new Cliente("Bob");

        Conta cp = new ContaPoupanca(1111, 1, 1000, bob);
        Conta cc = new ContaCorrente(2222, 2, 500, bob);

        cp.imprimirInformacoesConta();
        cc.imprimirInformacoesConta();
    }
}
