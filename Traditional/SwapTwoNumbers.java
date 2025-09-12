public class SwapTwoNumbers {

	public static void main(String[] args) {

		int a = 3;
		int b = 4;

		a = a+b;
		b = a-b;
		a = a-b;

		System.out.println("after swapping a is "+a+" and b is "+b);
	}
}