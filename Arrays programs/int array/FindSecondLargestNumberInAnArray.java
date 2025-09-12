public class FindSecondLargestNumberInAnArray{
    public static void main(String[] args){
        int[] numbers = {-4,1,3,5,7,4,2};

	
        int largest = Integer.MIN_VALUE; // here, the constant(largest) MIN_VALUE is not -4 or 1 but -2147483648 as MIN_VALUE is already defined in Integer class.
        int secondLargest = Integer.MIN_VALUE; //here, the constant(secondLargest) MIN_VALUE is not -4 or 1 but -2147483648 as MIN_VALUE is already defined in Integer class.        
	for(int num : numbers){
            if(num>largest){
                secondLargest = largest;
                largest=num;
            }
            if(num!=largest && num>secondLargest){
                secondLargest = num;
            }
        }
        System.out.println("SecondLargest number is "+secondLargest);
    }
}