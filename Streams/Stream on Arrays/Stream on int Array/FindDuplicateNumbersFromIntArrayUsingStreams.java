import java.util.Set;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Map;

public class FindDuplicateNumbersFromIntArrayUsingStreams{
    public static void main(String[] args){
        int[] numbers = {1,3,5,3,4,5,6,2,3,7,5};
        Set<Integer> duplicates = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.groupingBy(e->e, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
                
        System.out.println(duplicates);
    }
}