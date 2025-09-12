public class RemoveSpacesFromString{

	public static void main(String[] args){

		String input = "This is a test String";
		String result = removeSpaces(input);
		System.out.println(result);
	}

	public static String removeSpaces(String input){

		StringBuilder sb = new StringBuilder();

		char[] charArray = input.toCharArray();

		for(char c : charArray()){
			if(c!=' '){
				sb.append(c);
			}
		}
		return sb.toString();
	}
}