package exercicio03;

public class Produto {
    private String nome;
    private double preco;

    //nome
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    //preço
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    public void aplicaDesconto(double percentual){
        double desconto = (percentual * preco)/100;
        preco -= desconto;
        System.out.println("O calor do produto com desconto é: " + preco);
    }
}
