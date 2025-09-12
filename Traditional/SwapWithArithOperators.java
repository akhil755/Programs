public class SwapWithArithOperators{
  public static void main(String[] args) {
    int x = 1;
    int y = 2;

    System.out.println("Before swapping: x = " + x + " y = " + y);

    // Swap the numbers using addition and subtraction
    x = x * y; // x is now 3
    y = x / y; // y is now 1
    x = x / y; // x is now 2

    System.out.println("After swapping: x = " + x + " y = " + y);
  }
}