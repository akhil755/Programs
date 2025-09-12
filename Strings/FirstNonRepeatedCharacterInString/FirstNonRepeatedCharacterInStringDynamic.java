import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;
public class FirstNonRepeatedCharacterInStringDynamic{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = scanner.nextLine();
        char result = findFirstNonRepeatedCharacterInString(input);
        
        if(result != '\0'){
            System.out.println("First non repeated character from String "+input+" is "+result);
        }else{
            System.out.println("no repeated character is present");
        }
        
    }
    
    public static char findFirstNonRepeatedCharacterInString(String string){
        Map<Character, Integer> characterCountMap = new LinkedHashMap<>();
        for(char c : string.toCharArray()){
            characterCountMap.put(c, characterCountMap.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character, Integer> entry : characterCountMap.entrySet()){
           if(entry.getValue()==1){
               return entry.getKey();
           } 
        }
        return '\0';
    }
}