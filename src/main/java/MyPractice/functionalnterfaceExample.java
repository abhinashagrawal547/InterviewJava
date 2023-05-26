package MyPractice;
import java.util.function.Predicate;

public class functionalnterfaceExample {
	public static void main(String[] args) {
		Predicate<Integer> isEven = number -> number % 2 == 0;
		
		System.out.println(isEven.test(6));
		System.out.println(isEven.test(11));
	}
}