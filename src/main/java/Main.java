import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listOne = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> listTwo = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 8,5));

        ArrayList<Integer> result = RepeatSearch.find(listOne,listTwo);
        System.out.println(result);

    }
}
