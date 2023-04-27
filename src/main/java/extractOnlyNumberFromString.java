import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extractOnlyNumberFromString {

	public static void main(String[] args) {
		String input = "mahesh234";
		Pattern ptr = Pattern.compile("[0123456789]");
		Matcher mtr = ptr.matcher(input);
		while(mtr.find())
			System.out.println(mtr.group());
	}
}
