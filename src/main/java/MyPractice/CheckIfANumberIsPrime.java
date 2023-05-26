package MyPractice;

// * primes are integers greater than one with no positive divisors besides one and itself. Negative numbers are excluded * //

public class CheckIfANumberIsPrime {
	
	public static void main(String[] args) {
		int inputNumber = 1;
		
		if(inputNumber <= 1) {
			System.out.println("Invalid input. Number should be greater than 1");
			return;
		}
		
		for(int i=2; i< inputNumber; i++) {
			if(inputNumber % i == 0) {
				System.out.println(inputNumber + " is not a prime number");
				return;
			}
		}
		System.out.println(inputNumber + " is a prime number");
	}
}