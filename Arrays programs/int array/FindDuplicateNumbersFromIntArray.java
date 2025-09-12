import java.util.Set;
import java.util.HashSet;

public class FindDuplicateNumbersFromIntArray{
    public static void main(String []args){
        int[] numbers = {1,3,5,3,4,2,5,6,4,6};
        
        Set<Integer> numberSet = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        
        for(int num : numbers){
            if(!numberSet.add(num)){
                duplicates.add(num);
            }
        }
        System.out.println("duplicates :"+duplicates);
    }
}