import java.util.Map;
import java.util.LinkedHashMap;

public class FirstNonRepeatedCharacter{
    public static void main(String []args){
        String input = "example";
        char result = findFirstRepeatedCharacter(input);
        
        if(result != '\0'){
            System.out.println("first non repeated character is "+result);
        }else{
            System.out.println("no repeated character is present");
        }
        
    }
    
    public static char findFirstRepeatedCharacter(String string){
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