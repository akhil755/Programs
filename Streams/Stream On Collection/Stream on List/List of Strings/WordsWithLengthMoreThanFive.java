
import java.util.List;
public class WordsWithLengthMoreThanFive{
    public static void main(String[] args){
        List<String> words = List.of("words","with","letters","morethan");
        long wordswithlength = words.stream().filter(word->word.length()>5).count();
        System.out.println(wordswithlength);
    }
}