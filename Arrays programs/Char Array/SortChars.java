import java.util.Arrays;
class SortChars {
    public static void main(String[] args) {
        char[] chars = {'d','B','c','F','a'};
        
        Character[] boxedchars = new Character[chars.length];
        for(int i=0; i<chars.length; i++){
            boxedchars[i]=chars[i];
        }
        Arrays.sort(boxedchars, (c1,c2)->
        Character.toLowerCase(c1)-Character.toLowerCase(c2));
        System.out.println("Case Sorted array: "+Arrays.toString(boxedchars));
        System.out.println("Original Array: "+Arrays.toString(chars));
        Arrays.sort(chars);
        System.out.println("just sorted: "+Arrays.toString(chars));
    }
}