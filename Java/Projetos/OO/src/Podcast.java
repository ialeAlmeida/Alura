public class Podcast extends Audio {
    private int idPodcast;
    private String apresentador;
    private String convidado;
    
    //sobrecarga de construtor
    public Podcast(int idPodcast, String nome, String apresentador, String convidado, double tempoDeReproducao, boolean disponivelNoSpotify, boolean disponivelNoYoutube) {
        super(nome, tempoDeReproducao, disponivelNoSpotify, disponivelNoYoutube);
        this.idPodcast = idPodcast;
        this.apresentador = apresentador;
        this.convidado = convidado;
    }

    //getters e setter
    public int getIdPodcast() {
        return idPodcast;
    }

    public String getApresentador() {
        return apresentador;
    }

    public String getConvidado() {
        return convidado;
    }
    public void setConvidado(String convidado) {
        this.convidado = convidado;
    }

    @Override 
    public void mostraFichaTecnica() {
        System.out.println(String.format("""
                   --- Ficha Técnica ---
                Nome:            %s
                Apresentador:    %s
                Convidado:       %s
                Tempo de reprodução:    %.2f
                Total de reproduções:   %d
                Disponível no Spotify:  %s
                Disponível no Youtube:  %s
                """, nome, apresentador, convidado, tempoDeReproducao,totalReproducoes, disponivelNoSpotify, disponivelNoYoutube));
    }

    @Override
    public String reproduzAudio() {
        totalReproducoes++;
        return "Podcast foi reproduzido";
    }
}
