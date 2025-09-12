import java.util.Stack;


public class StringReversalWithStack{

	public static void main(String [] args){

		String str = "interview";
		String reversed = reversString(str);
		System.out.println(reversed);
	}

	public static String reversString(String input){

		Stack<Character> charStack = new Stack<>();
		for(char c : input.toCharArray()){
			charStack.push(c);
		}

		StringBuilder sb = new StringBuilder();
		while(!charStack.isEmpty()){
			sb.append(charStack.pop());
		}
	return sb.toString();
	}
}