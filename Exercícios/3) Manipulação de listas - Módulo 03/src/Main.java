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

        /*var c1 = new Circle(3.8);
        var c2 = new Circle(10.5);
        
        var s1 = new Square(4);
        var s2 = new Square(9.9);
        
        var shapes = new ArrayList<Shape>();
        shapes.add(c1);
        shapes.add(c2);
        shapes.add(s1);
        shapes.add(s2);

        for (Shape shape : shapes) {
            shape.calcularArea();
        }

        shapes.forEach(System.out::println);*/

        //----------------------------------------

        /*var ba1 = new BankAccount("1", 56);
        var ba2 = new BankAccount("2", 750);
        var ba3 = new BankAccount("3", 210.10);
        var ba4 = new BankAccount("4", 3.4);
        var ba5 = new BankAccount("5", 15);
        var ba6 = new BankAccount("6", 45.50);
        var ba7 = new BankAccount("7", 71);

        var bankAccounts = new ArrayList<BankAccount>();
        bankAccounts.add(ba1);
        bankAccounts.add(ba2);
        bankAccounts.add(ba3);
        bankAccounts.add(ba4);
        bankAccounts.add(ba5);
        bankAccounts.add(ba6);
        bankAccounts.add(ba7);

        BankAccount bankAccountWithBiggestBalance = null;
        double biggestBalance = Double.MIN_VALUE;

        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getBalance() > biggestBalance) {
                biggestBalance = bankAccount.getBalance();
                bankAccountWithBiggestBalance = bankAccount;
            }
        }

        if (bankAccountWithBiggestBalance != null) {
            System.out.println("bankAccount com maior saldo: " + bankAccountWithBiggestBalance);
        } else {
            System.out.println("Nenhuma bankAccount encontrada.");
        }*/
        
    }
}