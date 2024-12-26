import java.util.ArrayList;
import java.util.HashSet;

public class RepeatSearch {
    public static ArrayList<Integer> find(ArrayList<Integer> listOne, ArrayList<Integer> listTwo) {
        HashSet<Integer> h = new HashSet<Integer>(listOne);
        HashSet<Integer> h2 = new HashSet<Integer>();

        for (Integer number : listTwo) {
            if (h.contains(number)) {
                h2.add(number);
            }
        }
        return new ArrayList<>(h2) ;
    }
}
