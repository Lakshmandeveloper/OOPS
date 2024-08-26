
public class OverLoadMain {
	public static void main() {
		System.out.println("zero args main()");
		
	}

	public static void main(String[] args) {
		System.out.println("String args main()");
		OverLoadMain p=new OverLoadMain();
		p.main();
		p.main(10,20);

	}
	public static void main(int a,int b) {
		System.out.println("two  args main()");

}

}