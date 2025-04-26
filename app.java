import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Aluno a;
        a = new Aluno("Gui", 20, 1);
        ArrayList alunos = new ArrayList<>();
        alunos.add(a);

        a = new Aluno("Livia", 15, 2);
        alunos.add(a);

        a = new Aluno("karlo", 5, 0.9);
        alunos.add(a);

        System.out.println(alunos);

        Collections.sort(alunos);

        System.out.println(alunos);

        System.out.println("====");


        OrdenaNome opn = new OrdenaNome();
        alunos.sort(opn.reversed());


        System.out.println(alunos);

        

    }
}
