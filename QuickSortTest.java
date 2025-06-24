import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class QuickSortTest {
    @Test
    public void testQuickSort() {
        List<Integer> input = Arrays.asList(64, 34, 25, 12, 22);
        List<Integer> expected = Arrays.asList(12, 22, 25, 34, 64);
        assertEquals(expected, QuickSort.quickSort(input));
    }
    
    @Test
    public void testEmptyList() {
        List<Integer> input = Arrays.asList();
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, QuickSort.quickSort(input));
    }
    
    @Test
    public void testSingleElement() {
        List<Integer> input = Arrays.asList(42);
        List<Integer> expected = Arrays.asList(42);
        assertEquals(expected, QuickSort.quickSort(input));
    }
}
