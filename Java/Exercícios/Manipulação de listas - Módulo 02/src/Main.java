import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var p1 = new Produto("Calça", 59.90, 1);
        var p2 = new Produto("Casaco", 120.90, 1);
        var p3 = new Produto("Calça", 119.80, 2);

        ArrayList<Produto> produtos = new ArrayList<>(); 

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        System.out.println(produtos.size());
        System.out.println(produtos.get(0));
    }
}
