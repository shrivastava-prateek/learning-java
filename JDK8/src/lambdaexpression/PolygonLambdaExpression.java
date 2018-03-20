package lambdaexpression;

public class PolygonLambdaExpression {
	
	public static void main(String[] args) {
		Polygon square = (s) -> {System.out.println("Area of square: "
					+ s[0]*s[0]);  };
		Polygon rectangle = (s) -> {System.out.println("Area of rectangle: "
					+ s[0]*s[1]);  };
		
		square.calcArea(10);
		rectangle.calcArea(12.23,10.23);
	}
}
