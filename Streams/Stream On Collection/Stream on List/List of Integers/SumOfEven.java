
import java.util.List;
public class SumOfEven{
    public static void main(String[] args){
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10,12);
        int sum = nums.stream().filter(num->num%2==0).mapToInt(Integer::intValue).sum();
        
        System.out.println(sum);
    }
}