/*Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o método
mostrarTabuada() para exibir a tabuada de um número. A classe deve receber o número como 
parâmetro. */

package exercicio03;

public class TabuadaMutiplicacao implements Tabuada {
    @Override
    public void mostrarTabuada(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }
    }

    /*
    + Para teste +
    public static void main (String[] args) {
        TabuadaMutiplicacao t1 = new TabuadaMutiplicacao();
        t1.mostrarTabuada(5);
    }*/
}
