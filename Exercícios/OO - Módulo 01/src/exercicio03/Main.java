package src.exercicio03;

public class Main {
    public static void main(String[] args) {
        Musica m1 = new Musica();
        m1.titulo = "Feather";
        m1.artista = "Sabrina Carpner";
        m1.anoLancameto = 2023;
        m1.avaliacao = 0.0;

        m1.exibeFichaTecnica();

        m1.avaliaMusica(4.4);
        m1.avaliaMusica(3.9);
        m1.avaliaMusica(4.5);

        m1.mediaAvaliacoes();

        m1.exibeFichaTecnica();
    }
}
