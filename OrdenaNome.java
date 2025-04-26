import java.util.Comparator;

public class OrdenaNome implements Comparator<Aluno> {
    @Override
    public int compare(Aluno p1, Aluno p2) {
        return p1.getNome().compareTo(p2.getNome());
    }   
}
