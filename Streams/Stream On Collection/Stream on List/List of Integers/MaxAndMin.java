import java.util.List;
import java.util.Optional;

public class MaxAndMin{
    public static void main(String[] args){
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        max.ifPresent(m->System.out.println(m));
        min.ifPresent(m->System.out.println(m));
        
    }
}