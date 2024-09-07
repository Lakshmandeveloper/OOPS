interface Product
{
	public abstract String getName();
	public abstract int getQuantity();
	public abstract double getPrice();
}
class Oil implements Product
{
	String name;
	int quantity;
	double price;
	Oil(String name,int quantity,double price){
		this.name=name;
		this.quantity=quantity;
		this .price=price;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public int getQuantity() {
		// TODO Auto-generated method stub
		return quantity;
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	
}
public class InterfaceDemo1 {

	public static void main(String[] args) {
		Oil p=new Oil("Olive oil",10,45.4);
		System.out.println("Name:"+p.getName());
		System.out.println("Quantity :"+p.getQuantity());
		System.out.println("price:"+p.getPrice());
		

	}

}
