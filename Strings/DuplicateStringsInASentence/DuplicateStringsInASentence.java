import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class DuplicateStringsInASentence{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a sentence with duplicate words");
        String input = s.nextLine();
        
        String[] words = input.toLowerCase().split("\\W+");
        
        Map<String, Integer> wordCountMap = new TreeMap<>();
        for(String word : words){
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0)+1);
        }
        System.out.println("Duplicate Words : ");
        boolean hasDuplicates =false;
        for(Map.Entry<String, Integer> entry : wordCountMap.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+" ");
                hasDuplicates = true;
            }
        }
        if(!hasDuplicates){
            System.out.println("No duplicates");
        }
    }
}