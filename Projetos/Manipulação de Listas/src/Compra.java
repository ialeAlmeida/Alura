// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;

public class Compra implements Comparable<Compra> {
    private String descricao;
    private double valor;

    public Compra() {
        this.descricao = null;
        this.valor = 0;
    }

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }

    //se for acrescentar o compareTo precisa colocar implements Comparable<Compra>
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valor).compareTo(
            outraCompra.valor
        );
    }

    @Override
    public String toString() {
        return descricao + " R$" + valor;
    }
}
