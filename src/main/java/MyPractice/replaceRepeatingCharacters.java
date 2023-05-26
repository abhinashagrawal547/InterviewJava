package MyPractice;

public class replaceRepeatingCharacters {

	public static void main(String[] args) {
		String str = "Abhinash Agrawal Working in Publicis sapient";
		char[] allChars = str.toCharArray();
		for(int i=0; i<allChars.length; i++){
			for(int j=i+1; j<allChars.length; j++){
				if(allChars[i]==allChars[j])
					allChars[j] = '@';
			}
		}
		String finalOP = new String(allChars);
		System.out.println(finalOP);
	}
}
