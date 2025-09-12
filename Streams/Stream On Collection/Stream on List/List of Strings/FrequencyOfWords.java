import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class FrequencyOfWords{
    public static void main(String[] args){
        List<String> words = List.of("This","is","a Test", "This","is","fun");
        
        Map<String,Long> frqnc = words.stream().collect(Collectors.groupingBy(word->word, Collectors.counting()));
        
        frqnc.forEach((word,count)-> System.out.println("frequency of words :"+word+ ":"+count));
    }
}