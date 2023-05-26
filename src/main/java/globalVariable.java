import java.util.Properties;

public class globalVariable {

	public static void main(String[] args) {
		Properties props = new Properties();
		props.setProperty("xyz", "abc");
		System.out.println(props.get("xyz"));
	}

}
