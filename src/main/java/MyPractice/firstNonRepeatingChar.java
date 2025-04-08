package MyPractice;

import java.util.HashMap;
import java.util.Map;

public class firstNonRepeatingChar {
	
	public static void main(String[] args) {
		String str = "aabebccddef";
		char[] charStr = str.toCharArray();
		Map<Character, Integer> charAndReps = new HashMap<Character, Integer>();
		for(int i =0;i<charStr.length; i++) {
			if(charAndReps.containsKey(charStr[i])) {
				int count = charAndReps.get(charStr[i]);
				count++;
				charAndReps.put(charStr[i], count);
			}else
				charAndReps.put(charStr[i], 1);
		}
		
		for(Character chr: charAndReps.keySet()) {
			if(charAndReps.get(chr)==1) {
				System.out.println("first non repeatable character is = "+ chr);
				break;
			}
		}
	}
}
