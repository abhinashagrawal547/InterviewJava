package MyPractice;

public class FibonacciSeries {

	public static void main(String[] args) {
		int no1 = 0;
		int no2 = 1;
		int temp = 0;
		int inputNumber = 10;
		
		if(inputNumber < 2) {
			System.out.println("Enter a valid input. Input value should be minimum 2.");
			return;
		}
		System.out.println(no1);
		System.out.println(no2);
		
		for(int i=1; i<= inputNumber-2; i++) {
			System.out.println(no1 + no2);
			temp = no1;
			no1=no2;
			no2 = temp + no2;
		}
	}
}
