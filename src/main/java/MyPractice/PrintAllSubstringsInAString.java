package MyPractice;

public class PrintAllSubstringsInAString {

	public static void main(String[] args) {
		
		String input = "java";
		
		for(int i=0; i<input.length();i++) {
			for(int j=i+1; j<=input.length();j++) {
				String subString = input.substring(i, j);
				System.out.println(subString);
			}
		}
	}
}










//int[] input = {4,7,9};
//int[] reverseInput = new int[input.length];
//
//for(int i=0; i< input.length; i++) {
//	reverseInput[i] = input[input.length-i-1];
//}
//
//for(int j=0; j<reverseInput.length;j++) {
//	System.out.println("reverse order is "+ reverseInput[j]);
//}