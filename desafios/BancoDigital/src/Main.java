import banco.cliente.Cliente;
import banco.contas.Conta;
import banco.contas.ContaCorrente;
import banco.contas.ContaPoupanca;
import banco.controller.Banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        String cpf;
        Conta conta = null;
        int numero;
        boolean sair = false;

        System.out.println("=== Bem vindo ao Banco Central. === ");
        System.out.println("Selecione a operação desejada:\n");

        do {
            System.out.println("=== Menu Principal ===");
            System.out.println("1 - Criar conta corrente");
            System.out.println("2 - Criar conta poupança");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Transferir");
            System.out.println("6 - Imprimir informações da conta");
            System.out.println("0 - Sair");
            int opc = teclado.nextInt();
            switch (opc) {
                case 1:
                    teclado.nextLine();
                    System.out.println("Digite o nome do cliente: ");
                    nome = teclado.nextLine();
                    System.out.println("Digite o CPF do cliente: ");
                    cpf = teclado.nextLine();
                    conta = new ContaCorrente(new Cliente(nome, cpf));
                    Banco.addContas(conta);
                    System.out.println("Conta corrente criada com sucesso!");
                    break;
                case 2:
                    teclado.nextLine();
                    System.out.println("Digite o nome do cliente: ");
                    nome = teclado.nextLine();
                    System.out.println("Digite o CPF do cliente: ");
                    cpf = teclado.nextLine();
                    conta = new ContaPoupanca(new Cliente(nome, cpf));
                    Banco.addContas(conta);
                    System.out.println("Conta poupança criada com sucesso!");
                    break;
                case 3:
                    teclado.nextLine();
                    System.out.println("Digite o número da conta: ");
                    numero = teclado.nextInt();
                    for (Conta c : Banco.getContas()) {
                        if (c.getNumero() == numero) {
                            conta = c;
                            break;
                        }
                    }

                    if(conta == null) {
                        System.out.println("Conta não encontrada");
                        break;
                    }

                    System.out.println("Digite o valor a ser depositado: ");
                    double valor = teclado.nextDouble();
                    conta.depositar(valor);
                    break;
                case 4:
                    teclado.nextLine();

                    System.out.println("Digite o número da conta: ");
                    numero = teclado.nextInt();
                    for (Conta c : Banco.getContas()) {
                        if (c.getNumero() == numero) {
                            conta = c;
                            break;
                        }
                    }

                    if(conta == null) {
                        System.out.println("Conta não encontrada");
                        break;
                    }

                    System.out.println("Digite o valor a ser sacado: ");
                    valor = teclado.nextDouble();
                    conta.sacar(valor);
                    break;
                case 5:
                    teclado.nextLine();
                    System.out.println("Digite o número da conta de origem: ");
                    int contaOrigem = teclado.nextInt();
                    // conta de origem precisa ser decrementada em 1 para acessar o índice correto
                    try{
                        conta = Banco.getContas().get(contaOrigem - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Conta de origem não encontrada");
                        break;
                    }

                    System.out.println("Digite o valor a ser transferido: ");
                    valor = teclado.nextDouble();
                    System.out.println("Digite o número da conta destino: ");
                    numero = teclado.nextInt();
                    Conta contaDestino = null;
                    for (Conta c : Banco.getContas()) {
                        if (c.getNumero() == numero) {
                            contaDestino = c;
                            conta.transferir(contaDestino, valor);
                            break;
                        }
                    }
                    if(contaDestino == null) System.out.println("Conta destino não encontrada");
                    break;
                case 6:
                    teclado.nextLine();
                    System.out.println("Digite o seu cpf: ");
                    cpf = teclado.nextLine();
                    for(Conta c: Banco.getContas()) {
                        if(c.getCpf().equals(cpf)) {
                            c.imprimirInfos();
                            break;
                        }
                    }
                    break;
                case 0:
                    teclado.nextLine();
                    sair = true;
                    break;
            }
        } while(!sair);


    }
}