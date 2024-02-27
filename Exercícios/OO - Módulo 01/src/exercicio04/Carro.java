package src.exercicio04;

import java.util.Scanner;

//Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha
//técnica e calcular a idade do carro.

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFichaTecnica() {
        System.out.println(String.format("""
                Modelo:   %s
                Ano:      %d
                Cor:      %s
                """, modelo, ano, cor));
    }

    Scanner s = new Scanner(System.in);

    void calculaIdade() {
        System.out.println("Em que ano estamos?");
        int anoAtual = s.nextInt();
        
        int idade = anoAtual - ano;

        System.out.println("Esse carro tem: " + idade + " anos.");
    }

}
