public class Title implements Comparable<Title> {
    
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int compareTo(Title otherTitle) {
        return this.name.compareTo(otherTitle.name) ;
    }

    @Override 
    public String toString() {
        return name;
    }
}
