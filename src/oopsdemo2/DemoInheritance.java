package oopsdemo2;


class Father
{
	private int id;
	private String name;
	private  String cars;
	private double bankBalance;
	
	public Father(int id, String name, String cars, double bankBalance) {
		super();
		this.id = id;
		this.name = name;
		this.cars = cars;
		this.bankBalance = bankBalance;
	}
	
	void display()
	{
		System.out.println(id +" "+name);
	}
	
	
	
	
}
public class DemoInheritance {

	public static void main(String[] args) {
		

	}

}
