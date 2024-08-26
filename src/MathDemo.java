
public class MathDemo {

	public static void main(String[] args) {
		//members
		System.out.println(Math.PI);
		System.out.println(Math.E);
		//methods
		System.out.println(Math.sqrt(25));
		System.out.println(Math.cbrt(125));
		System.out.println(Math.pow(2,3));
		System.out.println(Math.abs(-4));
		System.out.println(Math.exp(1));
		System.out.println(Math.log(10));
		System.out.println(Math.log10(10)); 
		System.out.println(Math.min(10,20));
		System.out.println(Math.max(10,20));
		System.out.println(Math.ceil(3.4));
		System.out.println(Math.floor(3.4));

		System.out.println(Math.round(3.4));//3
		System.out.println(Math.round(3.6));//4
		//random(): Generates random number between 0.0 to 1.0(exclusive)
				System.out.println(Math.random());		
				//values must be in radians
				System.out.println(Math.sin(30*Math.PI/180));
		
		
	}

}
