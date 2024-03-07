// import java.util.ArrayList;

// public class Podcast extends Audio {
//     private int idPodcast;
//     private String apresentador;
//     private ArrayList<String> apresentadores = new ArrayList<String>();
//     private String convidado;
//     private ArrayList<String> convidados = new ArrayList<String>();

    
//     //sobrecarga de construtor
//     public Musica(String nome, double tempoDeReproducao, boolean disponivelNoSpotify, boolean disponivelNoYoutube, int idMusica, String artista) {
//         super(nome, tempoDeReproducao, disponivelNoSpotify, disponivelNoYoutube);
//         this.idMusica = idMusica;
//         this.artista = artista;
//     }

//     public int getIdMusica() {
//         return idMusica;
//     }

//     public String getArtista() {
//         return artista;
//     }

//     @Override 
//     public void mostraFichaTecnica() {
//         System.out.println(String.format("""
//                    --- Ficha Técnica ---
//                 Nome:       %s
//                 Artista:    %s
//                 Tempo de Reprodução:    %.2f
//                 Disponível no Spotify:  %s
//                 Disponível no Youtube:  %s
//                 """, nome, artista, tempoDeReproducao, disponivelNoSpotify, disponivelNoYoutube));
//     }
// }
