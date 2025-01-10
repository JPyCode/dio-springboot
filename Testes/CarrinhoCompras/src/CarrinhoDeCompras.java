import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void addItem(String nome, double preco, int quantidade, String desc) {
        itens.add(new Item(nome, preco, quantidade, desc));
    }

    public void removeItem(String nome, int quantidade) {
        for (Item item : itens) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                if (item.getQuantidade() > 0) {
                    item.removeQuantidade(quantidade);
                    System.out.println(quantidade + " item(ns) removido(s) com sucesso!");
                } else {
                    itens.remove(item);
                    System.out.println("Não há mais " + nome + " no carrinho.");
                }
            }
        }
    }

    public void listItens() {
        for (Item item : itens) {
            System.out.println("Nome: " + item.getNome());
            System.out.println("Preço: " + item.getPreco());
            System.out.println("Quantidade: " + item.getQuantidade());
            System.out.println("Descrição: " + item.getDesc());
        }
    }

    public double getTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.addItem("Arroz", 10.0, 2, "Arroz branco");
        carrinho.addItem("Feijão", 8.0, 1, "Feijão carioca");
        carrinho.addItem("Macarrão", 5.0, 3, "Macarrão espaguete");
        carrinho.listItens();
        System.out.println("Total: " + carrinho.getTotal());
        carrinho.removeItem("Arroz", 1);
        carrinho.listItens();
        System.out.println("Total: " + carrinho.getTotal());
    }
}
