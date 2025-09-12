import java.util.List;
public class PrintElements{
    public static void main(String[] args){
        List<Integer> numbers = List.of(1,2,4,6,5,3,7,9);
        numbers.stream().limit(5).forEach(System.out::println);
    }
}