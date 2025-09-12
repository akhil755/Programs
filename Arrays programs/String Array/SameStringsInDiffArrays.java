import java.util.Set;
import java.util.HashSet;

public class SameStringsInDiffArrays{
    public static void main(String[] args){
        String[] arr1 = {"apple","banana","Cherry"};
        String[] arr2 = {"apple","Cherry","Dates"};
        
        Set<String> set1 = new HashSet<>();
        for(String s : arr1){
            set1.add(s);
        }
        
        Set<String> commonSet = new HashSet<>();
        for(String s : arr2){
            if(set1.contains(s)){
                commonSet.add(s);
            }
        }
        System.out.println("Elements that are common in both the arrays are : "+commonSet);
    }
}