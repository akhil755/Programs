import java.util.Arrays;

public class MergeAndThenSortTwoCharArrays{
    public static void main(String [] args){
        char[] arr1 ={'a','c','y','x'};
        char[] arr2 ={'b','r','e','q'};
        
        char[] merged = new char[arr1.length+arr2.length];
        
        System.arraycopy(arr1,0,merged,0,arr1.length);
        System.arraycopy(arr2,0,merged,arr1.length, arr2.length);
        
        System.out.println("merged array is "+Arrays.toString(merged));
        Character[] sorted = new Character[merged.length];
        for(int i=0; i<sorted.length; i++){
            sorted[i]=merged[i];
        }
        Arrays.sort(sorted, (c1,c2)-> Character.toLowerCase(c1)-Character.toLowerCase(c2));
        System.out.println("Sorted array is "+Arrays.toString(sorted));
    }
}