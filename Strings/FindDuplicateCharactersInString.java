import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class FindDuplicateCharactersInString{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter a string");
        String input = s.nextLine();
        
        Map<Character, Integer> characterCountMap = new HashMap<>();
        for(char c : input.toCharArray()){
            characterCountMap.put(c, characterCountMap.getOrDefault(c,0)+1);
        }
        
        boolean hasDuplicates =false;
        for(Map.Entry<Character, Integer> entry : characterCountMap.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
                hasDuplicates = true;
            }
        }
        
        if(!hasDuplicates){
            System.out.println("no duplicates");
        }
    }
}