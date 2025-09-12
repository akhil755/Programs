import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class MergeTwoCharArraysAndFindCommonElements{
    public static void main(String[] args){
        char[] arr1 = {'a','b','e','f'};
        char[] arr2 = {'g','e','i','a'};
        
        Set<Character> set1 = new HashSet<>();
        for(char c: arr1){
            set1.add(c);
        }
        Set<Character> common = new HashSet<>();
        for(char c: arr2){
            if(set1.contains(c)){
                common.add(c);
            }
        }
        
        System.out.println(common);
    }
}