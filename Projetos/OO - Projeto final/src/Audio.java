import java.util.Scanner;
import java.util.ArrayList;

public class Audio {
    protected String nome;
    protected String autor;
    protected String produtor;
    protected double tempoDeReproducao;
    protected boolean disponivelNoSpotify;
    protected boolean disponivelNoYoutube;
    protected int totalCurtidas;
    protected int totalComentarios;
    protected int totalAvaliacoes;
    protected ArrayList<String> comentarios;
    protected ArrayList<Double> avaliacoes;

    //sobrecarga de construtor
    public Audio(String nome, String autor, String produtor, double tempoDeReproducao, boolean disponivelNoSpotify, boolean disponivelNoYoutube) {
        this.nome = nome;
        this.autor = autor;
        this.produtor = produtor;
        this.tempoDeReproducao = tempoDeReproducao;
        this.disponivelNoSpotify = disponivelNoSpotify;
        this.disponivelNoYoutube = disponivelNoYoutube;
    }

    public Audio(String nome, String autor, double tempoDeReproducao, boolean disponivelNoSpotify, boolean disponivelNoYoutube) {
        this.nome = nome;
        this.autor = autor;
        this.tempoDeReproducao = tempoDeReproducao;
        this.disponivelNoSpotify = disponivelNoSpotify;
        this.disponivelNoYoutube = disponivelNoYoutube;
    }

    public Audio(String nome, double tempoDeReproducao, boolean disponivelNoSpotify, boolean disponivelNoYoutube) {
        this.nome = nome;
        this.tempoDeReproducao = tempoDeReproducao;
        this.disponivelNoSpotify = disponivelNoSpotify;
        this.disponivelNoYoutube = disponivelNoYoutube;
    }

    //getters e stters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getAutor() {
        return autor;
    }

    public String getProdutor() {
        return produtor;
    }
    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public double getTempoDeReproducao() {
        return tempoDeReproducao;
    }

    public boolean getDisponivelNoSpotify() {
        return disponivelNoSpotify;
    }
    public void setDisponivelNoSpotify(boolean disponivelNoSpotify) {
        this.disponivelNoSpotify = disponivelNoSpotify;
    }

    public boolean getDisponivelNoYoutube() {
        return disponivelNoYoutube;
    }
    public void setDisponivelNoYoutube(boolean disponivelNoYoutube) {
        this.disponivelNoYoutube = disponivelNoYoutube;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getTotalComentarios() {
        return totalComentarios;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public void menu() {
        System.out.println("""
                Escolha uma das opções abaixo:

                1 - Curtir 
                2 - Comentar
                3 - Ver curtidas e comentários
                4 - Avaliar 
                5 - Ver avaliações
                6 - Exibir ficha técnica
                7 - Sair
                """);
        
        int resposta = s.nextInt();

        switch (resposta) {
            case 1:
                curteAudio();
                break;
            case 2: 
                comentaAudio();
                break;
            case 3:
                System.out.println("Total de curtidas: " + getTotalCurtidas());
                System.out.println("Comentários: ");
                mostraComentarios();
                break;
            case 4: 
                avaliaAudio();
                break;
            case 5: 
                System.out.println("Avaliações: ");
                mostraAvaliacoes();
                break;
            case 6: 
                exibeFichaTecnica();
            default:
                break;
        }
    }
            
    Scanner s = new Scanner(System.in);

    public void exibeFichaTecnica() {
        System.out.println(String.format("""
                   --- Ficha Técnica ---
                Nome:       %s
                Autor:      %s
                Produtor:   %s
                Tempo de Reprodução:    %.2f
                Disponível no Spotify:  %s
                Disponível no Youtube:  %s
                """, nome, autor, produtor, tempoDeReproducao, disponivelNoSpotify, disponivelNoYoutube));
    }

    public void curteAudio() {
        totalCurtidas++;
    }

    public void comentaAudio(){
        System.out.println("Digite seu comentário:");
        String comentario = s.nextLine();
        
        comentarios.add(comentario);
        totalComentarios++;
    }

    public void mostraComentarios() {
        for (int i = 0; i <= comentarios.size(); i++) {
            System.out.println(i);
        }
    }

    public void avaliaAudio() {
        System.out.println("Digite sua avaliação de 1 a 5:");
        double avaliacao = s.nextDouble();

        avaliacoes.add(avaliacao);
        totalAvaliacoes++;
    }
    
    public void mostraAvaliacoes() {
        for (int i = 0; i <= avaliacoes.size(); i++) {
            System.out.println(i);
        }
    }
}

