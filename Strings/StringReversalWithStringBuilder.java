public class StringReversalWithStringBuilder{

	public static void main(String []args){
		String str = "venky";
		StringBuilder reversedString = new StringBuilder();

		reversedString.append(str);
		reversedString = reversedString.reverse();

		System.out.println(reversedString.toString());
	}
}