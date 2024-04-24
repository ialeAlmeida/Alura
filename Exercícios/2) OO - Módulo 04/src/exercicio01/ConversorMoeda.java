/*Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira
com o método converterDolarParaReal() para converter um valor em dólar para reais.
A classe deve receber o valor em dólar como parâmetro.*/

package exercicio01;

public class ConversorMoeda implements ConversaoFinanceira {
    @Override
    public double converterDolarParaReal(double valor) {
        double cotacaoDolar = 4.98;
        double valorReal = valor * cotacaoDolar; 
        return valorReal;
    }
}
