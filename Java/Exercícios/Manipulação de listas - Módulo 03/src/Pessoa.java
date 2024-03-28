public class Pessoa {
    private String nome;
    private int idade;
    private boolean casado;

    public Pessoa(String nome, int idade, boolean casado) {
        this.nome = nome;
        this.idade = idade;
        this.casado = casado;
    }

    @Override
    public String toString() {
        return nome + ", " + idade + " anos e casado: " + casado;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean getCasado() {
        return casado;
    }
    
}