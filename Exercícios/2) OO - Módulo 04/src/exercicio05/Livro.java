/*Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente
essa interface nas classes Livro e ProdutoFisico, cada uma retornando o preço final 
considerando descontos ou taxas adicionais.*/

package exercicio05;
import java.util.Scanner;

public class Livro implements Calculavel {
    private double preco;
    
    @Override
    public void calcularPrecoFinal() {
        double desconto = preco * 0.1;

        System.out.println("Você é cliente VIP? (s/n)");
        Scanner s = new Scanner(System.in);
        char resposta = s.next().charAt(0);
        if (resposta == 's') {
            System.out.println("Você tem desconto de 10%! Com o desconto, o livro custa R$" + desconto);
        } else if(resposta == 'n') {
            System.out.println("O livro custa: R$" + preco);
        }
        s.close();
    }
}
