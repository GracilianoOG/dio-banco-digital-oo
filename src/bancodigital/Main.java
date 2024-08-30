package bancodigital;

import bancodigital.cliente.Cliente;
import bancodigital.conta.Conta;
import bancodigital.conta.ContaCorrente;
import bancodigital.conta.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente bob = new Cliente("Bob");
        Cliente john = new Cliente("John");

        // Cria contas
        Conta cp = new ContaPoupanca(1111, 1, 1000, bob);
        Conta cc = new ContaCorrente(2222, 2, 500, john);

        // Imprime as contas iniciais
        cp.imprimirExtrato();
        cc.imprimirExtrato();

        // Realiza depósito e saque
        cp.depositar(1000);
        cc.sacar(250);

        // Imprime os extratos após as operações
        cp.imprimirExtrato();
        cc.imprimirExtrato();

        // Não é possível sacar um valor maior que o da conta
        cp.sacar(2500);
        cc.sacar(300);

        // Transferência
        cp.transferir(1000, cc);

        // Imprime os extratos após as transferências
        cp.imprimirExtrato();
        cc.imprimirExtrato();

        // Não é possível transferir mais do que o saldo disponível
        cp.transferir(5000, cc);

        // Imprime os extratos após as transferências
        cp.imprimirExtrato();
        cc.imprimirExtrato();
    }
}
