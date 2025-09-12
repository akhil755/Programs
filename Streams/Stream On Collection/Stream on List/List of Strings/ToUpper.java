
import java.util.List;
public class ToUpper{
    
    public static void main(String[] args){
        List<String> words = List.of("akhil","mca","developer");
        words.stream().map(word-> word.toUpperCase()).forEach(System.out::println);
    }
}