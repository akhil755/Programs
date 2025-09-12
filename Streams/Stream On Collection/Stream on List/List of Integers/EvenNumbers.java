
import java.util.List;
import java.util.stream.Collectors;
public class EvenNumbers{
    
    public static void main(String[] args){
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evennumbers = numbers.stream().filter(num-> num % 2==0).collect(Collectors.toList());
        evennumbers.forEach(System.out::println);
    }
}