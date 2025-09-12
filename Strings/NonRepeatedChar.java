import java.util.Map;
import java.util.LinkedHashMap;

public class NonRepeatedChar{

	public static void main(String []args){

		String input = "its a small world";
		char result = nonRepeatCharacter(input);
		if(result != '\0'){
			System.out.println("non repeated character from " +input+ " is :" +result);
		}
		else{
			System.out.println("Every Character is repeated");
		}
	}

	public static char nonRepeatCharacter(String input){
		Map <Character, Integer> charCount = new LinkedHashMap<>();
		for (char c : input.toCharArray()){
			charCount.put(c, charCount.getOrDefault(c,0)+1);
		}

		for(char c : input.toCharArray()){
			if(charCount.get(c)==1){
				return c;
			}
		}
		return '\0';
	} 
}