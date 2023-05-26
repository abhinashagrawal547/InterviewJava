
public class SwapTwoNoWithoutThirdVariable {

	public static void main(String[] args) {
		int firstVar = 5;
		int secVar = 10;
		
		firstVar = firstVar + secVar;
		secVar = firstVar - secVar;
		firstVar = firstVar - secVar;
		
		System.out.println("first variable value is = "+firstVar + " and second variable value is = "+ secVar);
	}

}
