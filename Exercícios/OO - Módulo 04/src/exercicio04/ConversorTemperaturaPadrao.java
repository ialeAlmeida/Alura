/*Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() 
e fahrenheitParaCelsius(). Implemente uma classe ConversorTemperaturaPadrao que 
implementa essa interface com as fórmulas de conversão e exibe os resultados. */

package exercicio04;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    @Override
    public void celsiusParaFahrenheit(double tempEmCelsius) {
        double tempEmFahrenheit = tempEmCelsius * 1.8 + 32;
        System.out.println("A temperatura em fahrenheit é " + tempEmFahrenheit);
    }
    
    @Override
    public void fahrenheitParaCelsius(double tempEmFahrenheit) {
        double tempEmCelsius = (tempEmFahrenheit - 30 ) / 2;
        System.out.println("A temperatura em graus celsius é " + tempEmCelsius);
    }

}
