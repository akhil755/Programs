import java.util.Arrays;
import java.util.Collections;
public class SortsCharArray{
    public static void main(String[] args){
        char[] chars = {'d','B','c','F','a'};
        Character[] boxedChars = new Character[chars.length];
        for(int i=0; i<chars.length; i++){
            boxedChars[i]=chars[i];
        }
        Arrays.sort(boxedChars, Collections.reverseOrder());
        System.out.println(Arrays.toString(boxedChars));
    }
}