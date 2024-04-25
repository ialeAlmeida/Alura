public class Circle implements Shape {
    private double radius;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
        this.area = 0;
    }

    //pi x raio ao quadrado
    @Override
    public void calcularArea() {
        area = 3.14 * (radius * radius);
        System.out.println(area);
    }

    @Override
    public String toString() {
        return "Radius: " + radius + " and Area: " + area;
    }
}
