
public class Practice_git {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Welcome to GitHub...");
		System.out.println("hi this velocity student");
		 int maxNumber = 10, previousNumber = 0, nextNumber = 1;
	        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");

	        int i=1;
	        while(i <= maxNumber)
	        {
	            System.out.print(previousNumber+" ");
	            int sum = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = sum;
	            i++;
	        }
		
	}

}
