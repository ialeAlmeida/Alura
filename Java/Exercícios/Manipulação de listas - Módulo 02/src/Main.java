import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var p1 = new Produto("Calça", 59.90, 10);
        var p2 = new Produto("Casaco", 120.90, 18);
        var p3 = new Produto("Calça", 119.80, 10);

        ArrayList<Produto> produtos = new ArrayList<>(); 

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        System.out.println(produtos.size());
        System.out.println(produtos.get(0));
        System.out.println(produtos);

        var pp1 = new ProdutoPerecivel("Arroz", 2.13, 30, "28/09");
        System.out.println(pp1);
    }
}
