package MyPractice;
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputNoStr = sc.nextLine();
		int inputNo = Integer.parseInt(inputNoStr);
		int backUpNo = inputNo;
		int remainder = 1;
		int sumOfEachNo = 0;
		while(inputNo!=0) {
			remainder = inputNo%10;
			sumOfEachNo = sumOfEachNo + (remainder * remainder * remainder);
			inputNo = inputNo/10;
		}
		
		if(sumOfEachNo==backUpNo)
			System.out.println(backUpNo + " is a armstrong number");
		else
			System.out.println(backUpNo + " is not a armstrong number");
	}

}
