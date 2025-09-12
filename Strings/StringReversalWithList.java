import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class StringReversalWithList{

	public static void main(String [] args){

		String str = "Akhil";
		System.out.println("String before reversal :" +str);
	
		String reversed = reversString(str);
		System.out.println("String after reversal :" +reversed);
	}

	public static String reversString(String input){

		List<Character> charList = new ArrayList<>();
		for (char c : input.toCharArray()){
			charList.add(c);
		}

		Collections.reverse(charList);
		StringBuilder sb = new StringBuilder(charList.size());
		for(char c : charList){
			sb.append(c);
		}
		
		return sb.toString();
	}
}