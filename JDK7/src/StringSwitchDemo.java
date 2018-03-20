
public class StringSwitchDemo {
	public static void main(String[] args) {
		String season = "Summer";
		
		switch (season) {
		case "Summer":
			System.out.println("Its Summer");
			break;
		
		case "summer":
			System.out.println("Its summer");	
			break;
		default:
			System.out.println("Wrong value");
			break;
		}
	}
}
