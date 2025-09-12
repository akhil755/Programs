import java.util.List;
import java.util.stream.Collectors;
public class StringJoiningIntoSingleStringSeparatedByComma{
    
    public static void main(String[] args){
        List<String> strings = List.of("I have","joined","list","of","Strings");
        String joinedString = strings.stream().collect(Collectors.joining(","));
        System.out.println(joinedString);
    }
}