import java.util.ArrayList;

public class Animal {
    private String nome;
    private String especie;
    private String tipo;
    
    public Animal(String nome, String especie, String tipo) {
        this.nome = nome;
        this.especie = especie; 
        this.tipo = tipo;
    }

    ArrayList<Animal> animais = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }
    
    public String getTipo() {
        return tipo;
    }

    public boolean ehTerrestre(Animal a) {
        if(a.tipo.equals("Terrestre")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean ehAquatico(Animal a) {
        if(a.tipo.equals("Aquático")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean ehVoador(Animal a) {
        if(a.tipo.equals("Voador")) {
            return true;
        } else {
            return false;
        }
    }
}
