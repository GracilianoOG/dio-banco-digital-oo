package bancodigital;

import bancodigital.conta.Conta;
import bancodigital.conta.ContaCorrente;
import bancodigital.conta.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Conta cp = new ContaPoupanca(1111, 1, 1000);
        Conta cc = new ContaCorrente(2222, 2, 500);

        cp.imprimirInformacoesConta();
        cc.imprimirInformacoesConta();
    }
}
