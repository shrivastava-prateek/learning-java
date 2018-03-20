package lambdaexpression;

public class TestLambda {
	public static void main(String[] args) {
		Test test = () -> { throw new Exception(); };
		
		try {
			test.m1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
