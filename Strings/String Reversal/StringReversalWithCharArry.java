public class StringReversalWithCharArry{

	public static void main(String []args){

		String str = "sai";
		

	

		if(str==null)
			throw new IllegalArgumentException("Null is not a valid input");

		StringBuilder sb = new StringBuilder();

		char[] chars = str.toCharArray();
		
		for(int i=chars.length-1; i>=0; i--)
			sb.append(chars[i]);
		System.out.println(sb);
		
	}
}