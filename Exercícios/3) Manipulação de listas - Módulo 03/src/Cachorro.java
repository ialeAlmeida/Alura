import java.util.ArrayList;

public class Cachorro extends Animal{
    private boolean temRabo;
    
    public Cachorro(String nome, String especie, String tipo) {
        super(nome, especie, tipo);
    }

    public boolean getTemRabo() {
        return temRabo;
    }

    ArrayList<Cachorro> cachorros = new ArrayList<>();

    public void fazendoCast() {
        for(Cachorro c: cachorros) {
            if(c instanceof Cachorro) {
                Object c1 = Animal.class.cast(c);
                //ou
                Animal c2 = (Animal) c;
            } 
        }
    }

}
