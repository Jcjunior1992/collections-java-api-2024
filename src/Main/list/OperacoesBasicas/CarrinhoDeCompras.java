package Main.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item>carrinho;

    public CarrinhoDeCompras(){
        this.carrinho=new ArrayList<>();}

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinho.add(new Item( nome,preco,quantidade));}


    public void removerItem(String nome){
        List<Item>itensParaRemover = new ArrayList<>();
        for (Item i : carrinho) {
            if (i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        carrinho.removeAll(itensParaRemover);}
    {
        System.out.println("A lista vazia!");
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!carrinho.isEmpty()) {
            for (Item item : carrinho) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista vazia!");
        }
    }

    public void exibirItens() {
        if (!carrinho.isEmpty()) {
            System.out.println(this.carrinho);
        } else {
            System.out.println("A lista vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + carrinho +
                '}';
    }
//-----------------------------------Teste ----------------------------------------------------------------


    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");
        carrinhoDeCompras.removerItem("Caderno");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = R$" + carrinhoDeCompras.calcularValorTotal());

    }
}







