package banco.controller;

import banco.contas.Conta;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private static List<Conta> contas = new ArrayList<>();

    public static List<Conta> getContas() {
        return contas;
    }

    public static void addContas(Conta conta) {
        contas.add(conta);
    }

}