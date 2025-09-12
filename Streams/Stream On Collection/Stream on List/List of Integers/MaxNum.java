
import java.util.List;
import java.util.Optional;
public class MaxNum{
    public static void main(String[] args){
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10,12);
        
        Optional<Integer> max= nums.stream().max(Integer::compareTo);
        max.ifPresent(m->System.out.println("max value: "+m));
    }
}