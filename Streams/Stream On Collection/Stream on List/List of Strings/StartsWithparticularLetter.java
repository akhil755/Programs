import java.util.List;
import java.util.Optional;
public class StartsWithparticularLetter{
    public static void main(String[] args){
        List<String> words = List.of("This","joy","is","java","practice");
        Optional<String> startsWith = words.stream().filter(word->word.startsWith("j")).findFirst();
        
        startsWith.ifPresent(System.out::println);
    }
}