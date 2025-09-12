import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Optional;

public class FirstNonRepeatedCharacterInStringUsingStreams{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = scanner.nextLine();

        Optional <Character> firstNonRepeatedCharacter = input.chars()
            .mapToObj(c-> (char) c)
            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
            .entrySet()
            .stream()
            .filter(entry->entry.getValue()==1)
            .map(Map.Entry::getKey).findFirst();
        
            if(firstNonRepeatedCharacter.isPresent()){
                System.out.println("First non repeated character from String "+input+" is "+firstNonRepeatedCharacter);
            }else{
                System.out.println("no repeated character is present");
            }
    }
}