public class Musica extends Audio {
    private int idMusica;
    private String cantor;
    
    //construtor
    public Musica(int idMusica, String nome, String cantor, double tempoDeReproducao, boolean disponivelNoSpotify, boolean disponivelNoYoutube) {
        super(nome, tempoDeReproducao, disponivelNoSpotify, disponivelNoYoutube);
        this.idMusica = idMusica;
        this.cantor = cantor;
    }

    //getters
    public int getIdMusica() {
        return idMusica;
    }

    public String getcantor() {
        return cantor;
    }

    @Override 
    public void mostraFichaTecnica() {
        System.out.println(String.format("""
                   --- Ficha Técnica ---
                Nome:       %s
                cantor:    %s
                Tempo de reprodução:    %.2f
                Total de reproduções:   %d
                Disponível no Spotify:  %s
                Disponível no Youtube:  %s
                """, nome, cantor, tempoDeReproducao, totalReproducoes, disponivelNoSpotify, disponivelNoYoutube));
    }

    @Override
    public String reproduzAudio() {
        totalReproducoes++;
        return "Música foi reproduzido";
    }
}
