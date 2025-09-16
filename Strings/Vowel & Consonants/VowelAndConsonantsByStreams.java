import java.util.Scanner;

public class VowelAndConsonantsByStreams{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("enter a string");
        String input = scanner.nextLine();
        
        long vowelsCount = input.chars().filter(c->"aeiou".indexOf(c)!=-1).count();
        
        long consonantCount = input.chars().filter(c-> c>='a' && c<='z' && "aeiou".indexOf(c)==-1).count();
        
        System.out.println("vowels"+vowelsCount+" consonants "+consonantCount);
    }
}