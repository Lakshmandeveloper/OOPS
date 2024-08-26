
public class MethodOverLoadDemo {
		void add(int a) {
			System.out.println(a+a);
		}
		void add(int a,int b) {
			System.out.println(a+b);
		}
		void add(float a,float b) {
			System.out.println(a+b);
		}
		void add(int a,float b) {
			System.out.println(a+b);
		}
		
		public static void main(String args[])
		{
			MethodOverLoadDemo obj=new MethodOverLoadDemo();
			obj.add(10);
			obj.add(10,20);
			obj.add(4.5f,5.5f);
			obj.add(10,4.5f);
		}
	}
		

	