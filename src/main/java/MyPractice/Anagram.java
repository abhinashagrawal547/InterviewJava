package MyPractice;

public class Anagram {

	public static void main(String[] args) {
		String a = "silenk";
        String b = "listen";
        Anagram(a, b);
	}
	
	public static void Anagram(String a, String b)
	{
		char[] c = a.toCharArray();
		char[] d = b.toCharArray();
		
		boolean anyCharNotFound = false;
		
		for (Character e : c) {
			for (Character f : d) {
				if(e==f)
				{
					anyCharNotFound = true;
					break;
				}else
					anyCharNotFound = false;
			}
			
			if(anyCharNotFound == false)
			{
			    System.out.println("Not an anagram");
			    break;
			}
		}
		
		if(anyCharNotFound == true)
			System.out.println("String is an anagram");
	}
}
