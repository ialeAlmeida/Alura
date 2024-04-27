import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        var intNumbers = new ArrayList<Integer>();
        intNumbers.add(5);
        intNumbers.add(78);
        intNumbers.add(-10);
        intNumbers.add(0);

        System.out.println(intNumbers);
        Collections.sort(intNumbers);
        System.out.println("Despois da ordenação: " + intNumbers);
    }
}