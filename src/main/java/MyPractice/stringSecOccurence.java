package MyPractice;

public class stringSecOccurence {

	public static void main(String[] args) {
		String input = "tomorrow";
		int occurenceCount = 0;
		char[] inCharArr = input.toCharArray();
		for(int i=0;i<inCharArr.length;i++) {
			if(inCharArr[i]=='o')
				occurenceCount = occurenceCount + 1;
			
			if(occurenceCount==2) {
				inCharArr[i] = '$';
				break;
			}
		}
		
		String finalStr = new String(inCharArr);
		System.out.println(finalStr);
	}

}
