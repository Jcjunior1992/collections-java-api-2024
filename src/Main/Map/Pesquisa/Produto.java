package Main.Map.Pesquisa;

public class Produto {

    private String produto;
    private double preco;
    private int quantidade;

    public Produto(String produto, double preco, int quantidade) {
        this.produto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getProduto() {
        return produto;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "produto='" + produto + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}