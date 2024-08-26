
public class BeanClass {
	int a,b;
	void setA(int a) {
		this.a=a;
	}
	int getA() {
		return a;
	}
	void setB(int b) {
		this.b=b;
	}
	int getB() {
		return b;
	}
	void add() {
		System.out.println(getA()+getB());
	}
	void sub() {
		System.out.println(getA()-getB());
	}

	public static void main(String[] args) {
		BeanClass p =new BeanClass();
		p.setA(100);
		p.setB(200);
		p.add();
		p.sub();
	}

}
