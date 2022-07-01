package oopsdemo1;

public class ConstructorDemo {
	int id;
	String name;
	float salary;
	
	ConstructorDemo() //Implicit Constructor
	{
		System.out.println("Iam Implicit Constructor");
		id=101;
		name="Mike";
		salary=5000.00f;
	}
		//generate Constructor with arguments
	//in a new line Right Click -> source -> generate Constructor using Fields ->select all -> Generate button
	
	public ConstructorDemo(int id, String n, float salary)//Parameterized Constructor
	{
		System.out.println("Iam Parameterized Constructor");
		this.id=id;
		this.name=n;
		this.salary=salary;
	}
	
	void display()
	{
		System.out.println(this.id+" "+this.name+" "+this.salary);
	}
	
	public static void main(String[] args) {
		
		ConstructorDemo cd1=new ConstructorDemo(); //invokes implicit
		ConstructorDemo cd2=new ConstructorDemo(102,"John",6000.00f);//invokes parameterized
		ConstructorDemo cd3=new ConstructorDemo();
		
		cd1.display();
		cd2.display();
		cd3.display();
	}

}
