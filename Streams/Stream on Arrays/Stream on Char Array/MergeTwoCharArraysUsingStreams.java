import java.util.stream.IntStream;
import java.util.Arrays;

public class MergeTwoCharArraysUsingStreams{
    
    public static void main(String []args){
        char[] arr1 ={'a','b','t','g'};
        char[] arr2 ={'o','c','j','r'};
        

        char[] merged = IntStream.concat(IntStream.range(0,arr1.length).map(i->arr1[i]), 
        IntStream.range(0,arr2.length).map(i->arr2[i]))
        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString().toCharArray();
        
        System.out.println(Arrays.toString(merged));
        
    }
}