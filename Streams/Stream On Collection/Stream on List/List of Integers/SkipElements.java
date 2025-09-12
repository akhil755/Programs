import java.util.List;
public class SkipElements{
    public static void main(String[] args){
        List<Integer> numbers = List.of(1,2,4,6,5,3,7,9);
        numbers.stream().skip(3).forEach(System.out::println);
    }
}