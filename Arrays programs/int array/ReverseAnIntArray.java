import java.util.Arrays;

public class ReverseAnIntArray{
    public static void main(String []args){
        int[] numbers = {1,2,3,5,4,7,6};
        int n = numbers.length;
        for(int i=0; i<n/2; i++){
            int temp =numbers[i];
            numbers[i]=numbers[n-i-1];
            numbers[n-i-1]=temp;
        }
        System.out.println("reversed array "+Arrays.toString(numbers));
    }
}