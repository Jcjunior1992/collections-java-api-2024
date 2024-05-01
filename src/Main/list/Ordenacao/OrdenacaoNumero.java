//* Ordenação de Números
//Crie uma classe chamada "OrdenacaoNumeros" que possui uma lista de números inteiros como atributo. Implemente os seguintes métodos:
//
//adicionarNumero(int numero): Adiciona um número à lista.
//ordenarAscendente(): Ordena os números da lista em ordem ascendente usando a interface Comparable e a class Collections.
//ordenarDescendente(): Ordena os números da lista em ordem descendente usando um Comparable e a class Collections. *//

package Main.list.Ordenacao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumero {

    private List<Integer>numerosList;

    public OrdenacaoNumero() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()) {
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        } else {
            throw new RuntimeException("Lista vazia.");
        }
    }

    public List<Integer> ordenarDecrescente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()) {
            numerosAscendente.sort(Collections.reverseOrder());
            return numerosAscendente;
        } else {
            throw new RuntimeException("Lista vazia.");
        }
    }

    public void exibirNumeros() {
        if (!numerosList.isEmpty()) {
            System.out.println(this.numerosList);
        } else {
            System.out.println("Lista vazia.");
        }
    }

    //* -------------TESTE---------------------------*//
    public static void main(String[] args) {

        OrdenacaoNumero numeros = new OrdenacaoNumero();


        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(23);
        numeros.adicionarNumero(145);
        numeros.adicionarNumero(52);
        numeros.adicionarNumero(32);

        numeros.exibirNumeros();

        System.out.println(numeros.ordenarAscendente());

        numeros.exibirNumeros();

        System.out.println(numeros.ordenarDecrescente());

        numeros.exibirNumeros();
    }
}