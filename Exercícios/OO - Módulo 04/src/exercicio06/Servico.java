package exercicio06;

public class Servico implements Vendavel{
    private String nome;
    private double preco;
    private int quantasVezes;
    private double precoTotal;

    public Servico (String nome, double preco, int quantasVezes) {
        this.nome = nome;
        this.preco = preco;
        this.quantasVezes = quantasVezes;
    }

    @Override
    public void calculaPrecoTotal() {
        precoTotal = preco * quantasVezes;
        System.out.println("O preço total total do " + nome + " sairá por R$" + precoTotal);
    }

    @Override
    public void aplicaDesconto() {
        if (quantasVezes > 5) {
            double desconto = precoTotal - (precoTotal * 0.1);
            System.out.println("Que legal! Você requisitou esse serviço cinco vezes. Isso significa que você tem um desconto de 10%! Os serviços sairão por R$" + desconto);
        } else {
            if (quantasVezes > 1) {
                System.out.println("Os serviços saem por R$" + precoTotal);
            } else {
                System.out.println("O serviço sai por R$" + precoTotal);
            }
        }
    }
}
