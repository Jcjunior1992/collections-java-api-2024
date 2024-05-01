package Main.list.OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adiconarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
    List<Tarefa>tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefa(){
        System.out.println(tarefaList);
    }

    //*----------------------------Teste_________________*//

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O número total de elementos na Lista é " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adiconarTarefa("Tarefa 1");
        listaTarefa.adiconarTarefa("Tarefa 1");
        listaTarefa.adiconarTarefa("Tarefa 2");
        System.out.println("O número total de elementos na Lista é " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O número total de elementos na Lista é " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefa();



    }
}
