public class Dog extends Animal{
    private boolean bark;
    private String breed;

    public Dog(String type, String classTAVM, boolean bark, String breed){
        super(type, classTAVM);
        this.bark = bark;
        this.breed = breed;
    }
}
