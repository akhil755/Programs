
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
public class WordsWithNoDuplicatesBySet{
    public static void main(String[] args){
        List<String> words = List.of("words","WoRds","words","with","with","With");
        words.stream().map(String::toLowerCase).collect(Collectors.toSet()).forEach(System.out::println);
    }
}