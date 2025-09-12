import java.util.stream.IntStream;
import java.util.Arrays;

public class ReverseAnArrayUsingStreams{
    public static void main(String[] args){
        int[] numbers = {1,3,5,7,4,2};
        int[] reversed = IntStream.range(0,numbers.length)
        .map(i->numbers[numbers.length-i-1])
        .toArray();
        
        System.out.println(Arrays.toString(reversed));
    }
}