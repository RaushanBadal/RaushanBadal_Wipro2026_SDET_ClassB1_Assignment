package Day10_;
import java.util.*;

public class MergeStringList {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Sagnik", "Arpan"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Rahul", "Aman"));

        ArrayList<String> result = new ArrayList<>();

        result.addAll(list1);
        result.addAll(list2);

        System.out.println("Merged List: " + result);
    }
}