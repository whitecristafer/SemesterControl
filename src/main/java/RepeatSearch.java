import java.util.ArrayList;
import java.util.HashSet;

public class RepeatSearch {
    public static ArrayList<Integer> find(ArrayList<Integer> listOne, ArrayList<Integer> listTwo) {
        HashSet<Integer> h = new HashSet<Integer>(listOne);
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (Integer number : listTwo) {
            if (h.contains(number)) {
                result.add(number);
            }
        }
        return result;
    }
}
