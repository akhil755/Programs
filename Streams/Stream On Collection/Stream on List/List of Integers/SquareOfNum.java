import java.util.List;
import java.util.stream.Collectors;

public class SquareOfNum{
    
    public static void main(String[] args){
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> squared = nums.stream().map(number-> number*number).collect(Collectors.toList());
        
        squared.forEach(System.out::println);
    }
}