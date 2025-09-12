import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.stream.Collectors;

public class OddCount{
    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,7,3,7);
        Map<Integer, Long> oddCount = nums.stream().filter(n->n%2!=0).collect(Collectors.groupingBy(n->n, Collectors.counting()));
        System.out.println(oddCount);
    }
}