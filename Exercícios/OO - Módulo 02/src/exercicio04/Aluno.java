package exercicio04;
public class Aluno {
    private String nome;
    private double nota;
    
    //nome
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    //nota
    public double getNota(){
        return nota;
    }
    public void setNota(double nota){
        this.nota = nota;
    }

    public void calculaMedia(){
        if (nota > 5){
            System.out.println(nome + " está acima da média. Parabéns!");
        } else if (nota == 5){
            System.out.println(nome + " está na média.");
        } else {
            System.out.println(nome + " não está na média.");
        }
    }
}
