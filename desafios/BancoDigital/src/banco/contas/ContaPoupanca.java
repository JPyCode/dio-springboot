package banco.contas;

import banco.cliente.Cliente;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirInfos() {
        System.out.println("Informações da conta poupança:");
        super.imprimirInfos();
    }
}
