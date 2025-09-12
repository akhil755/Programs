import java.util.List;
public class IsPositive{
    public static void main(String[] args){
        List<Integer> numbers = List.of(1,2,3,4,6,7,8);
        boolean isItPositive =numbers.stream().allMatch(num->num>0);
        System.out.println(isItPositive);
    }
}