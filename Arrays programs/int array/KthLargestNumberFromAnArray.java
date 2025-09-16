import java.util.Scanner;
import java.util.Arrays;

public class KthLargestNumberFromAnArray{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for array size");
        int number = scanner.nextInt();
        int arr1[] = new int[number];
        System.out.println("Enter "+number+" elements");
        for(int i=0; i<number; i++){
            arr1[i]= scanner.nextInt();
        }
        System.out.println("enter a number for k");
        int k = scanner.nextInt();
        
        Arrays.sort(arr1);
        
        System.out.println(k+"th largest number from the array is "+arr1[number-k]);
    }
}