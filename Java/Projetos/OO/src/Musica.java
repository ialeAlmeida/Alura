import java.util.ArrayList;

public class Musica extends Audio {
    private int idMusica;
    private String artista;
    private ArrayList<String> artistas = new ArrayList<String>();
    
    //sobrecarga de construtor
    public Musica(int idMusica, String nome, String artista, double tempoDeReproducao, boolean disponivelNoSpotify, boolean disponivelNoYoutube) {
        super(nome, tempoDeReproducao, disponivelNoSpotify, disponivelNoYoutube);
        this.idMusica = idMusica;
        this.artista = artista;
    }

    public Musica(int idMusica, String nome, double tempoDeReproducao, boolean disponivelNoSpotify, boolean disponivelNoYoutube) {
        super(nome, tempoDeReproducao, disponivelNoSpotify, disponivelNoYoutube);
        this.idMusica = idMusica;
        System.out.println("Para adicionar os artista dessa música, execute o método: registraArtista()");
    }

    //getters
    public int getIdMusica() {
        return idMusica;
    }

    public String getArtista() {
        return artista;
    }

    @Override 
    public void mostraFichaTecnica() {
        System.out.println(String.format("""
                   --- Ficha Técnica ---
                Nome:       %s
                Artista:    %s
                Tempo de Reprodução:    %.2f
                Disponível no Spotify:  %s
                Disponível no Youtube:  %s
                """, nome, artista, tempoDeReproducao, disponivelNoSpotify, disponivelNoYoutube));
    }

    public void registraArtista() {
        System.out.println("Quantos artistas fizeram parte dessa música?");
        int qntdArtista = s.nextInt();
        
        for (int i = 0; i < qntdArtista; i++) {
            System.out.println("Digite o nome de um dos artistas(um a um, até acabar): ");
            String artista = s.nextLine();
            artistas.add(artista);
        }
    }
}
