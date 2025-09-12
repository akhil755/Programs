import java.util.Scanner;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.function.Function;

public class DuplicateStringsInASentenceByStreams{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String inputSentence = s.nextLine();
        
        List<String> input= Arrays.asList(inputSentence.toLowerCase().split("\\s+"));
        
        Map<String, Long> wordCount = input.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        List<String> duplicates = wordCount.entrySet().stream().filter(entry->entry.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
        
        System.out.println("duplicate words are : "+duplicates);
    }
}