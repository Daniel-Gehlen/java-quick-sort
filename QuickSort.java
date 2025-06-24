import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    
    public static List<Integer> quickSort(List<Integer> arr) {
        if (arr.size() <= 1) {
            return arr;
        }
        
        int pivot = arr.get(arr.size() / 2);
        List<Integer> left = new ArrayList<>();
        List<Integer> middle = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        
        for (int x : arr) {
            if (x < pivot) {
                left.add(x);
            } else if (x == pivot) {
                middle.add(x);
            } else {
                right.add(x);
            }
        }
        
        List<Integer> sorted = new ArrayList<>();
        sorted.addAll(quickSort(left));
        sorted.addAll(middle);
        sorted.addAll(quickSort(right));
        
        return sorted;
    }
    
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(64, 34, 25, 12, 22);
        List<Integer> sortedNumbers = quickSort(numbers);
        System.out.println("Lista ordenada: " + sortedNumbers);
    }
}
