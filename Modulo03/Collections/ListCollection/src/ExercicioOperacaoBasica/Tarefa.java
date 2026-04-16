package ExercicioOperacaoBasica;

public class Tarefa {

    private String description;

    public Tarefa(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    //para imprimir a lista sem ser o ponto de memoria que ela esta temos que sobresescrever o toString.
    @Override
    public String toString() {
        return description;
    }
}
