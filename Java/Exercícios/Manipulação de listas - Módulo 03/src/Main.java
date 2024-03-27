import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
  
        for (Pessoa p: pessoas) {
            System.out.println(p);
        }

        System.out.println("---------------");

        pessoas.forEach(p -> System.out.println(p));

        System.out.println("---------------");

        pessoas.forEach(System.out::println);
    }
}
