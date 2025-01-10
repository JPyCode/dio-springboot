public class Item {
    private String nome;
    private double preco;
    private int quantidade;
    private String desc;

    public Item(String nome, double preco, int quantidade, String desc) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.desc = desc;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void removeQuantidade(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String getDesc() {
        return desc;
    }
}