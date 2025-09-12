import java.util.List;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;
public class CollectSquareIntoSet{
    public static void main(String[] args){
        List<Integer> numbers = List.of(1,2,4,6,8,6);
        Set<Integer> squaredNumsInSet = numbers.stream().map(num->num*num).collect(Collectors.toCollection(LinkedHashSet::new));
        squaredNumsInSet.forEach(System.out::println);
    }
}