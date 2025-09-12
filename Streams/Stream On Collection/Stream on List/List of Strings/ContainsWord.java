import java.util.List;
public class ContainsWord{
    public static void main(String[] args){
        List<String> words = List.of("This","is","java","practice");
        boolean match = words.stream().anyMatch(word->word.equals("java"));
        System.out.println(match);
    }
}