//WAP to find area of circle and display result with 2-digit precision
public class PrecisionDemo {

	public static void main(String[] args) {
		double r= Double.parseDouble(args[0]);
		double area=Math.PI *r*r;
		System.out.printf("Area=%2f", area);
		

	}

}
