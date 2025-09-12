import java.util.Arrays;
import java.util.Collections;
class CharsReverseSortFromArray {
    public static void main(String[] args) {
        char[] chars = {'d','B','c','F','a'};
        
       Character[] boxedchars = new Character[chars.length];
       for(int i=0; i<chars.length; i++){
           boxedchars[i]=chars[i];
       }
       Arrays.sort(boxedchars, Collections.reverseOrder());
       for(int i=0; i<chars.length; i++){
           chars[i]=boxedchars[i];
       }
       System.out.println("reverse sorted array: "+Arrays.toString(chars));
       
    }
}