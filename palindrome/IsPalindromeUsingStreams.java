import java.util.stream.IntStream;

public class IsPalindromeUsingStreams{
    public static void main(String [] args){
        String input = "madammadam";
        boolean isPalindrome = IntStream.range(0,input.length()/2).allMatch(i->input.charAt(i) == input.charAt(input.length()-i-1));
        
        System.out.println(input+" is palindrome ? "+ isPalindrome);
        
    }
}