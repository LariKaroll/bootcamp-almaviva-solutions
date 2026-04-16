package ExercicioOperacaoBasica.ListaDeTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    
    private List<Tarefa> tarefasList;

    public ListaTarefas() {
        this.tarefasList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefasList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefasList){
            if(t.getDescription().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefasList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefasList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefasList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("O numero total de elementos na lista e: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("Tarefa 01");
        listaTarefas.adicionarTarefa("Tarefa 02");
        listaTarefas.adicionarTarefa("Tarefa 03");
        listaTarefas.adicionarTarefa("Tarefa 04");
        System.out.println("O numero total de elementos na lista e: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.removerTarefa("Tarefa 01");
        System.out.println("O numero total de elementos na lista e: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();
    }
}
