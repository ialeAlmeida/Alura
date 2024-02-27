package src.exercicio04;

public class Main {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.modelo = "SUV";
        c.ano = 2010;
        c.cor = "Preta";

        c.exibeFichaTecnica();
        c.calculaIdade();
    }
}
