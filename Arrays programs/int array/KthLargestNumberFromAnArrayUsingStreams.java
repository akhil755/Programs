import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class KthLargestNumberFromAnArrayUsingStreams{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int array_size = scanner.nextInt();
        int arr1[] = new int[array_size];
        
        System.out.println("enter the "+array_size+" elements");
        for(int i=0; i<array_size; i++){
            arr1[i]=scanner.nextInt();
        }
        Arrays.sort(arr1);
        System.out.println("enter the number for kth element");
        int k = scanner.nextInt();
        
        int kth_largest = Arrays.stream(arr1).sorted().skip(k-1).findFirst().orElseThrow();
        
        System.out.println(k+"th largest number from array is "+kth_largest);
    }
}