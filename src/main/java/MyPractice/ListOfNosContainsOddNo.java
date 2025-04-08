package MyPractice;

public class ListOfNosContainsOddNo {

	public static void main(String[] args) {
		int[] inputList = {11,13,17,15};
		Boolean isEvenPresent = false;
		
		for(int i=0; i<inputList.length; i++) {
			if(inputList[i]%2 == 0) {
				isEvenPresent = true;
				break;
			}
		}
		
		if(isEvenPresent == false)
			System.out.println("All numbers in the list are odd.");
		else
			System.out.println("All numbers in the list are not odd.");
	}
}
