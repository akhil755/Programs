import java.util.Arrays;

public class MergeTwoCharArrays{
    public static void main(String[] args){
        char[] arr1 = {'a','b','e','f'};
        char[] arr2 = {'g','h','i','j'};
        
        char[] merged = new char[arr1.length+arr2.length];
         
         System.arraycopy(arr1, 0, merged, 0, arr1.length);
         
         System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
         
         System.out.println(Arrays.toString(merged));
    }
}