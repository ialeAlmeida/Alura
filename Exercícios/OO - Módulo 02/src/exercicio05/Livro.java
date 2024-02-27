package exercicio05;
public class Livro {
    private String titulo;
    private String autor;

    //titulo
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    //autor
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }

    public void exibeDetalhes(){
        System.out.println(String.format("""
                -- Detalhes do livro --
                
                Título:   %s
                Autor:    %s
        """, titulo, autor));
    }
}
