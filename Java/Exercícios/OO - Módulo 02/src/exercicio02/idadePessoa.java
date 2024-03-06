package exercicio02;
public class idadePessoa {
    private String nome;
    private int idade;
    
    //setters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    //getters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificaIdade() {
        if (idade >= 18){
            System.out.println(nome + " é maior de idade");
        } else {
            System.out.println(nome + " é menor de idade");
        }
    }
}