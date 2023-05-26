package MyPractice;
import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int inputInt = Integer.parseInt(input);
		int copyOfInput = inputInt;
		boolean isPalindrome = true;
		
		ArrayList<Integer> inputArr = new ArrayList<Integer>(); 
		
		while(inputInt%10 != 0) {
			int remainder = inputInt%10;
			inputArr.add(remainder);
			inputInt = inputInt / 10;
		}
		
		System.out.println(inputArr);
		
		for(int i=0; i<inputArr.size() / 2; i++) {
			if(inputArr.get(i) != inputArr.get(inputArr.size() - i - 1)) {
				System.out.println(input + " is not a palindrome");
				isPalindrome = false;
				break;
			}
		}
		
		if(isPalindrome == true)
			System.out.println(input + " is a palindrome");
	}

}
