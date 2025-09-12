import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Arrays;

public class HighestNumOfStringsInAnArray{
    public static void main(String[] args){
        String[] fruits = {"apple","banana","Cherry","apple","banana","apple","banana","Cherry"};
        
        Map<String,Long> fruitCountMap = Arrays.stream(fruits).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        long maxCount = fruitCountMap.values().stream().mapToLong(Long::longValue).max().orElse(0);
        
        List<String> fruitsAre= fruitCountMap.entrySet().stream().filter(entry->entry.getValue()==maxCount).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("fruits with more occurences in array are "+fruitsAre);
        System.out.println("max count of these fruits is "+maxCount);
    }
}