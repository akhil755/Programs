import java.util.Set;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.Arrays;
import java.util.function.Function;

public class FindDuplicateFromListOfIntegersUsingStreams{
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1,3,4,2,5,2,3,2,5,4,7,9,6);
        Set<Integer> duplicates = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
                
        System.out.println(duplicates);
    }
}