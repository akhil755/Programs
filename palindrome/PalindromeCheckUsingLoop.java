import java.util.Scanner;

public class PalindromeCheckUsingLoop{
    
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter a String");
        String input = s.nextLine();
        boolean isPalindrome = isPalindrome(input);
        
        if(isPalindrome){
            System.out.println(input+" is a palindrome");
        }else{
            System.out.println(input+" is not a palindrome");
        }
    }
        
    public static boolean isPalindrome(String str){
        int n = str.length();
        for(int i=0; i<n/2; i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
        
        
}