/*Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico
com os métodos calcularArea() e calcularPerimetro() para calcular a área e o perímetro de 
uma sala retangular. A classe deve receber altura e largura como parâmetros.*/

package exercicio02;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    @Override
    public double calcularArea(double altura, double largura) {
        double areaRetangulo = altura * largura;
        return areaRetangulo;
    }

    @Override
    public double calcularPerimetro(double altura, double largura) {
        double perimetroRetangulo = 2 * (altura + largura);
        return perimetroRetangulo;
    }
}
