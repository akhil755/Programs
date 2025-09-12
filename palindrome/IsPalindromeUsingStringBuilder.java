import java.util.Scanner;

public class isPalindromeUsingStringBuilder{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the string");
        String input = s.nextLine();
        
        String reversed = new StringBuilder(input).reverse().toString();
        
        if(input.equals(reversed)){
            System.out.println(input+" is a palindrome");
        }else{
            System.out.println(input+" is not a palindrome");
        }
        
    }
}