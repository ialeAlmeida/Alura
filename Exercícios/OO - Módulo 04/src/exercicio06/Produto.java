/*Crie uma interface Vendavel com métodos para calcular o preço total de um produto
com base na quantidade comprada e aplicar descontos. Implemente essa interface nas 
classes Produto e Servico, cada uma fornecendo a sua própria lógica de cálculo de 
preço. */

package exercicio06;
import java.util.Scanner;

public class Produto implements Vendavel {
    private String nome;
    private double preco;
    private int qntdComprada;
    private double precoTotal;

    public Produto (String nome, double preco, int qntdComprada) {
        this.nome = nome;
        this.preco = preco;
        this.qntdComprada = qntdComprada;
    }

    Scanner s = new Scanner(System.in);

    @Override
    public void calculaPrecoTotal() {
        precoTotal = preco * qntdComprada;
        System.out.println("O preço total total do produto sairá por R$" + precoTotal);
    }    

    @Override
    public void aplicaDesconto() {
        System.out.println("""
            Qual a forma de pagamento? 
            
            1 - à vista
            2 - cartão de crédito 
            3 - cartão de débito 
            4 - pix
                    """);
        int formaDePagamento = s.nextInt();
        
        if (formaDePagamento == 1) {
            System.out.println("O preço do sua compra é R$" + precoTotal);
        } if (formaDePagamento == 2) {
            double desconto = precoTotal + (precoTotal * 0.1);
            System.out.println("O preço do sua compra é R$" + desconto);
        } if (formaDePagamento == 3) {
            System.out.println("O preço do sua compra é R$" + precoTotal);
        } else if (formaDePagamento == 4) {
            double desconto = precoTotal - (precoTotal * 0.1);
            System.out.println("O preço do sua compra é R$" + desconto);
        }

    }

    public static void main(String[] args) {
        Produto p = new Produto("Caderno", 11.65, 1);
        p.calculaPrecoTotal();
        p.aplicaDesconto();
        
    }
}
