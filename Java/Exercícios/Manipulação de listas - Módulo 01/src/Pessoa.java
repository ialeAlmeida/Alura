//1. Crie uma classe Pessoa com atributos como nome, idade, e um método toString que represente esses atributos.

public class Pessoa {
    private String nome;
    private int idade;
    
    //O exercício não pede um construtor, mas como vou precisar instanciar alguns objetos dessa classe, vou fazer
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override 
    public String toString() {
        return "O nome desta pessoa é " + nome + " e ela tem " + idade + " anos.";
    }
}