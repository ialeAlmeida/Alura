public class ProdutoPerecivel extends Produto{
    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidadeNoEstoque, String dataValidade) {
        super(nome, preco, quantidadeNoEstoque);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return String.format("""
                ---------------------------------
                Produto:  %s
                Preço:    %.2f
                Quantidade no estoque:  %d 
                Data de validade: %s
                ---------------------------------
                """, getNome(), getPreco(), getQuantidadeNoEstoque(), dataValidade);
    }
}
