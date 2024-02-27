package src.exercicio03;

//Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao
//e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e 
//calcular a média de avaliações.    

public class Musica {
    String titulo;
    String artista;
    int anoLancameto;
    double avaliacao;
    int numAvaliacoes;

    void exibeFichaTecnica () {
        System.out.println(String.format("""
                Título:              %s
                Artísta:             %s
                Ano de lançamento:   %d
                Avaliação:           %.1f 
                """, titulo, artista, anoLancameto, avaliacao));
    }

    double totalAvaliacao;
    void avaliaMusica (double nota) {
        totalAvaliacao += nota;
        numAvaliacoes++; 
    }

    void mediaAvaliacoes () {
        avaliacao = totalAvaliacao/numAvaliacoes;
    }
}
