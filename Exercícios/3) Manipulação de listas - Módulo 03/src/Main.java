import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        /*var names = new ArrayList<String>();
        names.add("Crist");
        names.add("Dana");
        names.add("Scarlet");
        names.add("Veronica");
        names.add("Carol");

        names.forEach(System.out::println);*/

        //----------------------------------------

       /*var d1 = new Dog("Dog", "Terrestre", true, "Vira-lata");
        Animal d2 = (Animal) d1;
        
        var dogs = new ArrayList<Dog>();
        dogs.add(d1);

        for (Dog d : dogs) {
            if(d instanceof Dog) {
                Animal d3 = (Animal) d;
            }
        }*/

        //----------------------------------------

        /*var products = new ArrayList<Product>();

        var p1 = new Product("Rice", 3.4);
        var p2 = new Product("Meat", 2.5);
        var p3 = new Product("Breat", 1.99);
        
        products.add(p1);
        products.add(p2);
        products.add(p3);*/
    
        //Não consegui encontrar uma maneira de calcular o preço médio dos produtos. Essa abaixo,
        //calcula a média de cada preço de produto dividindo pelo tamanho do array.
        /*for (Product p : products) {
                double totalPrice =+ p.getPrice();
                double media = totalPrice / products.size();
                System.out.println(media);
        }*/

        //----------------------------------------

        var c1 = new Circle(3.8);
        var c2 = new Circle(10.5);
        // c1.calcularArea();
        // c2.calcularArea();

        var s1 = new Square(4);
        var s2 = new Square(9.9);
        // s1.calcularArea();
        // s2.calcularArea();

        var shapes = new ArrayList<Shape>();
        shapes.add(c1);
        shapes.add(c2);
        shapes.add(s1);
        shapes.add(s2);

        for (Shape shape : shapes) {
            shape.calcularArea();
        }

        shapes.forEach(System.out::println);
    }
}