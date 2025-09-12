
import java.util.List;
public class WordsWithNoDuplicates{
    public static void main(String[] args){
        List<String> words = List.of("words","WoRds","words","with","with","With");
        words.stream().map(String::toLowerCase).distinct().forEach(System.out::println);
    }
}