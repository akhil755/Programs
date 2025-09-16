import java.util.Scanner;

public class VowelsAndConsonants{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a String");
        String input = scanner.nextLine();
        int vowels=0,consonants=0;
        input = input.toLowerCase();
        
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(Character.isLetter(ch)){
                if("aeiou".indexOf(ch)!=-1){
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }
        System.out.println("vowels "+vowels+" and consonants "+consonants);
    }
}