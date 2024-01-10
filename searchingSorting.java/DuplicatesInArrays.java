import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDuplicates {
    public static List<Integer> findDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int num : arr) {
            if (!set.add(num)) {
                duplicates.add(num);
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 7, 8, 8};
        List<Integer> duplicates = findDuplicates(arr);

        System.out.println("Duplicate elements: " + duplicates);
    }
}
