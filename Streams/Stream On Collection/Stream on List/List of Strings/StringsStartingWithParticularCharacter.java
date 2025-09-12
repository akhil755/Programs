import java.util.List;
import java.util.stream.Collectors;

public class StringsStartingWithParticularCharacter{
    public static void main(String[] args){
        List<String> names = List.of("Akhil","Nikhil","anjali","aniketh");
        List<String> namesStartingWith = names.stream().filter(name-> name.charAt(0)=='A' || name.charAt(0) == 'a').collect(Collectors.toList());
        namesStartingWith.forEach(System.out::println);
    }
}