package banco.contas;

import banco.cliente.Cliente;

public class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected Cliente cliente;


    private int agencia;
    private int numero;
    private double saldo;


    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if(this.saldo < valor) {
            System.out.println("Saldo insuficiente");
            return;
        }
        this.saldo -= valor;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getCpf() {
        return this.cliente.getCpf();
    }

    public void transferir(Conta contaDestino, double valor) {
        if(this.saldo < valor) {
            System.out.println("Saldo insuficiente");
            return;
        }
        sacar(valor);
        contaDestino.depositar(valor);
        System.out.println("Transferência realizada com sucesso!");
    }

    public void imprimirInfos() {
        System.out.println("Nome: " + this.cliente.getNome());
        System.out.println("Cpf: " + this.cliente.getCpf());
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
    }
}
