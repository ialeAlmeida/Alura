public class Square implements Shape {
    private double side;
    private double area;

    public Square(double side) {
        this.side = side;
        this.area = 0;
    }

    @Override
    public void calcularArea() {
        area = side * 4;
        System.out.println(area);
    }

    @Override
    public String toString() {
        return "Side: " + side + "and Area: " + area;
    }
}
