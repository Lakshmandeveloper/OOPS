
public class VariableArguments {
	static void disp(int ...v) {
		for(int i:v) 
			System.out.print(i+" ");
		System.out.println();
	}
	

	public static void main(String[] args) {
		disp();
		disp(10);
		disp(10,20);
		disp(10,20,30);
		

	}

}
