package exercicio05;
import java.util.Scanner;

public class ProdutoFisico implements Calculavel {
    private double preco;
    
    @Override
    public void calcularPrecoFinal() {
        System.out.println("Qual produto você quer comprar? Livro, jornal ou caderno?");
        Scanner s = new Scanner(System.in);
        String resposta = s.next();
        
        double desconto;

        if (resposta.equals("Livro")) {
            desconto = preco * 0.3;
            System.out.println("O preço do livro é R$" + desconto);
        } if (resposta.equals("jornal")) {
            System.out.println("O preço do jornal é R$" + preco);
        } else if (resposta.equals("caderno")) {
            desconto = preco * 0.1;
            System.out.println("O preço do jornal é R$" + desconto);
        }

        s.close();
    }
}
