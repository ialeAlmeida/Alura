public class Produto {
    private String nome;
    private double preco;
    private int quantidadeNoEstoque;
 
    public Produto(String nome, double preco, int quantidadeNoEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeNoEstoque
 = quantidadeNoEstoque
;
    }

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidadeNoEstoque() {
        return quantidadeNoEstoque
;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setquantidadeNoEstoque(int quantidadeNoEstoque) {
        this.quantidadeNoEstoque
 = quantidadeNoEstoque
;
    }

    @Override
    public String toString() {
        return String.format("""
                ---------------------------------
                Produto:  %s
                Preço:    %.2f
                Quantidade no estoque:  %d
                ---------------------------------
                """, nome, preco, quantidadeNoEstoque);
    }
    
}
