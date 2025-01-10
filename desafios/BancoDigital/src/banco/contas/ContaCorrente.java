package banco.contas;

import banco.cliente.Cliente;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void imprimirInfos() {
        System.out.println("Informações da conta corrente:");
        super.imprimirInfos();
    }

}
