import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
  
        var p = new Pessoa("Iale", 29, true);
        var p1 = new Pessoa("Alisson", 22, false);
        var p2 = new Pessoa("Daniel", 32, true);

        pessoas.add(p);
        pessoas.add(p1);
        pessoas.add(p2);

        System.out.println(pessoas);

        System.out.println("---------------");

        for (Pessoa pessoa: pessoas) {
            System.out.println(pessoa);
        }

        System.out.println("---------------");

        pessoas.forEach(pessoa -> System.out.println(pessoa));

        System.out.println("---------------");

        pessoas.forEach(System.out::println);
    }
}
